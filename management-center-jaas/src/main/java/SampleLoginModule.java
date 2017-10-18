import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;


public class SampleLoginModule implements LoginModule {


    private Subject subject;
    private String password;
    private String username;
    public Map<String, List<String>> userMap;


    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
        this.subject = subject;

        userMap = new HashMap();
        String csvFile = "/opt/users.csv";
        String line = "";
        String cvsSplitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] user = line.split(cvsSplitBy);
                userMap.put(user[0], Arrays.asList(user[1], user[2]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            NameCallback nameCallback = new NameCallback("prompt");
            PasswordCallback passwordCallback = new PasswordCallback("prompt", false);

            callbackHandler.handle(new Callback[]{nameCallback, passwordCallback});

            password = new String(passwordCallback.getPassword());
            username = nameCallback.getName();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean login() throws LoginException {

        if (!userMap.containsKey(username)) {
            throw new LoginException("Bad User");
        }

        if (!userMap.get(username).contains(password)){
            throw new LoginException("Bad Password");

        }

        subject.getPrincipals().add(new Principal() {
            public String getName() {
                return username;
            }
        });

        subject.getPrincipals().add(new Principal() {
            public String getName() {
                return userMap.get(username).get(1);
            }
        });

        return true;
    }

    @Override
    public boolean commit() throws LoginException {
        return true;
    }

    @Override
    public boolean abort() throws LoginException {
        return true;
    }

    @Override
    public boolean logout() throws LoginException {
        return true;
    }
}
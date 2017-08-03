<h1>Hazelcast Management Center TLS Authentication Sample</h1>

In this repository, you can find a sample implementation of authenticating Hazelcast Management Center with TLS.

<h2>Prerequisites</h2>

You should have installed Docker on your System.

<h2>How to Run Sample Application</h2>

1. Clone repo into the local.
 
 `git clone https://github.com/hazelcast/hazelcast-docker-samples.git`

2. Go to directory;

`cd hazelcast-docker-samples/management-center-ldap-tls/`

3. Launch the application using the Docker command. 

`docker-compose up`

4. Open a browser and enter:
 
 `http://localhost:8080/mancenter`

5. Login with this credentials;

Username: `guest` Password: `password`


<h2>Use Your Own Data</h2>

You can set your own OpenLDAP configuration by editing files under `openldap/files/`

After configuration you should build the image with Docker command;

`docker build -t <image-name>`

Edit `docker-compose.yml` file and add your image name;
 
 `image: <image-name>`


<h3>TLS Configuration</h3>

By default, TLS is already configured but you can use your own certificate.

1. Add your certificates (Certificate name should be same with the sample certificates);
 
 `openldap/ssl/certs`
 
2. Add your truststore.
 
 `management-center-ldap-tls/`
 
3. Edit `docker-compose.yml` file and add your truststore password;
 
 `-Djavax.net.ssl.trustStorePassword= <password>`
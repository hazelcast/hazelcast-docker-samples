<h2>Spring Boot: Hazelcast for Session Replication</h2>

[Test1]: src/site/markdown/images/Test1.png "Image Test1.png"
[Test2]: src/site/markdown/images/Test2.png "Image Test2.png"
[Test3]: src/site/markdown/images/Test3.png "Image Test3.png"

This project is prepared to serve as a sample application for Hazelcast, the leading open source in-memory data grid. Here, Hazelcast's use case is Spring Boot HTTP Session Replication.

<h2>Requirements</h2>

You should have installed Docker and Apache Maven on your system.

<h2>How to Run Sample Application</h2>

1. Clone repo into the local;
 
`git clone https://github.com/hazelcast/hazelcast-docker-samples.git`
 
2. Go to directory;

`cd hazelcast-docker-samples/springboot-http/`

3. Run `run.sh` shell file from terminal.

4. Open a browser and enter;
 
`http://localhost:8080/example`


<h2>Test</h2>

1. Somewhere in the log output you should see output like this, to confirm the two processes have found each other and formed a cluster of two:

```
 Members [2] {
         Member [172.22.0.3]:5701 - 2ed482aa-0bcd-458e-931e-552da319a726
         Member [172.22.0.4]:5701 - 2ece8c21-76da-4cd7-ac9c-95cb2d94055f
}
```

2. In a browser, navigate to the URL for Nginx Load Balancer Portal, `http://localhost:8080/example`

![Image of a web page showing a hit counter of 1][Test1] 

The first time the page is shown you should see something like this showing the session id and hit counter. Also, there is a report on which Hazelcast cluster process you are using, the one on Hazelcast ip 172.22.0.4.


3. Refresh the page a few times and the hit counter goes up in the logs:

```
tomcatServerTwo_1  | c.h.springboot.http.WebController        : index() called, hits was '1', session id 'B83B8FEBA228DD8074A1D66ABDDB692F'
tomcatServerTwo_1  | c.h.springboot.http.WebController        : index() called, hits was '2', session id 'B83B8FEBA228DD8074A1D66ABDDB692F'
tomcatServerTwo_1  | c.h.springboot.http.WebController        : index() called, hits was '3', session id 'B83B8FEBA228DD8074A1D66ABDDB692F'
tomcatServerTwo_1  | c.h.springboot.http.WebController        : index() called, hits was '4', session id 'B83B8FEBA228DD8074A1D66ABDDB692F'
```

and on screen:

![Image of a web page showing a hit counter of 4][Test2] 


4. Now kill off the Docker container for the Tomcat instance you are currently using.


```
docker stop <container-id>
```

Logs:


```
springboothttp_tomcatServerTwo_1 exited with code 143
tomcatServerOne_1  | [cached.thread-4] c.h.t.TransactionManagerService          : [172.22.0.3]:5701 [dev] [3.9-SNAPSHOT] Committing/rolling-back alive transactions of client, UUID: 5cd3c1df-3595-4b31-b5fc-f4282362c416
```

5. Finally, refresh the browser once more.

![Image of a web page showing a hit counter of 5][Test3] 

The session is still available, and the hit counter has advanced by one more to 5. The cluster member in the Tomcat process is using Hazelcast ip 172.22.0.3.

If one process crashes, you can keep going use the survivors. The end user doesn’t need to be affected.




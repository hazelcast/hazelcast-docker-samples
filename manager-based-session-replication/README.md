<h2>ABOUT</h2>
This project is prepared to serve as a sample application for Hazelcast, the leading open source in-memory data grid . Here, Hazelcast's use case is HTTP Session Replication. 

<h2>Requirements</h2>
You should have installed Docker and Apache Maven on your system.

<h1>Build</h1>

1. Clone repo into the local - `git clone https://github.com/hazelcast/hazelcast-docker-samples.git`

2. Go to directory - `cd hazelcast-docker-samples/manager-based-session-replication/`

3. Create war file for example - Run `buildApp.sh` shell file from terminal.


 
<h3>Tomcat Configuration</h3>

<h4>P2P Deployment</h4>
1. Navigate to directory `tomcat-p2p-manager-based-session-replication` and run `run.sh` shell file from terminal.
2. Open a browser and enter `localhost:8080/example/hazelcast`

<h4>Client-Server Deployment</h4>

1. Navigate to directory `tomcat-client-manager-based-session-replication` and run `run.sh` shell file from terminal.
2. Open a browser and enter `localhost:8080/example/hazelcast`


<h3>Jetty Configuration</h3>

<h4>P2P Deployment</h4>
1. Navigate to directory `jetty-p2p-manager-based-session-replication` and run `run.sh` shell file from terminal.
2. Open a browser and enter `localhost:8080/example/hazelcast`

<h4>Client-Server Deployment</h4>

1. Navigate to directory `jetty-client-manager-based-session-replication` and run `run.sh` shell file from terminal.
2. Open a browser and enter `localhost:8080/example/hazelcast`


<h2>ABOUT</h2>
This project is prepared to serve as a sample application for Hazelcast, the leading open source in-memory data grid . Here, Hazelcast's use case is HTTP Session Replication. 

<h2>Requirements</h2>
You should have installed Docker and Apache Maven on your system.

<h1>Build</h1>
1. `git clone https://github.com/hazelcast/hazelcast-docker-samples.git` - Clone repo into the local.
2. `cd hazelcast-docker-samples/filter-based-session-replication/`
3. Run `buildApp.sh` shell file from terminal. - Create war file for example.

<h1>Tomcat Deployment</h1>
1. Navigate to directory `tomcat-deployment` and run `run.sh` shell file from terminal.
2. Open a browser and enter `http://localhost:8080/session-replication/hazelcast`

<h1>Jetty Deployment</h1>
1. Navigate to directory `jetty-deployment` and run `run.sh` shell file from terminal.
2. Open a browser and enter `http://localhost:8080/session-replication/hazelcast`


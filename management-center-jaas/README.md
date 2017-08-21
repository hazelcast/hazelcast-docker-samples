<h1>Hazelcast Management Center JAAS Authentication Sample</h1>

In this repository, you can find a sample implementation of authenticating Hazelcast Management Center with JAAS.

<h2>Prerequisites</h2>

You should have installed Docker and Apache Maven on your System.

<h2>How to Run Sample Application</h2>

1. Clone repo into the local;
 
 `git clone https://github.com/hazelcast/hazelcast-docker-samples.git`

2. Go to directory;

`cd hazelcast-docker-samples/management-center-jaas/`

3. Build Maven project;

`mvn package`

4. Launch the application using the Docker command;

`docker-compose up`

5. Open a browser and enter;
 
 `http://localhost:8080/mancenter`

6. Login with this credentials;

Username: `admin` Password: `pass1`


<h2>Use Your Own Data</h2>

You can set your own CSV configuration by editing files under `resources/`

After configuration you should launch the image with Docker command;

`docker-compose up`


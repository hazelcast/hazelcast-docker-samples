# Hazelcast Management Center With Built-In User Sample

In this repository, you can find a sample Docker image for Hazelcast Management Center with a built-in user account.

## Prerequisites

You should have installed Docker on your System.

## How to Build and Run Sample Image

1. Clone repo into the local.
 
 `git clone https://github.com/hazelcast/hazelcast-docker-samples.git`

2. Go to directory;

`cd hazelcast-docker-samples/management-center-built-in-user/`

3. Build the image using the Docker command.

`docker build -t mc-built-in-user .`

4. Launch a container using the Docker command.

`docker run -p 8080:8080 mc-built-in-user`

5. Open a browser and enter:

`http://localhost:8080/hazelcast-mancenter`

5. Login with this credentials:

Username: `admin` Password: `p@ssw0rd`

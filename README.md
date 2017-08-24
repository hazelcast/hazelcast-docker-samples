<h1>Hazelcast Docker Code Samples</h1>

[Logo1]: Logo1.png "Image Logo1.png" 
[Logo2]: Logo2.png "Image Logo2.png" 

Table of Contents

- [Requirements](#requirements) 

- [Docker Compose](#docker-compose)

- [Hazelcast Docker Code Samples](#hazelcast-docker-code-samples)

    ![Hazelcast Logo][Logo1] ![Compose Logo][Logo2]


<h2>Requirements</h2>

You should have installed [Docker](https://www.docker.com/), [Apache Maven](https://maven.apache.org/) and at least JDK 1.8 on your system.

<h2>Official Images</h2>

You can find [officially supported images](https://hub.docker.com/u/hazelcast/) in Docker Hub.

<h2>Docker Compose</h2>

> Compose is a tool for defining and running multi-container Docker applications. With Compose, you use a Compose file to configure your application's services. Then, using a single command, you create and start all the services from your configuration. To learn more about all the features of Compose see [Documentation](https://docs.docker.com/compose/).

The `docker-compose` command will pull the images from Docker Hub and then link them together based on the information inside the `docker-compose.yml` file. This will create ports, links between containers, and configure applications as required. After the command completes you can view the status of container with command `docker-compose ps`.


<h2>Hazelcast Docker Code Samples</h2>

This repository contains an extensive collection of code samples which you can use to learn how to use Hazelcast features in Docker environment. Each sample includes a dedicated `README.md` file where you can find detailed instructions.

- <h3>filter-based-session-replication</h3>
	
    Implementation of session replication integration of Hazelcast.

- <h3>hibernate-2ndlevel-cache</h3>
	
    Implementation of hibernate 2nd level cache integration of Hazelcast as employee managing application.

- <h3>jca-ra</h3>
	
    Implementation of jca resource adapter integration of Hazelcast.

- <h3>manager-based-session-replication</h3>
    
    Implementation of tomcat/jetty session replication integration of Hazelcast.

- <h3>hibernate-jpa-2ndlevel-cache</h3>

    Implementation of hibernate 2nd level cache with Hazelcast by using JPA.
    
- <h3>management-center-ldap</h3>
    
    Implementation of authenticating Hazelcast Management Center with LDAP.
    
- <h3>management-center-ldap-tls</h3> 
    
    Implementation of authenticating Hazelcast Management Center with TLS.

- <h3>management-center-jaas</h3> 
    
    Implementation of authenticating Hazelcast Management Center with JAAS.
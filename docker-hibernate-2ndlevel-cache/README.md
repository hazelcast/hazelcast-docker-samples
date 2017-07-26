<h1>Hibernate 2nd Level Cache with Hazelcast</h1>
In this repository, you can find a sample implementation of hibernate 2nd level cache with hazelcast. You can also find detailed explanation at http://hazelcast.org/ 

<h2>Prerequisites</h2>
You should have installed Docker on your system.

By default "hibernate-core" added to project in "pom.xml" file as follows:
```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>4.3.8.Final</version>
</dependency>
```
But project is also compatible with hibernate 3.X.X versions. You can change these entries accordingly.

<h2>How to Run Sample Application</h2>
1) Build project image using:

```
docker build -t hazelcast-2ndlevel-cache .
```
2) Create database using:
```
docker run -it --rm  hazelcast-2ndlevel-cache bash "./run.sh"
```
<h3>Sample Use Case</h3>
Execute the following commands in ManageEmployee. You will see that an employee will be created at the second session but you can see it in the first session too.

```
[1. session]command: list
[1. session]command: change
[2. session]command: add
Id: 1
First Name: Name
Last Name: Surname
Salary: 100
[2. session]command: close
[2. session]command: change
[1. session]command: list
Id: 1 First Name: Name Last Name: Surname Salary: 100
```


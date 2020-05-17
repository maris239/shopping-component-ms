Solutions
---------
1) Good Test coverage
---------------------
Solution is unit tested strongly with,

JUnit, 
Mockito and 
AssertJ

2) The app does't lose message if the database connections goes down
--------------------------------------------------------------------
JMS Broker ActiveMQ ensures delivery of messages regardless the consistency of database connection. If any exception occurred inside the listener message will not be acknowledged and redeliver to the client again. If the message is unable to be persisted configured number of times, it will move to a Dead Queue in the ActiveMQ. That message will be persisted for further manual inquiries.

Refer to the listener implementation ItemSelectMessageReceiveService.java
maximumRedeliveries are configurable as demonstrated in application-standalone.properties

3) The app is able to auto create table if the table doesn't exist in database
------------------------------------------------------------------------------
Application uses JPA and default spring-hibernate configuration therefore it doesn't expect a schema to be existed. While app generates schema on startup if doesn't exist it also loads test data with the help of data.sql.

4) Self healing from database issue without human intervention
--------------------------------------------------------------
No human intervention is required for database. In production database shall be run in a cluster for better availability and scalability.

5) Good fault tolerate
----------------------
Several replicas/nodes of this microservice shall be configured to run in production with the support of orchestration tools such as DockerSwarm or Kubernetes. In a failure of one or more nodes still the system is capable of running. Because of the usage of Message Queue messages will be processed consistently when a node becomes available.

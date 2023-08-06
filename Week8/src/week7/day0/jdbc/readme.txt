1. https://dev.mysql.com/downloads/connector/j/
2. Select Operating System: Platform Independent
3. No thanks, just start my download.
4. mysql-connector-j-8.0.32.zip -> mysql-connector-j-8.0.32.jar
5. Create a folder mylibs in Src folder and paste mysql-connector-j-8.0.32.jar
6. Right Click on Project -> Build Path -> Configure Build Path -> Libraries (Tab) -> Add JARs
7. Browse and Select  mysql-connector-j-8.0.32.jar file from mylibs folder of current project
8. Click on OK, Apply and Close
9. Browse the Referenced Library and Explore the mysql-connector-j-8.0.32.jar

Note:
- Create a database : level4c
- Create a table : persons (pid (*), name, address)
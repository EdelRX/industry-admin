# industry-admin
Spring Boot application with Spring Integration flows, RESTful interface, and MySQL database

An HTTP REST interface receives petitions to add an industry item to the SQL database. A Spring Integration flow drives the petition through a transformation stage for data preparation 
and to a handler stage that includes the item to the database by means of JPARepository.

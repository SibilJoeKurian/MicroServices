# MicroServices

In this project it contains three microservices and they are movie catalog service, movie info service and rating data service. In this, Movie catlog service will get data from movie info service and rating data service. These are developed in spring boot and for the service discovery here I used REST template. The three microservices are containerized and an image created in docker. I had created a jenkins job to watch this repository and whenever there is a commit is made. It will automatically execute maven install lifecycle.

One of the microservice can be pulled form docker hub and run using the below command:
docker pull sibiljoekurian/movie-catlog-service.jar

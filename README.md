# springboot-opentelemetry-tempo-grafana

To run: Download the the gitrepo and run “docker compose up –build” 

Grafana : localhost:3000
ms-one(microservice-one): localhost:8080
ms-two(microservice-two): localhost:8081



Send post request to http://localhost:8080/customer using Postman with data: {"customerName":"Harry"}

Send get request to http://localhost:8080/getCustomer?id=1 to get that data. Using postman

Send get request to http://localhost:8080/helloFromMS2  for communication between ms-one and ms-two. Using postman


We can then visit grafana dashboard on localhost:3000 and under explore, see the tracing under tempo dashboard.

There are two use cases I implemented:
Saving and fetching from Database (ms-one)
Communication between two microservices (ms-one and ms-two)


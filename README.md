# MTIT-Microservice-using-Swagger2-RESTAPI

#### Rajapakshe D.D.S	  - IT16234062
#### U.L.N.P. Uswatte	  - IT17029278
#### Kudawithana K.N.B	- IT17255820
#### Nishshanka N.A.B.D	- IT17043656

#### Overall System Scenario: 

#### ABC company is known to be company which does online sales. Many services are rendered by this company. These services are implemented using Microservices architecture.The services which are identified: Buyer, Seller, Payment, Product, Stock, Cart, Order, Delivery and Location
	
### 1.	Member: Rajapakshe D.D.S

#### Contribution: Implementation and the Integration of the Buyer, Seller, Stock and Payment services. Create three Spring-boot microservices on Spring.io and Deploy an API Documentation of the four microservices using Swagger.           
#### Relation Ship :This is E-commerce system as my part implementing Payment Microservice. Payment-service include an ID, buyerID, stockID, sellerID, Price, salles Amount. Therefor I creating payment-service have to integrate and create tree microservice . those are 

•	Stock-service – {ID, Name, Price, Available  Amount }

•	Buyer-service – {ID, Name, Phone}

•	Seller-service – {ID, Name, Phone}

Technology :

•	To register a Microservice Swagger 2 Rest API 

•	Routing a Microservice  use Zuul proxy 

•	Database use Hibernate ORM.

Post Method Scenario :The payment-service and others service are integrate using post method(use create method to integrate payment, stock, seller, buyer services). The creating a payment is getting value : 

•	ID : user input

•	stockID : stock-service

•	buyerID : buyer-service

•	sellerID : seller-service

•	Price : seller-service

•	salles Amount : user input

### 2.	Member: U.L.N.P. Uswatte

#### Contribution: Implementation and the Integration of the Product and Stock services Create two Spring-boot microservices on Spring.io Deploy an API Documentation of the two microservices using Swagger

#### Scenario: At my part the Product and the Stock services are implemented using the Microservice architecture. From the buyer's side a Product Request is sent to the Product Service to get productType, productName, price and quantity. From the Product Service a request called StockCreationRequest is being sent to the Stock Service. The Stock Service contains two classes named the StockRequest and StockResponse. From the StockRequest get productName and number of products(noOfProducts). From the StockResponse stockID will be received. Product Service receives a response from the Stock Service called StockCreationResponse. At the integration of the two services a Product Response will be received to the buyer’s side from the Product Service. After the integration of the ProductServices and StockService, stockID and stockName are received from the StockService as a Product Response.

### 3.	Member: Kudawithana K.N.B

#### Contribution: Implementation and the Integration of the Order and Cart services Create two Spring-boot microservices on Spring.io. Deploy an API Documentation of the two microservices using Swagger.

#### Scenario: In this part I have implemented two micro-services. Implemented micro-services are Order and the Shopping Cart.
Order service contains two classes called order request and order response classes. When Buyer send a Order request it is sent to the Order Service to get item Id, item Name and quantity. After that OrderService a request that call to UserCreationRequest is sent to cart. Cart service has two classes call UserRequest and UserResponse. From the UserRequest cusName, itemName, address, price. From the UserResponse cusId, itemId, message will be received. Order Service receives a response from the UserCreationResponse in Cart. ItemId, itemName and quantity are received from Integration of Cart and Order services.

### 4.	Member: Nishshanka N.A.B.D

#### Contribution: Implementation and the Integration of the Delivery and Location services Create two Spring-boot microservices on Spring.io Deploy an API Documentation of the two microservices using Swagger

#### Scenario: I have created two micro-services. First one is Deliver service. In here system will request for Full name, Age and Delivery Type. If the delivery agent will give this details system will provide the Delivery Id, Product Id, Delivery Date and Delivery Description. Second one is location-service. In here system will request for Full Name, Age. If the delivery agent will give this details system will provide the Location Id, Location Address and Customer Name. In here Delivery service is my main service. I integrated both delivery and location service. After the Integration Location Id and Customer Name move inside the Delivery service. 

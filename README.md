# Java Spring Boot Microservices eCommerce Project

A scalable and production-ready eCommerce application built using **Java**, **Spring Boot**, and **Microservices Architecture**.

---

## 🚀 Tech Stack

### Backend

* Java 17+
* Spring Boot
* Spring Cloud
* Spring Security
* Spring Data JPA
* Hibernate
* REST APIs

### Microservices Components

* API Gateway
* Service Registry (Eureka Server)
* Config Server
* Load Balancer
* OpenFeign Client
* Circuit Breaker

### Database

* PostgreSQL
* MySQL (Optional)

### Tools & Platforms

* Maven
* Git & GitHub
* Docker
* Postman
* IntelliJ IDEA / VS Code

---

# 📌 Features

* User Authentication & Authorization
* Product Management
* Category Management
* Order Management
* Inventory Service
* Payment Integration
* API Gateway Routing
* Service Discovery with Eureka
* Inter-Service Communication using Feign Client
* Centralized Configuration
* Fault Tolerance & Resilience
* Load Balancing
* RESTful APIs
* Scalable Microservices Architecture

---

# 🏗️ Microservices Architecture

```text
Client
   │
   ▼
API Gateway
   │
   ├── User Service
   ├── Product Service
   ├── Order Service
   ├── Inventory Service
   ├── Payment Service
   └── Notification Service

All services registered with Eureka Server
```

---

# 📂 Project Structure

```text
Java-Spring-Boot-Microservices-eCommerce-Project/
│
├── api-gateway/
├── service-registry/
├── config-server/
├── user-service/
├── product-service/
├── order-service/
├── inventory-service/
├── payment-service/
├── notification-service/
└── README.md
```

---

# ⚙️ Getting Started

## Clone Repository

```bash
git clone https://github.com/dharmendra9847/Java-Spring-Boot-Microservices-eCommerce-Project.git
```

---

# ▶️ Run the Project

## Step 1: Start Service Registry

```bash
cd service-registry
mvn spring-boot:run
```

---

## Step 2: Start Config Server

```bash
cd config-server
mvn spring-boot:run
```

---

## Step 3: Start Microservices

Run each microservice one by one:

```bash
cd product-service
mvn spring-boot:run
```

Repeat for:

* user-service
* order-service
* inventory-service
* payment-service
* notification-service

---

## Step 4: Start API Gateway

```bash
cd api-gateway
mvn spring-boot:run
```

---

# 🌐 Eureka Dashboard

```text
http://localhost:8761
```

---

# 🔀 API Gateway

```text
http://localhost:8080
```

---

# 🧪 Testing APIs

Use:

* Postman
* Swagger UI

Example:

```http
GET /api/products
POST /api/orders
```

---

# 🔐 Security

* JWT Authentication
* Role-Based Authorization
* Secure REST APIs

---

# 🐳 Docker Support

```bash
docker-compose up
```

---

# 📈 Future Enhancements

* Kubernetes Deployment
* CI/CD Pipeline
* Redis Caching
* Kafka Messaging
* Elasticsearch
* Monitoring with Prometheus & Grafana

---

# 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to GitHub
5. Create a Pull Request

---

# 📜 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

Dharmendra Kumar

GitHub:
https://github.com/dharmendra9847

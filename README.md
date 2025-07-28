# 🐇 Spring Boot RabbitMQ Messaging System

A minimal and production-ready Spring Boot application that demonstrates message publishing and consuming using **RabbitMQ**. This project includes both **text-based messages** and **JSON-based message handling**.

---

## 🚀 Features

- 📥 Publish plain text messages via REST endpoint
- 📤 Consume messages from RabbitMQ queue
- 📦 Publish and consume JSON messages (with `User` object)
- 🔄 Utilizes AMQP protocol with Spring Boot auto-configuration
- 🛠 Built using `Spring Boot`, `RabbitMQ`, and `Lombok`

---

## 🧑‍💻 Tech Stack

| Layer             | Technology                    |
|------------------|-------------------------------|
| Framework        | Spring Boot 3.x               |
| Messaging Queue  | RabbitMQ                      |
| Protocol         | AMQP                          |
| Build Tool       | Maven                         |
| Dependency Mgmt  | Spring Boot Starter AMQP      |
| JSON Mapping     | Jackson                       |
| Data Model       | Lombok (`@Data`)              |

---

## 📁 Project Structure

src/
├── controller/
│ ├── MessageController.java # Plain text message publisher
│ └── MessageJsonController.java # JSON message publisher
├── consumer/
│ ├── RabbitMQConsumer.java # Plain text consumer
│ └── RabbitMQJsonConsumer.java # JSON message consumer
├── publisher/
│ ├── RabbitMQProducer.java # Sends plain text messages
│ └── RabbitMQJsonProducer.java # Sends JSON messages
├── dto/
│ └── User.java # JSON DTO object
└── SpringbootRabbitmqApplication.java # Main application runner


---

## 📬 Endpoints

### 1. Send Plain Text Message

**GET** `/api/v1/publish?message=HelloRabbit`

```bash
curl http://localhost:8080/api/v1/publish?message=HelloRabbit
{
  "id": 101,
  "firstName": "FirstName",
  "lastName": "LastName"
}

Defined in application.properties:

properties
Copy
Edit
spring.application.name=springboot-rabbitmq
Run Locally
Start RabbitMQ locally or using Docker:

bash
Copy
Edit
docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
Run the Spring Boot app:

bash
Copy
Edit
./mvnw spring-boot:run
Access RabbitMQ Dashboard:

URL: http://localhost:15672

Username: guest, Password: guest

📸 Screenshots (Optional)
Add screenshots of RabbitMQ queues, REST responses, and logs here.

📝 License
This project is open-source and free to use.

🙋‍♂️ Author
Yashwanth Maringanti



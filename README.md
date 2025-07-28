# Backend Post Service

A Spring Boot-based REST API service for managing posts, comments, and user interactions. This project is part of a DevOps final application repository that demonstrates modern development practices including CI/CD, containerization, and cloud deployment.

## 🚀 Features

- **Post Management**: Create, read, update, and delete posts with likes functionality
- **Comment System**: Full CRUD operations for comments on posts
- **User Management**: Member registration and authentication
- **Translation Service**: Built-in translation capabilities
- **Message System**: Real-time messaging functionality
- **Health Monitoring**: Built-in health check endpoints
- **Security**: Spring Security integration for authentication and authorization

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.3.3
- **Language**: Java 17
- **Database**: MySQL 8.0
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security
- **Containerization**: Docker & Docker Compose
- **CI/CD**: GitHub Actions with AWS ECR
- **Cloud**: AWS (RDS, ECR)
- **Build Tool**: Maven

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- Docker and Docker Compose
- MySQL 8.0
- AWS CLI (for deployment)

## 🏗️ Project Structure

```
src/main/java/com/example/SpringDemo/
├── Controller/          # REST API controllers
│   ├── BoardController.java
│   ├── CommentController.java
│   ├── HealthController.java
│   ├── HelloController.java
│   ├── LoginController.java
│   ├── MemberController.java
│   ├── MessageController.java
│   └── TranslationController.java
├── Model/              # JPA entities
│   ├── Board.java
│   ├── Comment.java
│   ├── Member.java
│   ├── Message.java
│   └── Translation models
├── Repository/         # Data access layer
├── Services/          # Business logic layer
└── config/           # Configuration classes
```

## 🚀 Quick Start

### Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/kwohyuno/devops-final-app-repo-backend-post-service.git
   cd devops-final-app-repo-backend-post-service
   ```

2. **Configure database**
   - Update `application.properties` with your MySQL credentials
   - Ensure MySQL server is running

3. **Run with Maven**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Run with Docker Compose**
   ```bash
   docker-compose up --build
   ```

### API Endpoints

#### Posts
- `POST /board/create` - Create a new post
- `GET /board` - Get all posts
- `GET /board/detail/{boardId}` - Get post details
- `DELETE /board/detail/{boardId}` - Delete a post
- `POST /board/update/{boardId}` - Update a post

#### Comments
- `POST /comment/create` - Create a comment
- `GET /comment/{boardId}` - Get comments for a post
- `DELETE /comment/{commentId}` - Delete a comment

#### Members
- `POST /member/register` - Register a new member
- `POST /member/login` - Member login

#### Health Check
- `GET /health` - Application health status

## 🐳 Docker Deployment

### Build and Run with Docker

```bash
# Build the application
docker build -f src/main/java/Dockerfile -t post-service .

# Run the container
docker run -p 8080:8080 post-service
```

### Docker Compose

The project includes a `docker-compose.yml` file for easy deployment:

```bash
docker-compose up --build
```

This will start both the backend service and a frontend service (if configured).

## ☁️ Cloud Deployment

### AWS ECR Deployment

The project is configured for deployment to AWS ECR with GitHub Actions:

1. **Set up AWS credentials** in GitHub Secrets:
   - `AWS_ACCESS_KEY_ID`
   - `AWS_SECRET_ACCESS_KEY`
   - `AWS_SESSION_TOKEN`
   - `AWS_ECR_URL`

2. **Push to main branch** to trigger automatic deployment


## 🧪 Testing

### Smoke Tests

Run the included smoke test script:

```bash
./scripts/smoke-test.sh
```

### Manual Testing

Test the health endpoint:

```bash
curl http://localhost:8080/health
```

## 📊 Database Schema

The application uses the following main entities:

- **Board**: Posts with title, content, author, likes, and timestamps
- **Comment**: Comments associated with posts
- **Member**: User accounts with authentication
- **Message**: Real-time messaging system
- **Conversation**: Chat conversations

## 🔧 Configuration


### Database Connection Pool

Configured with HikariCP:
- Maximum pool size: 5
- Connection timeout: 60 seconds
- Initialization fail timeout: 0

## 🚀 CI/CD Pipeline

The project uses GitHub Actions for automated deployment:

1. **Trigger**: Push to main branch
2. **Build**: Maven build with Docker
3. **Push**: Docker image to AWS ECR
4. **Deploy**: Automatic deployment to cloud infrastructure

## 📝 Release Management

The project uses semantic-release for automated versioning:

- Automatic changelog generation
- Semantic versioning
- GitHub releases
- Release notes generation

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## 📄 License

This project is licensed under the ISC License.

## 👥 Authors

- **kwohyuno** - Initial work

## 🔗 Related Projects

This is part of a larger DevOps final application repository that includes:
- Frontend applications
- Microservices architecture
- Infrastructure as Code
- Monitoring and logging

---

For more information about the project structure and deployment, check the [GitHub repository](https://github.com/kwohyuno/devops-final-app-repo-backend-post-service). 

# 🧪 Workshop Spring Boot com MongoDB

Este projeto é uma API REST desenvolvida com **Spring Boot** e **MongoDB**, com foco em operações CRUD, modelagem de dados orientada a documentos e consultas personalizadas. Foi desenvolvido como parte de um workshop para prática e aprofundamento nos conceitos de backend com banco NoSQL.

---

## 🔧 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- Postman (para testes de API)

---

## 📁 Estrutura do projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.example.workshopmongo/
│   │       ├── config/         # Classe de configuração e instanciamento de dados
│   │       ├── domain/         # Entidades: User, Post, CommentDTO
│   │       ├── repository/     # Interfaces MongoRepository
│   │       ├── resource/       # Controllers REST
│   │       └── service/        # Regras de negócio
│   └── resources/
│       └── application.properties
```


## 🚀 Como executar o projeto

### Pré-requisitos

- Java 17 ou superior instalado
- MongoDB em execução localmente (ou via Docker)

### Comandos

```bash
# Clone o repositório
git clone https://github.com/pedrocaua/workshop-springboot-mongodb.git
cd workshop-springboot-mongodb

# Execute com Maven
./mvnw spring-boot:run
```

A aplicação estará disponível em:  
📍 `http://localhost:8080`



## 🌐 Endpoints principais

### Usuários

| Método | Endpoint        | Descrição               |
|--------|-----------------|-------------------------|
| GET    | /users          | Lista todos os usuários |
| GET    | /users/{id}     | Busca usuário por ID    |
| POST   | /users          | Cria um novo usuário    |
| DELETE | /users/{id}     | Remove um usuário       |
| PUT    | /users/{id}     | Atualiza os dados       |

### Postagens

| Método | Endpoint                                           | Descrição                         |
|--------|----------------------------------------------------|-----------------------------------|
| GET    | /posts                                             | Lista todas as postagens          |
| GET    | /posts/{id}                                        | Busca postagem por ID             |
| GET    | /posts/titlesearch?text=texto                      | Busca no título                   |
| GET    | /posts/fullsearch?text=txt&minDate=...&maxDate=... | Busca avançada por texto e datas  |

---

## 🧠 Conceitos aplicados

- 🧩 **Modelagem orientada a documentos**: dados estruturados com `User`, `Post`, `CommentDTO`
- 🔗 **Relacionamento entre documentos**: um usuário possui vários posts
- 🔍 **Consultas personalizadas** com filtros de texto e intervalo de datas
- ☑️ **Boas práticas RESTful**: uso adequado de verbos HTTP e códigos de status
- 🛠️ **Injeção de dependência** e camada de serviço para organização da lógica de negócio

---

## 📚 Exemplos de uso (JSON)

### Criar um usuário

```json
POST /users
{
  "name": "Pedro Cauã",
  "email": "pedro@email.com"
}
```

### Criar uma postagem

```json
POST /posts
{
  "title": "Primeiro post",
  "body": "Conteúdo da postagem",
  "date": "2025-08-06T00:00:00Z",
  "author": {
    "id": "id-do-usuario",
    "name": "Pedro Cauã"
  }
}
```

## 📌 Observações

- Certifique-se de que o MongoDB está rodando antes de iniciar a aplicação.
- Os dados de exemplo são populados automaticamente ao subir o sistema (via classe `Instantiation`).
- A aplicação não possui autenticação ou tratamento de erros robusto — foco educacional.


## 🧑‍💻 Autor

Desenvolvido por **Pedro Cauã** como prática de backend com Spring Boot e MongoDB.  
🔗 [LinkedIn](https://www.linkedin.com/in/pedrocaua)  
📁 [Outros projetos no GitHub](https://github.com/pedrocaua)

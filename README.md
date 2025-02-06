# TODO LIST - API DE GERENCIAMENTO DE TAREFAS

API para gerenciar tarefas (CRUD), desenvolvida como parte de um desafio para pessoas desenvolvedoras backend júnior que se candidatam para a Simplify.

---

## 🛠 TECNOLOGIAS UTILIZADAS

- **[Spring Boot](https://spring.io/projects/spring-boot)**
- **[Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)**
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)**
- **[SpringDoc OpenAPI 3](https://springdoc.org/#migrating-from-springfox)**
- **[MySQL](https://dev.mysql.com/downloads/)**

### 📌 PRÁTICAS ADOTADAS
- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

---

## 🚀 COMO EXECUTAR O PROJETO

### 🔹 Clonar o repositório:
```bash
$ git clone https://github.com/G4briel25/desafio-backend-java.git
```

### 🔹 Construir o projeto:
```bash
$ ./mvnw clean package
```

### 🔹 Executar a aplicação:
```bash
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em: `http://localhost:8080`  
O Swagger poderá ser visualizado em: `http://localhost:8080/swagger-ui.html`

---

## 📌 API ENDPOINTS

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com).

### 🔹 Criar Tarefa - POST
```bash
http://localhost:8080/todos
```
**Corpo:**
```json
{
  "descricao": "Desc Todo 1",
  "id": 1,
  "nome": "Todo 1",
  "prioridade": 1,
  "realizado": false
}
```

**Resposta: 200 OK**
```json
{
  "descricao": "Desc Todo 1",
  "id": 1,
  "nome": "Todo 1",
  "prioridade": 1,
  "realizado": false
}
```

### 🔹 Listar Tarefas - GET
```bash
http://localhost:8080/todos
```
**Resposta: 200 OK**
```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

### 🔹 Atualizar Tarefa - PUT
```bash
http://localhost:8080/todos/1
```

**Corpo:**
```json
{
  "nome": "Todo 1",
  "descricao": "Descricao 01",
  "prioridade": 1,
  "realizado": false
}
```

**Resposta: 200 OK**
```json
{
  "nome": "Todo 1",
  "descricao": "Descricao 01",
  "prioridade": 1,
  "realizado": false
}
```

### 🔹 Remover Tarefa - DELETE
```bash
http://localhost:8080/todos/1
```
**Resposta: 200 OK**
```json
[ ]
```

# RebbitMQ-Produtor
# Projeto Produtor

Este projeto é responsável por fornecer um serviço REST para receber mensagens de texto e publicá-las em uma fila no RabbitMQ.

### Tecnologias Utilizadas:
- Spring Boot
- RabbitMQ
- Spring AMQP

### Como Executar:
1. Certifique-se de ter o RabbitMQ instalado e em execução em sua máquina ou use uma instância em nuvem.
2. Clone este repositório.
3. Importe o projeto em sua IDE preferida.
4. Modifique o arquivo `application.properties` em `src/main/resources` com as configurações corretas do RabbitMQ.
5. Execute a aplicação. O serviço REST estará disponível em `http://localhost:8080`.

### Endpoints:
- `POST /send`: Envia uma mensagem de texto para a fila do RabbitMQ. O corpo da solicitação deve conter o texto da mensagem.

### Exemplo de Uso:
POST http://localhost:8080/send
Content-Type: application/json

{
"message": "Esta é uma mensagem de exemplo."
}
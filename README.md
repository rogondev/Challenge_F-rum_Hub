# 🚀 Forum Hub - Challenge Oracle Next Education
Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar um fórum de discussões. O foco principal foi implementar um sistema de autenticação robusto e a persistência de dados seguindo as melhores práticas de desenvolvimento.

# 🛠️ Tecnologias Utilizadas
Java 21: Linguagem principal do projeto.

Spring Boot 4.0.3 (Snapshot): Framework para construção da API.

Spring Security: Para controle de acesso e proteção das rotas.

JWT (JSON Web Token): Utilizado para autenticação stateless.

MySQL: Banco de dados para armazenamento de usuários e tópicos.

Flyway: Gerenciamento de migrações do banco de dados.

Hibernate/JPA: Para mapeamento objeto-relacional e consultas.

# 🔑 Funcionalidades Implementadas
Autenticação de Usuários: Sistema de login que valida credenciais no banco de dados e retorna um token JWT.

Segurança de Rotas: Filtro de segurança customizado para validar o token em cada requisição.

Criptografia de Senhas: Uso de BCryptPasswordEncoder para garantir a segurança dos dados dos usuários.

Gestão de Tópicos: Estrutura preparada para operações de CRUD em tópicos do fórum.

# 📂 Como rodar o projeto
Clone o repositório.

Configure o banco de dados MySQL no arquivo application.properties.

Execute as migrações do Flyway.

Rode a aplicação através do IntelliJ ou terminal.

Utilize o Postman para enviar um POST para /login com seu usuário e senha para receber o token.

Desenvolvido por Rodrigo Gonçalves.

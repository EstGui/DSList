# DSList

Projeto do evento **Intensivo Java Spring** – DevSuperior

## 🎯 Visão Geral

O DSList é uma aplicação backend em Java criada durante o evento Intensivo Java Spring da DevSuperior. Tem como objetivo praticar conceitos como Spring Boot, JPA, REST, e camadas de serviço/persitência.

## 🧰 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* REST API
* Banco de dados U2
* Ferramentas de build (Maven)

## 📁 Estrutura do Projeto

Breve visão das pastas/chaves do projeto:

```
/src/main/java/…
   ├── controller/       # Classes de controle das APIs
   ├── service/          # Lógica de negócio
   ├── repository/       # Interfaces de acesso aos dados
   ├── model/            # Entidades JPA
   └── dto/              # Objetos de transferência, se aplicável
/resources/
   ├── application.yml   # Configurações do Spring Boot
   └── data.sql          # (Opcional) Dados iniciais
```

## 🚀 Como rodar localmente

1. Clone este repositório:

   ```bash
   git clone https://github.com/EstGui/DSList.git
   cd DSList
   ```
2. Configure o banco de dados no `application.yml` (URL, usuário, senha) conforme seu ambiente.
3. Execute a aplicação com:

   ```bash
   mvn spring-boot:run
   ```

   ou (se usar Gradle)

   ```bash
   ./gradlew bootRun
   ```
4. Acesse a API a partir de `http://localhost:8080` (ou outra porta, se configurada).

## 📌 Endpoints Principais

* `GET /games` – Listar todos os jogos
* `POST /lists` – Criar nova lista
* `PUT /lists/{id}/add` – Adicionar jogo à lista
  …

## ✅ Cenários Testados

* Recuperação de todas as entidades
* Criação, atualização e deleção de listas
* Adição e remoção de itens nas listas
* Validações de negócio

## 🤝 Contribuindo

1. Fork este repositório
2. Crie sua branch: `git checkout -b minha-feature`
3. Faça suas alterações e commit: `git commit -m "Minha contribuição"`
4. Envie para seu fork: `git push origin minha-feature`
5. Abra um Pull Request aqui no repositório principal

## 📝 Licença

Este projeto está sob a [MIT License](LICENSE).

## 📞 Contato

Desenvolvedor: EstGui
E-mail: (guilherme.o.esteves@gmail.com)
LinkedIn / GitHub: (https://br.linkedin.com/in/guiest?trk=people-guest_people_search-card)

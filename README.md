# Aula DTO
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/tailwindcss-%2338B2AC.svg?style=for-the-badge&logo=tailwind-css&logoColor=white)
![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)

# Sobre o projeto
Este projeto foi desenvolvido como parte de uma aula ministrada no meu canal do YouTube, onde abordo os principais conceitos de Programação Orientada a Objetos (POO). Durante a aula, exploramos temas fundamentais como:

- Pilares da POO (Encapsulamento, Herança, Polimorfismo e Abstração)
- Enums
- Interfaces
 
O projeto simula um sistema de carros, aplicando na prática cada um desses conceitos. É ideal para quem está começando no mundo da programação orientada a objetos ou para quem quer reforçar os conhecimentos nesses tópicos essenciais.

Acompanhe o vídeo completo no YouTube e veja como os conceitos são implementados no código!


### Tecnologias Utilizadas

- *Back-end*: Spring Boot, com ênfase na utilização de Data Transfer Objects (DTOs) para garantir a integridade e a estrutura dos dados. O projeto também abrangeu a modelagem de banco de dados e a criação de APIs REST.

- *Front-end*: React e TypeScript, onde também utilizei DTOs para estruturar e tipar os dados recebidos das APIs. Utilizei Axios para o consumo das APIs, garantindo uma comunicação fluida entre o front-end e o back-end.
  
# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front-end
- React
- TypeScript
- Axios
- Tailwind CSS
  

# Rotas
&#9679;	Users

| Método | Caminho                      | Descrição                                           |
| ------ | ---------------------------- | -------------------------------------------------- |
| GET	    | /users	               | Retorna uma lista de todos os usuários.		 |
| GET	    | /users/minDTO	               | Retorna uma lista reduzida de informações dos usuários.			 |
| POST		    | /users	               |	Adiciona um novo usuário.		 |



# Como executar o projeto

## Back end
Pré-requisitos: Java 21

```bash
# clonar repositório
git clone https://github.com/Ital023/DSCommerce.git

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/Ital023/AulaDTO.git

# instalar dependências
yarn install

# executar o projeto
yarn start
```

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Ital023" title="Github do Ítalo Miranda">
        <img src="https://avatars.githubusercontent.com/u/113559117?v=4" width="100px;" alt="Foto do Ítalo Miranda no GitHub"/><br>
        <sub>
          <b>Ítalo Miranda</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

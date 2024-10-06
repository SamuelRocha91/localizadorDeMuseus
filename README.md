# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Projeto Localizador de Museus <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>Este projeto é uma avaliação desenvolvida no módulo de Java do curso de Desenvolvimento Web da Trybe. Ele utiliza tecnologias como Java, Maven, Docker e Spring, e manipula arquivos nas pastas <code>src/main</code> e <code>src/test/</code> da solução. As competências desenvolvidas incluem:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Desenvolvimento Web com Java;</li>
  <li>Criação de APIs REST com Spring;</li>
  <li>Tratamento de exceções em Java;</li>
  <li>Uso de containers com Java;</li>
  <li>Testes automatizados com JUnit.</li>
</ol>
<p>A aplicação serve como um facilitador de busca por museus, permitindo que usuários encontrem museus próximos com base em sua localização geográfica.</p>

<details>
  <summary><h2>Funcionalidades</h2></summary>
  - **Cadastro de Museus**: Permite adicionar novos museus ao sistema.
  - **Localização de Museus Próximos**: Os usuários podem encontrar museus mais próximos com base em suas coordenadas geográficas.
  - **Consulta de Museus Específicos**: Possibilita a busca de museus pelo seu ID.
</details>

<details>
  <summary><h2>Estrutura do Código</h2></summary>
  O código é organizado em um controlador (Controller) que gerencia as rotas e interações com o serviço de museus. Um exemplo de controlador para museus é apresentado abaixo:

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // Código omitido para brevidade...
  }
  ```
</details>

<details>
  <summary><h2>Tecnologias Utilizadas</h2></summary>
  - **Java**: Linguagem de programação principal.
  - **Spring Boot**: Framework para construção de aplicações web e APIs REST.
  - **Maven**: Ferramenta de gerenciamento de projetos Java.
  - **Docker**: Plataforma para criação e gerenciamento de containers.
  - **JUnit**: Biblioteca para testes automatizados em Java.
</details>

<details>
  <summary><h2>Outros Projetos</h2></summary>
  - 🗳️ [Sistema de Votação](https://github.com/SamuelRocha91/sistemaDeVotacao)
  - 📃 [Regras de Progressão](https://github.com/SamuelRocha91/project_rule_of_progression)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix)
</details>

<details>
  <summary><h2>Como Executar</h2></summary>
  1. Clone este repositório em sua máquina local:
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. Navegue até o diretório do projeto.

  3. Compile e execute a aplicação utilizando o Maven ou Docker conforme a sua preferência.
</details>

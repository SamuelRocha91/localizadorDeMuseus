# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Museum Locator Project <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>This project is an evaluation developed in the Java module of the Trybe Web Development course. It utilizes technologies such as Java, Maven, Docker, and Spring, and manipulates files in the <code>src/main</code> and <code>src/test/</code> folders of the solution. The skills developed include:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Web Development with Java;</li>
  <li>Creating REST APIs with Spring;</li>
  <li>Exception handling in Java;</li>
  <li>Using containers with Java;</li>
  <li>Automated testing with JUnit.</li>
</ol>
<p>The application serves as a facilitator for searching for museums, allowing users to find nearby museums based on their geographic location.</p>

<details>
  <summary><h2>Features</h2></summary>
  - **Museum Registration**: Allows the addition of new museums to the system.
  - **Location of Nearby Museums**: Users can find the nearest museums based on their geographic coordinates.
  - **Query Specific Museums**: Enables the search for museums by their ID.
</details>

<details>
  <summary><h2>Code Structure</h2></summary>
  The code is organized in a controller that manages the routes and interactions with the museum service. An example of a controller for museums is presented below:

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // Code omitted for brevity...
  }
  ```
</details>

<details>
  <summary><h2>Technologies Used</h2></summary>
  - **Java**: Main programming language.
  - **Spring Boot**: Framework for building web applications and REST APIs.
  - **Maven**: Tool for managing Java projects.
  - **Docker**: Platform for creating and managing containers.
  - **JUnit**: Library for automated testing in Java.
</details>

<details>
  <summary><h2>Other Projects</h2></summary>
  - 🗳️ [Voting System](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md)
  - 📃 [Progression Rules](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_en.md)
</details>

<details>
  <summary><h2>How to Run</h2></summary>
  1. Clone this repository to your local machine:
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. Navigate to the project directory.

  3. Compile and run the application using Maven or Docker according to your preference.
</details>

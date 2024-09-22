# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Museum Locator Project <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)

<p>This project is an assessment developed in the Java module of the Web Development course at Trybe. It uses technologies such as Java, Maven, Docker, and Spring, and manipulates files in the <code>src/main</code> and <code>src/test/</code> directories of the solution. The skills developed include:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Web Development with Java;</li>
  <li>Creating REST APIs with Spring;</li>
  <li>Exception handling in Java;</li>
  <li>Using containers with Java;</li>
  <li>Automated testing with JUnit.</li>
</ol>
<p>The application serves as a facilitator for searching museums, allowing users to find nearby museums based on their geographical location.</p>

## Features

- **Museum Registration**: Allows adding new museums to the system.
- **Find Nearby Museums**: Users can find the closest museums based on their geographical coordinates.
- **Specific Museum Lookup**: Enables searching for museums by their ID.

## Code Structure

The code is organized in a controller that manages routes and interactions with the museum service. Below is an example of a controller for museums:

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // Code omitted for brevity...
}
```

## Technologies Used

- **Java**: Main programming language.
- **Spring Boot**: Framework for building web applications and REST APIs.
- **Maven**: Tool for managing Java projects.
- **Docker**: Platform for creating and managing containers.
- **JUnit**: Library for automated testing in Java.

## Other Projects

- 🗳️ [Voting System](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md)
- 📃 [Progression Rules](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_en.md)

## How to Run

1. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
   ```

2. Navigate to the project directory.

3. Compile and run the application using Maven or Docker as per your preference.

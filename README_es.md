# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Proyecto Localizador de Museos <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>Este proyecto es una evaluación desarrollada en el módulo de Java del curso de Desarrollo Web de Trybe. Utiliza tecnologías como Java, Maven, Docker y Spring, y manipula archivos en las carpetas <code>src/main</code> y <code>src/test/</code> de la solución. Las competencias desarrolladas incluyen:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Desarrollo Web con Java;</li>
  <li>Creación de APIs REST con Spring;</li>
  <li>Manejo de excepciones en Java;</li>
  <li>Uso de contenedores con Java;</li>
  <li>Pruebas automatizadas con JUnit.</li>
</ol>
<p>La aplicación sirve como un facilitador de búsqueda de museos, permitiendo a los usuarios encontrar museos cercanos en función de su ubicación geográfica.</p>

<details>
  <summary><h2>Funcionalidades</h2></summary>
  - **Registro de Museos**: Permite agregar nuevos museos al sistema.
  - **Ubicación de Museos Cercanos**: Los usuarios pueden encontrar los museos más cercanos en función de sus coordenadas geográficas.
  - **Consulta de Museos Específicos**: Posibilita la búsqueda de museos por su ID.
</details>

<details>
  <summary><h2>Estructura del Código</h2></summary>
  El código está organizado en un controlador que gestiona las rutas e interacciones con el servicio de museos. Un ejemplo de controlador para museos se presenta a continuación:

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // Código omitido para brevedad...
  }
  ```
</details>

<details>
  <summary><h2>Tecnologías Utilizadas</h2></summary>
  - **Java**: Lenguaje de programación principal.
  - **Spring Boot**: Framework para construir aplicaciones web y APIs REST.
  - **Maven**: Herramienta de gestión de proyectos Java.
  - **Docker**: Plataforma para crear y gestionar contenedores.
  - **JUnit**: Biblioteca para pruebas automatizadas en Java.
</details>

<details>
  <summary><h2>Otros Proyectos</h2></summary>
  - 🗳️ [Sistema de Votación](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md)
  - 📃 [Reglas de Progresión](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_es.md)
</details>

<details>
  <summary><h2>Cómo Ejecutar</h2></summary>
  1. Clona este repositorio en tu máquina local:
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. Navega hasta el directorio del proyecto.

  3. Compila y ejecuta la aplicación utilizando Maven o Docker según tu preferencia.
</details>

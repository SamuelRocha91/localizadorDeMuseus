# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Proyecto Localizador de Museos <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)

<p>Este proyecto es una evaluación desarrollada en el módulo de Java del curso de Desarrollo Web de Trybe. Utiliza tecnologías como Java, Maven, Docker y Spring, y manipula archivos en las carpetas <code>src/main</code> y <code>src/test/</code> de la solución. Las competencias desarrolladas incluyen:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Desarrollo Web con Java;</li>
  <li>Creación de APIs REST con Spring;</li>
  <li>Tratamiento de excepciones en Java;</li>
  <li>Uso de contenedores con Java;</li>
  <li>Pruebas automatizadas con JUnit.</li>
</ol>
<p>La aplicación sirve como un facilitador para buscar museos, permitiendo a los usuarios encontrar museos cercanos en función de su ubicación geográfica.</p>

## Funcionalidades

- **Registro de Museos**: Permite agregar nuevos museos al sistema.
- **Localización de Museos Cercanos**: Los usuarios pueden encontrar los museos más cercanos según sus coordenadas geográficas.
- **Consulta de Museos Específicos**: Posibilita buscar museos por su ID.

## Estructura del Código

El código está organizado en un controlador que gestiona las rutas e interacciones con el servicio de museos. A continuación, se presenta un ejemplo de un controlador para museos:

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // Código omitido para brevedad...
}
```

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para construir aplicaciones web y APIs REST.
- **Maven**: Herramienta para la gestión de proyectos Java.
- **Docker**: Plataforma para crear y gestionar contenedores.
- **JUnit**: Biblioteca para pruebas automatizadas en Java.

## Otros Proyectos

- 🗳️ [Sistema de Votación](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md)
- 📃 [Reglas de Progresión](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_es.md)

## Cómo Ejecutar

1. Clona este repositorio en tu máquina local:
   ```sh
   git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
   ```

2. Navega hasta el directorio del proyecto.

3. Compila y ejecuta la aplicación utilizando Maven o Docker según tu preferencia.


# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Проект Поиска Музеев <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>Этот проект является оценкой, разработанной в модуле Java курса веб-разработки Trybe. Он использует такие технологии, как Java, Maven, Docker и Spring, и обрабатывает файлы в папках <code>src/main</code> и <code>src/test/</code> решения. Развиваемые навыки включают:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Веб-разработка на Java;</li>
  <li>Создание REST API с использованием Spring;</li>
  <li>Обработка исключений в Java;</li>
  <li>Использование контейнеров с Java;</li>
  <li>Автоматизированное тестирование с JUnit.</li>
</ol>
<p>Приложение служит для упрощения поиска музеев, позволяя пользователям находить близлежащие музеи на основе их географического положения.</p>

<details>
  <summary><h2>Функциональность</h2></summary>

  - **Регистрация музеев**: Позволяет добавлять новые музеи в систему.
  - **Поиск ближайших музеев**: Пользователи могут находить ближайшие музеи по своим географическим координатам.
  - **Запрос конкретных музеев**: Позволяет искать музеи по их идентификатору.
</details>

<details>
  <summary><h2>Структура кода</h2></summary>
  Код организован в контроллере, который управляет маршрутами и взаимодействиями с сервисом музеев. Пример контроллера для музеев представлен ниже:

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // Код опущен для краткости...
  }
  ```
</details>

<details>
  <summary><h2>Используемые технологии</h2></summary>

  - **Java**: Основной язык программирования.
  - **Spring Boot**: Фреймворк для создания веб-приложений и REST API.
  - **Maven**: Инструмент для управления проектами Java.
  - **Docker**: Платформа для создания и управления контейнерами.
  - **JUnit**: Библиотека для автоматизированного тестирования на Java.
</details>

<details>
  <summary><h2>Другие проекты</h2></summary>

  - 🗳️ [Система голосования](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md)
  - 📃 [Правила прогрессии](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ru.md)
</details>

<details>
  <summary><h2>Как запустить</h2></summary>
  
  1. Клонируйте этот репозиторий на свой локальный компьютер:
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. Перейдите в директорию проекта.

  3. Скомпилируйте и запустите приложение, используя Maven или Docker по вашему выбору.
</details>

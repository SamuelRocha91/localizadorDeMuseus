# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Проект Локатор Музеев <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)

<p>Этот проект является оценочным заданием, разработанным в модуле Java курса веб-разработки Trybe. Он использует такие технологии, как Java, Maven, Docker и Spring, а также обрабатывает файлы в папках <code>src/main</code> и <code>src/test/</code> решения. Развиваемые навыки включают:</p>
<ol>
  <li>Spring Framework;</li>
  <li>Веб-разработка на Java;</li>
  <li>Создание REST API с помощью Spring;</li>
  <li>Обработка исключений в Java;</li>
  <li>Использование контейнеров с Java;</li>
  <li>Автоматизированное тестирование с JUnit.</li>
</ol>
<p>Приложение служит удобным инструментом для поиска музеев, позволяя пользователям находить ближайшие музеи на основе их географического положения.</p>

## Функциональные Возможности

- **Регистрация Музеев**: Позволяет добавлять новые музеи в систему.
- **Поиск Ближайших Музеев**: Пользователи могут находить ближайшие музеи по их географическим координатам.
- **Запрос Конкретных Музеев**: Позволяет искать музеи по их идентификатору.

## Структура Кода

Код организован в контроллере, который управляет маршрутами и взаимодействиями с сервисом музеев. Пример контроллера для музеев представлен ниже:

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // Код опущен для краткости...
}
```

## Используемые Технологии

- **Java**: Основной язык программирования.
- **Spring Boot**: Фреймворк для создания веб-приложений и REST API.
- **Maven**: Инструмент для управления проектами на Java.
- **Docker**: Платформа для создания и управления контейнерами.
- **JUnit**: Библиотека для автоматизированного тестирования на Java.

## Другие Проекты

- 🗳️ [Система Голосования](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md)
- 📃 [Правила Прогрессии](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ru.md)

## Как Запустить

1. Клонируйте этот репозиторий на свой локальный компьютер:
   ```sh
   git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
   ```

2. Перейдите в директорию проекта.

3. Скомпилируйте и запустите приложение с помощью Maven или Docker по вашему выбору.

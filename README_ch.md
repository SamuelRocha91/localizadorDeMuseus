# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> 博物馆定位器项目 <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)

<p>该项目是Trybe网络开发课程Java模块中的一个评估项目。它使用Java、Maven、Docker和Spring等技术，并在解决方案的<code>src/main</code>和<code>src/test/</code>文件夹中处理文件。开发的技能包括：</p>
<ol>
  <li>Spring框架;</li>
  <li>Java Web开发;</li>
  <li>使用Spring创建REST API;</li>
  <li>Java中的异常处理;</li>
  <li>Java中的容器使用;</li>
  <li>使用JUnit进行自动化测试。</li>
</ol>
<p>该应用程序作为一个方便的工具，帮助用户根据地理位置查找附近的博物馆。</p>

## 功能

- **博物馆注册**：允许将新博物馆添加到系统中。
- **查找附近博物馆**：用户可以根据其地理坐标找到最近的博物馆。
- **查询特定博物馆**：允许通过ID搜索博物馆。

## 代码结构

代码组织在一个控制器中，该控制器管理与博物馆服务的路由和交互。以下是一个博物馆控制器的示例：

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // 代码省略以便简洁...
}
```

## 使用的技术

- **Java**：主要编程语言。
- **Spring Boot**：用于构建Web应用和REST API的框架。
- **Maven**：Java项目管理工具。
- **Docker**：用于创建和管理容器的平台。
- **JUnit**：用于Java的自动化测试库。

## 其他项目

- 🗳️ [投票系统](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md)
- 📃 [进度规则](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ch.md)

## 如何运行

1. 将此仓库克隆到本地计算机：
   ```sh
   git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
   ```

2. 进入项目目录。

3. 使用Maven或Docker编译并运行应用程序，具体取决于您的选择。

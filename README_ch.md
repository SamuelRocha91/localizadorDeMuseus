# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> 博物馆定位项目 <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>这个项目是Trybe网络开发课程Java模块中的评估项目。它使用Java、Maven、Docker和Spring等技术，并处理解决方案中<code>src/main</code>和<code>src/test/</code>文件夹中的文件。所开发的技能包括：</p>
<ol>
  <li>Spring框架;</li>
  <li>Java网页开发;</li>
  <li>使用Spring创建REST API;</li>
  <li>Java中的异常处理;</li>
  <li>使用Java的容器;</li>
  <li>使用JUnit进行自动化测试。</li>
</ol>
<p>该应用程序作为博物馆搜索的便利工具，允许用户根据其地理位置找到附近的博物馆。</p>

<details>
  <summary><h2>功能</h2></summary>

  - **博物馆注册**: 允许向系统添加新的博物馆。
  - **查找附近博物馆**: 用户可以根据其地理坐标找到最近的博物馆。
  - **查询特定博物馆**: 允许按ID搜索博物馆。
</details>

<details>
  <summary><h2>代码结构</h2></summary>
  代码组织在一个控制器中，该控制器管理与博物馆服务的路由和交互。以下是一个博物馆控制器的示例：

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // 省略代码以简洁...
  }
  ```
</details>

<details>
  <summary><h2>使用的技术</h2></summary>

  - **Java**: 主要编程语言。
  - **Spring Boot**: 用于构建Web应用和REST API的框架。
  - **Maven**: Java项目管理工具。
  - **Docker**: 用于创建和管理容器的平台。
  - **JUnit**: Java中的自动化测试库。
</details>

<details>
  <summary><h2>其他项目</h2></summary>

  - 🗳️ [投票系统](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md)
  - 📃 [进阶规则](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ch.md)
</details>

<details>
  <summary><h2>如何运行</h2></summary>
  
  1. 将此仓库克隆到您的本地计算机：
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. 进入项目目录。

  3. 根据您的选择使用Maven或Docker编译和运行应用程序。
</details>

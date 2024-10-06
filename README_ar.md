# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> مشروع موقع المتاحف <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)

<p>هذا المشروع هو تقييم تم تطويره في وحدة Java من دورة تطوير الويب في Trybe. يستخدم تقنيات مثل Java وMaven وDocker وSpring، ويتعامل مع الملفات الموجودة في مجلدات <code>src/main</code> و<code>src/test/</code> في الحل. تشمل المهارات التي تم تطويرها:</p>
<ol>
  <li>إطار عمل Spring;</li>
  <li>تطوير الويب باستخدام Java;</li>
  <li>إنشاء واجهات برمجة التطبيقات REST باستخدام Spring;</li>
  <li>معالجة الاستثناءات في Java;</li>
  <li>استخدام الحاويات مع Java;</li>
  <li>اختبارات آلية باستخدام JUnit.</li>
</ol>
<p>يعمل التطبيق كأداة لتسهيل البحث عن المتاحف، مما يسمح للمستخدمين بالعثور على المتاحف القريبة بناءً على موقعهم الجغرافي.</p>

<details>
  <summary><h2>الميزات</h2></summary>

  - **تسجيل المتاحف**: يسمح بإضافة متاحف جديدة إلى النظام.
  - **البحث عن المتاحف القريبة**: يمكن للمستخدمين العثور على المتاحف الأقرب استنادًا إلى إحداثياتهم الجغرافية.
  - **استعلام المتاحف المحددة**: يتيح البحث عن المتاحف باستخدام المعرف الخاص بها.
</details>

<details>
  <summary><h2>هيكل الكود</h2></summary>
  يتم تنظيم الكود في وحدة تحكم (Controller) تدير المسارات والتفاعلات مع خدمة المتاحف. إليك مثال على وحدة تحكم للمتاحف:

  ```java
  @RestController
  @RequestMapping("/museums")
  public class MuseumController {
      // تم حذف الكود للاختصار...
  }
  ```
</details>

<details>
  <summary><h2>التقنيات المستخدمة</h2></summary>

  - **Java**: لغة البرمجة الرئيسية.
  - **Spring Boot**: إطار عمل لبناء التطبيقات على الويب وواجهات برمجة التطبيقات REST.
  - **Maven**: أداة لإدارة مشاريع Java.
  - **Docker**: منصة لإنشاء وإدارة الحاويات.
  - **JUnit**: مكتبة للاختبارات الآلية في Java.
</details>

<details>
  <summary><h2>مشاريع أخرى</h2></summary>

  - 🗳️ [نظام التصويت](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)
  - 📃 [قواعد التقدم](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)
</details>

<details>
  <summary><h2>كيفية التشغيل</h2></summary>
  
  1. استنساخ هذا المستودع على جهاز الكمبيوتر الخاص بك:
     ```sh
     git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
     ```

  2. الانتقال إلى دليل المشروع.

  3. قم بتجميع وتشغيل التطبيق باستخدام Maven أو Docker حسب تفضيلاتك.
</details>

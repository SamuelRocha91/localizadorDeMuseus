
# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> مشروع موصل المتاحف <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/localizadorDeMuseus/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)

<p>هذا المشروع هو تقييم تم تطويره في وحدة Java من دورة تطوير الويب في Trybe. يستخدم المشروع تقنيات مثل Java وMaven وDocker وSpring، ويتعامل مع الملفات في المجلدات <code>src/main</code> و<code>src/test/</code> للحل. تشمل المهارات التي تم تطويرها:</p>
<ol>
  <li>إطار عمل Spring;</li>
  <li>تطوير الويب باستخدام Java;</li>
  <li>إنشاء واجهات برمجة التطبيقات REST باستخدام Spring;</li>
  <li>معالجة الاستثناءات في Java;</li>
  <li>استخدام الحاويات مع Java;</li>
  <li>اختبارات آلية باستخدام JUnit.</li>
</ol>
<p>يعمل التطبيق كأداة تسهل البحث عن المتاحف، مما يتيح للمستخدمين العثور على المتاحف القريبة بناءً على موقعهم الجغرافي.</p>

## الميزات

- **تسجيل المتاحف**: يتيح إضافة متاحف جديدة إلى النظام.
- **العثور على المتاحف القريبة**: يمكن للمستخدمين العثور على المتاحف الأقرب بناءً على إحداثياتهم الجغرافية.
- **استعلام عن متحف محدد**: يتيح البحث عن المتاحف حسب المعرف.

## هيكل الكود

الكود منظم في وحدة تحكم (Controller) تدير المسارات والتفاعلات مع خدمة المتاحف. فيما يلي مثال على وحدة تحكم المتاحف:

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // الكود مختصر لسهولة القراءة...
}
```

## التقنيات المستخدمة

- **Java**: لغة البرمجة الأساسية.
- **Spring Boot**: إطار لبناء التطبيقات الويب وواجهات برمجة التطبيقات REST.
- **Maven**: أداة لإدارة مشاريع Java.
- **Docker**: منصة لإنشاء وإدارة الحاويات.
- **JUnit**: مكتبة للاختبارات الآلية في Java.

## مشاريع أخرى

- 🗳️ [نظام التصويت](https://github.com/SamuelRocha91/sistemaDeVotacao)
- 📃 [قواعد التقدم](https://github.com/SamuelRocha91/project_rule_of_progression)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix)

## كيفية التشغيل

1. استنساخ هذا المستودع إلى جهازك المحلي:
   ```sh
   git clone https://github.com/SamuelRocha91/localizadorDeMuseus.git
   ```

2. انتقل إلى دليل المشروع.

3. قم بتجميع وتشغيل التطبيق باستخدام Maven أو Docker وفقًا لتفضيلك.

---

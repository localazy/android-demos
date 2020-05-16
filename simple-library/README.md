# Simple Library

This project demonstrates how to include a library for translating. It's simple to translate your app's strings along with your libraries and Gradle
modules. 

---

1. [Integrate Localazy Gradle plugin](https://localazy.com/docs/android/localazy-gradle-plugin#quick-start) in the standard way for app's module.  

---

2. In app's `build.gradle`, add `upload` section and include the library:

```groovy
localazy {
    // ...

    upload {
        projects {
            include project("::dialoglibrary")
        }
    }
}
``` 

---

3. At the end of the library's `build.gradle`, add `localazy` plugin the same way as for app' module. Do not forget to provide the whole configuration as it's not shared with the app's module. 

```groovy
apply plugin: 'com.localazy.gradle'

localazy {
    // ... your configuration ...
}
```

---

**And that's it!**  

Localazy uploads strings from your library and correctly updates them with OTA (Over-The-Air) updates. Also, it respects strings overriding and correctly process strings with the same key in the app's and library's modules. 

The string with key `dialog_title` from `dialoglibrary` is not uploaded because Localazy knows that it's overridden by `dialog_title` from the app's module for all cases and there is no need to translate it. However, have a look at the demo project [library & flavors](https://github.com/localazy/android-demos/tree/master/library-and-flavors) when the situation is completely different.

**All this without a single change to your source code or resources!**
     

# Localazy Android demos

Localazy is a translation platform built for mobile app developers that can localize your app for free to up to 80 languages with shared translations. Learn more about Localazy: [https://localazy.com](https://localazy.com)

This repository contains several projects demonstrating how to use Localazy in certain situations. 

All projects are written in Kotlin, but it works exactly the same way for Java-based Android apps. 

Localazy Gradle plugin needs `readKey` and `writeKey`. They are not contained in projects as we store them in `local.properties`. It's described here: [Defining keys in local.properties](https://localazy.com/docs/android/localazy-gradle-plugin#defining-keys-in-localproperties)

To try the demo, you have to clone it from this repository and create new app on Localazy site to obtain your own `readKey` and `writeKey`. 

---

## [excluding-string-and-files](https://github.com/localazy/android-demos/tree/master/excluding-string-and-files)

The project demonstrates different ways how you can exclude strings and files from being uploaded to Localazy translation platform. Also, it demonstrates how the strings analyzer, that is part of our Gradle plugin, can detect strings that you are likely to exclude from upload.

Read more about excluding strings: [Exclude strings and files from upload](https://localazy.com/docs/android/exclude-strings-and-files-from-upload)

---

## [simple-library](https://github.com/localazy/android-demos/tree/master/simple-library)

This project demonstrates how to include a library for translating. It's simple to translate your app's strings along with your libraries and Gradle modules.

---

## [two-libraries](https://github.com/localazy/android-demos/tree/master/two-libraries)

This project demonstrates how to use Localazy with more libraries that contain strings with the same keys. It's not a problem with Localazy at all ;-).

---

## [library-and-flavors](https://github.com/localazy/android-demos/tree/master/library-and-flavors)

This project demonstrates how you can use Localazy to translate your app with different flavors together with a library module. Also, it demonstrates that Localazy correctly handles strings overriding for the library, even with product flavors. 


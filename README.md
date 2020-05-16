# Localazy Android demos

Localazy is a translation platform built for mobile app developers that can translate your app for free to up to 80 languages with shared translations. Learn more about Localazy: [https://localazy.com](https://localazy.com)

This repository contains several projects demonstrating how to use Localazy in certain situations. 

All projects are written in Kotlin, but it works exactly the same way for Java-based Android apps. 

Localazy Gradle plugin needs `readKey` and `writeKey`. They are not contained in projects as we store them in `local.properties`. It's described here: [Defining keys in local.properties](https://localazy.com/docs/android/localazy-gradle-plugin#defining-keys-in-localproperties)

To try the demo, you have to clone it from this repository and create new app on Localazy site to obtain your own `readKey` and `writeKey`. 

---

## excluding-string-and-files

The project demonstrates different ways how you can exclude strings and files from being uploaded to Localazy translation platform. Also, it demonstrates how the strings analyzer, that is part of our Gradle plugin, can detect strings that you are likely to exclude from upload.

Read more about excluding strings: [Exclude strings and files from upload](https://localazy.com/docs/android/exclude-strings-and-files-from-upload)

---

## simple-library

This project demonstrates how to include library for translating. It's very easy to translate your app's strings along with your libraries and Gradle modules.

---

## library-and-flavors

This project demonstrates how you can use Localazy to translate your app with different flavors together with library module. Also, it demonstrates that Localazy correctly handles strings overriding for library even with product flavors. 


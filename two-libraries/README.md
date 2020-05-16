# Two Libraries

This project demonstrates how to use Localazy with more libraries that contain strings with the same keys.

See the [simple library integration](https://github.com/localazy/android-demos/tree/master/simple-library) here on Github to learn how to integrate Localazy with your libraries. 

The Android Gradle plugin prefers strings from the first one defined in dependencies if there are more libraries with clashing string keys.
  
```groovy
dependencies {
    // ...
    implementation project("::library1")
    implementation project("::library2")
}
```

We implemented the same behavior for Localazy, so it's as easy as to include the libraries in the same order.  

```groovy
localazy {
    // ...

    upload {
        projects {
            include project("::library1")
            include project("::library2")
        }
    }
}
```

**That's all :-).** 

You don't need to think about it; we care!
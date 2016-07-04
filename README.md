MvpBoilerplate
=======

<p align="center">
    <img src="art/screens.png" alt="MvpBoilerplate Screens"/>
</p>

An MVP Boilerplate to save me having to create the same project over from scratch every time! :)

This project uses:

- Support libraries: AppCompat, Design.
- [RxJava](https://github.com/ReactiveX/RxJava) and [RxAndroid](https://github.com/ReactiveX/RxAndroid)
- [Retrofit 2](http://square.github.io/retrofit/)
- [Dagger 2](http://google.github.io/dagger/)
- [Butterknife](https://github.com/JakeWharton/butterknife)
- [Timber](https://github.com/JakeWharton/timber)
- [Glide 3](https://github.com/bumptech/glide)
- [Espresso](https://google.github.io/android-testing-support-library/) for UI tests
- [Robolectric](http://robolectric.org/) for framework specific unit tests
- [Mockito](http://mockito.org/)
- [Checkstyle](http://checkstyle.sourceforge.net/), [PMD](https://pmd.github.io/) and [Findbugs](http://findbugs.sourceforge.net/) for code analysis

Requirements
------------

 - [Android SDK](http://developer.android.com/sdk/index.html).
 - Android [4.3 (API 18) ](http://developer.android.com/tools/revisions/platforms.html#4.3).
 - Android SDK Tools
 - Android SDK Build tools 23.0.2
 - Android Support Repository
 - Android Support libraries

Building
--------

To build, install and run a debug version, run this from the root of the project:

    ./gradlew app:assembleDebug
    
    
Testing
-------

To run **unit** tests on your machine:

```
./gradlew test
```

To run **instrumentation** tests on connected devices:

```
./gradlew connectedAndroidTest
```


Code Analysis tools
-------------------

The following code analysis tools are set up on this project:

* [PMD](https://pmd.github.io/)

```
./gradlew pmd
```

* [Findbugs](http://findbugs.sourceforge.net/)

```
./gradlew findbugs
```

* [Checkstyle](http://checkstyle.sourceforge.net/)

```
./gradlew checkstyle
```

### The check task

To ensure that your code is valid and stable use check:

```
./gradlew check
```
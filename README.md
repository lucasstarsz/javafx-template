<div align="center">

# JavaFX Template Project

[![License Badge][License-Badge]][License-File]
</div>

A JavaFX template project containing the following configurations:

- Gradle build tool, version `7.0.2`
- Java 16
- JavaFX 16 dependencies (configured to work with Windows, Linux, MacOS)
- Empty JavaFX template program (module-info & main class configurable from build.gradle)
- JUnit 5 Unit Testing (with pretty-print test results)
- Badass JLink Plugin, version `2.24.0` with the following configurations:
    - JavaFX dependencies
    - Icon paths
    - App name/description
    - Don't show the console when running jlink executable script
    - Create core dump if jpackage executable crashes

# How to Use

1. Clone the repository.

```bash
$ git clone https://github.com/lucasstarsz/javafx-template
```

2. Build the project.

```bash
$ cd javafx-template
$ ./gradlew build
```

_If you're on Windows, run `gradlew.bat` instead._

3. Read through [build.gradle][Build-Gradle-File] for configuration information.

If you need a tutorial on how to use JavaFX, check out [Jenkov's JavaFX Tutorials][Jenkov-JavaFX-Tutorials]. They cover nearly 70 specific JavaFX controls and concepts, and are what I used to learn JavaFX.

If you need a tutorial on how to use Gradle, check out [Baeldung's Gradle Tutorials][Baeldung-Gradle-Tutorials]. They're what I used to learn the basics of Gradle.


[License-Badge]: https://img.shields.io/github/license/lucasstarsz/javafx-template?color=228822&labelColor=363e45&style=for-the-badge

[Build-Gradle-File]: build.gradle "build.gradle"
[Jenkov-JavaFX-Tutorials]: http://tutorials.jenkov.com/javafx/index.html "Jenkov JavaFX Tutorials"
[Baeldung-Gradle-Tutorials]: https://www.baeldung.com/gradle "Baeldung Gradle Tutorials"
[License-File]: LICENSE "MIT License"

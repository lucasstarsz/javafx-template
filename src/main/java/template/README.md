# JavaFX Template Project

A JavaFX template containing the following configurations:

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

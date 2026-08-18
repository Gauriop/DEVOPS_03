# ci-jenkins-multi-build-demo

A small Java project used to demonstrate Jenkins Continuous Integration with three
different build tools: Maven, Ant, and Gradle.

## Structure

- `src/main/java/com/vit/demo/App.java` — main application (adds two numbers)
- `src/test/java/com/vit/demo/AppTest.java` — JUnit test used by Maven and Gradle
- `ant-src-test/com/vit/demo/AppTestRunner.java` — plain test runner used only by Ant
- `pom.xml` — Maven build file
- `build.xml` — Ant build file
- `build.gradle`, `settings.gradle` — Gradle build files
- `verify-tools.bat` — checks that Java, Git, Maven, Ant, and Gradle are all on PATH

## Building manually

```
mvn -B clean verify
ant build
gradle clean build
```

## Running the jar

```
java -cp target\ci-jenkins-demo-1.0.0.jar com.vit.demo.App
java -jar ant-build\dist\ci-jenkins-demo-1.0.0.jar
java -cp build\libs\ci-jenkins-demo-1.0.0.jar com.vit.demo.App
```

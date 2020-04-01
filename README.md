# Maven Quickstart

This is a template project for kickstarting a new project.

## Compiling
```
$ mvn compile
$ mvn -Dmaven.test.skip=true compile # skip running and compiling tests
```

## Executing
```
$ mvn -pl project exec:java -Dexec.mainClass=com.example.project.HelloWorld -Dexec.args="arg1 arg2" # execute Java programs in the same VM
OR
$ mvn -pl project exec:exec -Dexec.executable="java" [-Dexec.workingdir="/tmp"] -Dexec.args="-cp %classpath com.example.project.HelloWorld arg1 arg2" # execute programs and Java programs in a separate process
```

## Packaging
```
$ mvn package
```

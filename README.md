# Project

This is a template project for kickstarting a new project.

## Compiling
```
$ mvn compile
$ mvn -Dmaven.test.skip=true compile # skip running and compiling tests
```

## Executing
```
$ mvn -pl app exec:java -Dexec.mainClass=com.example.project.app.HelloWorld -Dexec.args="arg1 arg2" # execute Java programs in the same VM
OR
$ mvn -pl app exec:exec -Dexec.executable="java" [-Dexec.workingdir="/tmp"] -Dexec.args="-cp %classpath com.example.project.app.HelloWorld arg1 arg2" # execute programs and Java programs in a separate process
```

## Packaging
```
$ mvn package
```

## Dropwizard
```
$ java -jar ws/target/ws-1.0-SNAPSHOT.jar server ws/config.yml
$ curl "http://localhost:8080/hello-world?name=Rahul"
$ curl "http://localhost:8081/"
$ curl "http://localhost:8081/healthcheck"
```

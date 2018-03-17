# Gatling Demo

Demo project showcasing gatling performance testing tool using gradle


## Getting Started

clone repo "reachbharathan/gatling-gradle.git" using https or ssh
[gitlab clone](https://docs.gitlab.com/ee/gitlab-basics/command-line-commands.html) - The web framework used

### Prerequisites

things to install for gatling test execution

```
Java (Above Java 8)
Gradle 3.1 +
Scala SDK
Intellij IDE
Intellij Scala Plugin
```

### Installing

A step by step series of examples that tell you have to get a development env running

setting basic gatling setup

```
gradle build
```
Build should be successfull without errors

The repo already have a basic test file not need to add file

## Running the tests

running sample tests

```
gradle gatlingRun-com.project.simu.MySimulation


## Reference & Setup guide

[Running Gatling through Gradle – Complete Beginner’s Guide](http://james-willett.com/2017/04/running-gatling-through-gradle/)
[gradle-gatling-plugin](https://github.com/lkishalmi/gradle-gatling-plugin#installation)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

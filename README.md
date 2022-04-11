# Project Automation Android

Hi! This is a project automation Android with study case Eri Bank using Maven, Cucumber, TestNG, Appium, and Selenium

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Intermezzo

**TestNG** is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use, such as:

* Annotations.
  ( Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
  ( Test that your code is multithreading safe.
* Flexible test configuration.
* Support for data-driven testing (with @DataProvider).
* Support for parameters.
* Powerful execution model (no more TestSuite).
* Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
* Embeds BeanShell for further flexibility.
* Default JDK functions for runtime and logging (no dependencies).
* Dependent methods for application server testing.

TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...

### Prerequisites

What things you need to install:

- [Java Development Kit 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Appium](https://github.com/appium/appium-desktop/releases/)
- [Docker](https://docs.docker.com/engine/install/)
- [Android Studio](https://developer.android.com/studio#downloads)
- [Portrainer](https://www.portainer.io/) (Additional)

## How to Run the Project
* ### Running on local machine

    1. Running Appium Server with command `appium -a 127.0.0.1 -p 4723`
    2. Open the emulator. You can use AVD or real device.
    3. Open the project using any IDE (Eclipse, IDEA, etc)
    4. Download sources Maven and update the project
    5. Running the project using command `mvn clean test`

* ### Running on Docker Emulator

    1. Running the Docker Emulator using command `docker-compose up -d`. Wait until completely done.
    2. Check the address container with name `android-9.0`. If different with `AndroidDriverInstance.java`, you can change it manually.
    3. Open the project using any IDE (Eclipse, IDEA, etc)
    4. Download sources Maven and update the project
    5. Running the project using command `mvn clean test -DandroidDriver=SERVER_HUB`
# Automation Spectrum

The sample project is designed to illustrate test automation using using a BDD Framework. Behavior-driven development (or BDD) is an agile software development technique that encourages collaboration between developers, QA and non-technical or business participants in a software project.
```
IDE (IntelliJ or Eclipse)
Core Java
BDD Cucumber Framework
Selenium Web Driver
Maven 
```

## Getting Started

To get a copy of the project up and running on your local machine for development and testing purposes: 
* Clone project from 'git clone https://github.com/RheeKgopolo/Automation-Spectrum.git' or copy zipped package locally. 
* Add Selenium drivers to: ..\automation-spectrum\src\test\resources\Drivers\ and build with Maven.

[ChromeDriver](http://chromedriver.chromium.org/downloads), [InternetExplorerDriver](https://www.seleniumhq.org/download/),
[FireFoxDriver/ Geckodriver](https://github.com/mozilla/geckodriver/releases)

### Prerequisites
Test machines must have the Java Development Kit (JDK) installed to build and run Cucumber-JVM tests. 
They should also have Apache Maven as build tool. The build tool will automatically install Cucumber-JVM packages 
through dependency management. An IDE such as JetBrains IntelliJ IDEA (with the Cucumber for Java plugin) or Eclipse 
(with the Cucumber JVM Eclipse Plugin)

### Writing a test

The cucumber features goes in the features library and should have the ".feature" extension.

You can start out by looking at automation-spectrum\src\test\java\CucumberFeatures\Anagram.feature, 
then extend this feature. 

## Running tests
Go to your project directory from terminal and hit following command:
```
mvn test -Dtest=CucumberTestRunner
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - BDD Framework

## License

This project is licensed under the MIT License


# selenium-testNG-framework

## Overview

This is a simple yet easily scalable Web Application Testing Framework built on TestNG. The language used is Java. The build tool used is Maven. The tests can easily be executed, modified or added without many code changes or complexities.

Languages Used: JAVA

## Installation

To install all dependencies, run 

```console
$ mvn clean install
```


## Running tests ##

Before executing, replace the credentials in the config.properties file under resources.

Later this can be improved to use git crypt or any other encryption to remove or obfuscate credentials from the properties.

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`.

To run from the IDE itself (IntelliJ), following are the steps:
- You can run directly from the WebAppTests.java file
- You can run via testNG.xml file by right-clicking and executing

---

## Architecture 🔨🔨🔨

- POM (Page Object Model)
    - Implementation makes it easier to keep centralized code for all pages
    - Improves redundancy of locators and page methods
    - Change in DOM becomes easier to manage

- Selenium WebDriver tool as the baseline due to its vast array of open-source collection of APIs which is used for testing web applications.
	- Largest open source community and numerous integrations
	- Native Cross Browser and Cross OS support
	- Support for multiple languages and vast range of frameworks 
	- Use of regex based xpaths to make tests dynamic and yet stable
	
	
- TestNG Framework due to its diverse control over test execution
	- Several assertions, annotations built in reporting
	- Easy parallelization support, along with test prioritization.
	- Ability to group tests and create interdependencies.
	- Many data driving options like @DataProvider and @Parameter

---

## Support

Reach out to me at one of the following places!

- Linkedin at <a href="https://www.linkedin.com/in/madilqayyum/" target="_blank">`Adil Qayyum Linkedin`</a>
- Email at: adilqayyumk@gmail.com

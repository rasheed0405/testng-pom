## **Overview**
This repository contains an automated web testing framework developed using Java, Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern. The purpose of this project is to automate functional test cases for a web application and ensure its quality through reliable and maintainable test scripts.


## **Features**
Java-based Selenium automation

TestNG for test execution and management

Page Object Model (POM) design for modularity

Git integration for version control

Scalable and maintainable codebase

Suitable for regression testing and CI integration


| Technology         | Description                            |
| ------------------ | -------------------------------------- |
| Java               | Core programming language              |
| Selenium WebDriver | UI test automation framework           |
| TestNG             | Testing framework for test management  |
| POM                | Design pattern for reusable components |
| Git                | Version control                        |
| Maven (optional)   | Project and dependency management      |


## **Project Structure**
<pre>
📦 testng-pom/
├── 📁 src/
│   ├── 📁 main/
│   │   └── 📁 java/
│   │       └── 📁 pages/         # Page Object classes
│   └── 📁 test/
│       └── 📁 java/
│           └── 📁 tests/         # TestNG test classes
├── 📄 testng.xml                 # TestNG suite configuration
├── 📄 pom.xml                    # Maven build configuration
├── 📄 README.md                  # Project documentation
 </pre>



## **Prerequisites**
Java 8 or later

Maven (if using)

ChromeDriver or appropriate WebDriver in system PATH

IntelliJ IDEA or Eclipse

## **Steps**
Clone the repository:
git clone https://github.com/rasheed0405/testng-pom.git
cd testng-pom


Open the project in your preferred IDE.

**Run tests via TestNG XML**:

Right-click testng.xml → Run

Or use Maven:
bash
Copy
Edit
mvn clean test

## **Contribution**

Feel free to fork this project and contribute by submitting a pull request. For major changes, please open an issue first to discuss the change.

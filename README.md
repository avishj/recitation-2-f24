# 17 623 Quality Assurance: Recitation 2 Fall 2023

## Installation

**GitHub Codespaces**

In the current repository, go to `<> Code`, select the `Codespaces` tab, and `Create codespace on main`. Wait until the container finishes building.

**Local Setup**

Clone the current repository:

```git clone git@github.com:MSE-QualityAssurance/recitation-2-f23.git```

Run the following command for each of the projects:

```cd TestingWithStubs/easymock && mvn clean compile package```

```cd TestingWithStubs/mockito && mvn clean compile package```


## Content
```
.
├── README.md
├── TestingWithStubs/
    ├── easymock/
        └── src/
            ├── main/
                ├── .../App.java
                ├── .../Currency.java
                └── .../ExchangeRate.java
            └── test/
                ├── .../AppTest.java
                └── .../ExchangeRateTest.java
        ├── target/
        ├── easymock.iml
        └── pom.xml
    └── mockito/  
        └── src/
            ├── main/
                ├── .../App.java
                ├── .../Currency.java
                └── .../ExchangeRate.java
            └── test/
                ├── .../AppTest.java
                └── .../ExchangeRateTest.java
        ├── target/
        ├── easymock.iml
        └── pom.xml
└── resources/       Presentation from the Recitation
```

## Exercises
# 17 623 Quality Assurance: Recitation 2 Fall 2023

## Installation

**GitHub Codespaces**

In the current repository, go to `<> Code > Codespaces > Create codespace on main`. Wait until the container finishes building.

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

# Exercises

### Exercise 1: Implement toDollars

Implement **toDollars** method in Currency. Using your preferred mocking framework, introduce a new test.


### Exercise 2: Testing Conversion with Different Rates

Test the `toEuros` method with different exchange rates. For instance, write one test where the conversion rate from USD to EUR is 1.1, and another test where the rate is 0.9.

### Exercise 3: Verifying Method Invocation Counts

Write a test case to verify that the getRate method of the ExchangeRate service is called exactly once when the toEuros method of the Currency class is invoked.

*Tip:* Use `Mockito.verify(???, Mockito.times(???)).getRate(???, ???);`

# Deloitte Digital Austria Introduction to TDD Workshop

## Author
- Jean D'Amore
- Lead Architect
- jdamore@deloitte.at

## Synopsis

This project aims at demonstrating the techniques 
and benefits of TDD though a simple example.

## Installation

To work on this project you will need:
* `Java 8` or above
* `Maven 3.5.4` or above

To build the entire project and run all tests for 
all modules simply run at the root of the project:
```
mvn clean install
```

## Lessons

This project is structured with the following modules, each one representing a lesson:
* `lesson0`: Setup of the project
* `lesson1`: Happy path unit test coverage
* `lesson2`: Failure scenarios unit test coverage
* `lesson3`: Basic refactoring
* `lesson4`: Working with dependencies

In addition, we have added a module called `scratchpad`, which can be used by workshop 
participants to try their own code.


## The Example

The example code implements a simple temperature control system.

* The `Regulator` has one public method `regulate()` that outputs a heat 
increment +1 for increase or -1 for decrease depending on the current temperature 
and the desired temperature.

* The `Thermometer` (lesson 4) has one public method `readTemperature()`
that simulated a thermometer by reading temperature values from a CSV file.







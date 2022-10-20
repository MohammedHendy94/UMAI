# Introduction
This project automate the wesite (https://gthewhite.letsumai.com/widget/kwc-automated) mainly the reservation section:
- Description: This feature allows guests of our partner restaurants to make reservations online without
directly contacting the restaurant. It allows selecting a date, pax size, time slot and proceeding to
confirm the reservation. In some cases based on pax size, the user may be prompted to include their
payment details to confirm their reservation.

# Pre-requists
JDK version 1.6 or higher, IntelliJ IDEA

# About My Framework

This framework mainly include 1- Base folder (main/java/Bases) including all the base classe which have the main setup of the webdriver and it's functionalities 2- Pages folder (main/java/pages) include all pages classes which have the webelements locating + the methods which handle test cases steps 3- Features folder (test/java/Features) including the features files and the scenarios written in Gherkin Language. 4- Runners folder (test/java/Runners) including the options interface which handle the test execution, reporting .etc. 5- Tests folder (test/java/Tests) including the step definition of each scenario and test cases implementation 6- target folder having the reports files.

Please Make sure you have the POM.XML file which have all needed libraries and Jar files for running the project.

# orange-hrm
Automated tests written in Java+Selenide for OrangeHRM

For reporting slf4j-simple is used.

Test cases are in [google.sheets](https://docs.google.com/spreadsheets/d/13C_b8cag9D6BHmjuHhyrnjSGicsv6GPY3jH6rGkVYyg/edit?usp=sharing). Please, send me request to access the document.

## How to run tests
### Maven
1. Make sure that Maven is [installed](https://phoenixnap.com/kb/install-maven-windows) and added to the system environment variables. 
2. `cd` to the project directory
3. In the terminal run `mvn test`
### [Running a Single Test or Method](https://www.baeldung.com/maven-run-single-test#:~:text=The%20Maven%20surefire%20plugin%20provides,%2DDtest%3D%E2%80%9DTestClassName%E2%80%9D.&text=As%20the%20output%20shows%2C%20only,the%20test%20parameter%20is%20executed.)
A single test class can be executed by running the command `mvn test -Dtest=”TestClassName”`.
For instance: `mvn test -Dtest="AdminTest"`
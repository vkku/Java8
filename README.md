# Java8
Programs to demonstrate Java 8 functionalities
* Streams
* Methods
* Lambda
* Date & Time
* Functional Interfaces

#### First name comparator
```Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFirstName );```
 
#### last name comparator
```Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLastName );```
 
#### Compare by first name and then last name (multiple fields)
```Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);```
 
#### Use Comparator
```Collections.sort(employees, compareByFullName);```

# Java 7 vs Java 8

    Java 7 - Only Sequential execution of streams possible

    Java 8 - Parallel execution made possible

    Java 7 - Rhino Javascript Engine used

    Java 8 - New Nashorn Javascript Engine used

    Java 7 - No method implementation can be added to Interfaces

    Java 8 - Static and Default methods can be added to Interfaces

    Java 7 - Developer has to write chunk of code using anonymous class

    Java 8 - Huge reduction in code when lambda expressions , method references and functional interfaces are used

    Java 7 - java.util.Date is not thread safe

    Java 8 - New date-time api is immutable and does not have setter methods

    Java 7 - No auto handling of time zone issues

    Java 8 - Time zone handling is taken care in the new API with temporal adjusters and additional calendar support added


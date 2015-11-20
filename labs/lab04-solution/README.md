# Lab03

## To start the app:

    mvn tomcat7:run
    
## TODOs

1. Start the application and visit `http://localhost:8080/employees`.
 
2. Implement methods in `EmployeeController` to:
    - Show the new employee form using `/employee/new` URI with method `GET`
        TIP: Use logical view name `employees/new`
    - View a employee using `/employee/{id}` URI with method `GET` where `id` is the id of the Employee.
        TIP: Service `EmployeeService` contains method `findById`.
        TIP: Ids are already generated in each saved `Employee`.
        TIP: Use logical view name `employees/show`
    - Save a new employee using `/employee` URI with method `POST`.
        TIP: Service `EmployeeService` contains method `save`.
        TIP: Method in controller should redirect to `/employee/{id}` instead of just return the logical view name.
        
3. Lets validate the form.
    - Implement `@NotEmpty` for each attribute in `Employee`
    - Add `@Valid` to `save` method in the controller to apply validation to our `Employee`.

4. Formatting the Social Security Number
    - Make `Employee` had a new attribute called `socialSecurityNumber` and use `SocialSecurityNumber` class.
    - This new attribute should not be null, what do you need to validate that?
    - How spring know how to transform the string with social security number to a `SocialSecurityNumber` object?
        - There is a `SSNFormatter` class already, take a look at how it works.
        - You need to let Spring knows about this formatter. How?
    - Uncomment the usage of the attribute `socialSecurityNumber` in all views so you can see it.
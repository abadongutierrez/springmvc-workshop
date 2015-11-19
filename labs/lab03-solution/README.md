# Lab03

## To start the app:

    mvn tomcat7:run
    
## TODOs

1. Make the `MyTxtView` class implements the interface `org.springframework.web.servlet.View`. The class must implement
methods `getContentType` and `render`. Method `getContentType` should return mime type `text/plain` and method `render` should
print the key/values of the `Model` writing the content to the `HttpServletResponse`.

2. Make the `ModelTxtController` class a `@Controller` so it can handle request to `/txt` setting the attributes you want to the `Model`.
The handler method should use our new view `MyTxtView` to print the key/values in the browser.
    1. What do you need to do so the `Controller` can use the view class?
    2. Do you have an error trying to use the view? why? how can you solve it? 

3. Take a look at `EmployeeReportXlsView` class. This is a class that generates a Excel file.

4. Write a Employee Report Controller that will use the `EmployeeReportXlsView` view to generate a excel file with the
list of employees.

5. Modify `EmployeeReportXlsView` class so it set a file name to the generated content.

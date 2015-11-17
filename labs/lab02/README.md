# Lab02

## To start the app:

    mvn tomcat7:run
    
## TODOs

1. Modify class `HelloWorldController` to make its method `helloWorld` to attend requests to URI `/helloWorld` 
and show view with name `helloWorld`

2. Add a new method named `sayHelloToUsingPathVariable` to `HelloWorldController` to attend requests to `/sayHelloTo/<put-a-name-here>` 
where `<put-a-name-here>` should be a `@PathVariable` that the view `sayHello` will use to show a hello message to that
specific name.
    * TIP: Declare a `Model` as parameter of the method to be able to send model attributes to the view.
    * TIP: use method `addAttribute` from `Model` to add the attribute you need to show in the view.
    What should be the name of the attribute?
    
3. Add a new method named `sayHelloToUsingRequestParam` to `HelloWorldController` to attend request to `/sayHelloTo?name=<put-a-name-here>`
where `<put-a-name-here>` should be a `@RequestParam` that the view `sayHello` will use to show a hello message to that
specific name.
    * TIP: Declare a `Model` as parameter of the method to be able to send model attributes to the view.
    * TIP: use method `addAttribute` from `Model` to add the attribute you need to show in the view.
    What should be the name of the attribute?
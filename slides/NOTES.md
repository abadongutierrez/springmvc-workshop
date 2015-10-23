# Spring MVC

## REST with Spring MVC

Why Spring MVC to implement REST services?. Because some features are covered already:

* URI templates
* `@PathVariable` for Restful URLs
* `@ResponseStatus` to handle exceptions
* Use `@Value`, `@RequestHeader` for request data

### Http Status Code Support

Add `@ResponseStatus` to controller methods:
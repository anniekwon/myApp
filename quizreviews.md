# Week B QUIZ

1. In HTTP, and Idempotent request can be made once or several times in a row with the same effect while leaving the server in the same state.
- TRUE
---
2. If you want to request information from a web API, you would issue a POST request.
- FALSE
---
3. What is CRUD?
- Operations that an API will typically support. Create, Read, Update, Delete.
---
4. Match the HTTP Verbs with their expected outcome.
- GET - Perform data retrieval for one or many of a resource.
- POST - Create a new instance of the resource on the server.
- PUT/PATCH - Update an existing instance of a resource on the server.
- DELETE - Remove an existing instance of a resource on the server.
---
5. Which of the following ARE NOT valid HTTP Verbs?
- REPLACE
- INSERT
- SELECT
---
6. Match the HTTP Request sections with their appropriate definitions.
- Verb - The HTTP request action you want to take. I.e. GET,POST,DELETE, etc...
- Headers - Additional Metadata to be passed along with the request.
- Body - The payload, or content to be sent along with the request.
- URI - The web address, or destination for the http request.
---
7. What is HTTP?
- Hyper Text Transfer Protocol
---
8. What is Javalin?
- A lightweight web framework which allows you to easily create web services.
---
9. HTTP Handlers in Javalin are an example of:
- Functional Interface
---
10. Custom exceptions can be associated with different HTTP status codes.
- TRUE
---
11. **Handling HTTP request and response** In Javalin, the best way to interact with the HTTP request and the HTTP response is using the
- Context object.
---
12. **Status codes** In Javalin, the status code is set to 200 by default unless specified otherwise.
- TRUE
---
13. Match the HTTP Status Code levels to their appropriate definition.
- 100s Block     Informational  
- 200s Block     Success    
- 300s Block     Redirection     
- 400s Block     Client error     
- 500s Block     Server error    
---
14. Given the following program, which statement is true? Select 2 options.   
```
public class FinallyTest{
    public static void main(String args[]) {
        try {
            if (args.length == 0)
                return;
            else
                throw new Exception("Some Exception");
        } catch (Exception e) {
           System.out.println("Exception in Main");
       } finally {
         System.out.println("The end");
       }
   }
} 
```
- If run with no arguments, the program will only print The end. The finally block always executes when the try block exits.
- If run with one argument, the program will print Exception in Main and The end.
---
15. The class at the top of the exception classes hierarchy is called
- Throwable
---
16. Which exception will be thrown from this code?
```
int[] a = new int[0];
System.out.println(a[1/0]);
```
- ArithmeticException
---
17. Should you catch all Throwable objects?
- No, Errors are Throwable, and should not be caught
---
18. Can you catch an Error?
- Yes, but you should not - an application can rarely handle them properly, or continue running after they occur
---
19. You can have multiple catch blocks for a single try block.
- TRUE
---
20. True or False: A finally block will execute regardless of whether an exception is caught.
- TRUE
---

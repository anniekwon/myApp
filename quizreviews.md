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
# JAVA QUIZ #
1. The class at the top of the exception classes hierarchy is called
- Throwable
---
2. Which is true about the Object class?
- It is directly or indirectly the superclass of all Java classes.
---
3. Which is true about the @Override annotation?
- It tells the compiler that the method is intended to override an inherited method.
---
4. Java can be run on any machine that has a JVM.
- TRUE
---
5. What variable scope is x declared in?
```
public class Printer {

	String x;
	
	public Printer(x) {
		this.x = x;
	}

	public void printAString(String y) {
		System.out.println(y);
	}

	public void printHello() {
		System.out.println("Hello");
	}
}
```
- Instance/Object scope.
---
6. Which is true about Java annotations?
- Annotations always start with the @ symbol.
- Annotations provide metadata about the code to the JVM.
- Annotations have certain restrictions on where you can place each one. 
---
7. If you put an @Override annotation above an inherited method, you must provide new implementation for that method.
- TRUE
---
8. CheckedException and RuntimeException are two classes that inherit from the Exception class.
- FALSE (CheckedException is not an exception in Java.) 
---
9. Which keyword is acceptable to put in front of a parameter variable in a method declaration?
1
---
10. A method must have at least 1 parameter to compile correctly.
--- 
11. Why do we need wrapper classes in Java?
---
12. A List in Java allows for ordered access of its elements
---
13. What are some methods that we can use on a List in Java?
--- 
14. Which one is the correct description about a list in Java?
--- 
15. Which method is available in the Object Class?
---
16. How many Objects are created?
---
17. The String Pool is stored in the Java stack
--- 
18. What is stored in the Java stack?
---
19. What does NOT belong in the Java Heap?
- Methods. (Methods are stored on the Java Stack)
--- 
20. What is not a Java Access Modifier?
- Package. (A Java package is like a folder in a computer, it can hold anything from images to videos as well.)
---





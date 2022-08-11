//Using Lambda Expressions

//A lambda expression lets you create
//an anonymous class that implements a specific type of interface called a
//functional interface — which has one and only one abstract method.

//A lambda expression is a concise way to create an anonymous class that implements
//a functional interface. Instead of providing a formal method declaration
//that includes the return type, method name, parameter types, and method body,
//you simply define the parameter types and the method body. The Java compiler
//infers the rest based on the context in which you use the lambda expression.

//The parameter types are separated from the method body by a new operator,
//called the arrow operator, which consists of a hyphen followed by a greater-than
//symbol. Here’s an example that implements the Ball interface:
//() -> { System.out.println("You hit it!");}

//For example, here’s a complete program that
//uses a lambda expression to implement the Ball interface:
        
package Chapter7;

public class LambdaBall {

    public static void main(String[] args) {
        Ball b = () -> {
            System.out.println("You hit it!");
        };
        b.hit();
    }

    interface Ball {

        void hit();
    }
}


//The general syntax for a lambda expression is this:

//(parameters) -> expression
//or this:
//(parameters) -> { statement;...}

//If you use an expression, a semicolon is not required. If you use one or more
//statements, the statements must be enclosed in curly braces and a semicolon is
//required at the end of each statement.

//Don’t forget that the statement in which you use the lambda expression must
//itself end with a semicolon. Thus, the lambda expression in the previous example
//has two semicolons in close proximity:

//Ball b = () -> { System.out.println("You hit it!"); };

//The first semicolon marks the end of the statement that calls System.out.
//println; the second semicolon marks the end of the assignment statement that
//assigns the lambda expression to the variable b.

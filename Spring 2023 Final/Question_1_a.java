
// what is Abstraction in Java?

/*
* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
* In other words, it shows only important things to the user and hides the internal details for example sending sms, you just type the text and send the message.
 */

// Example of Abstraction in Java

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}


/*Explain “this” keyword with an example.

In Java, the "this" keyword is a reference to the current object within an instance method or constructor. 
It can be used to access instance variables and methods of the current object, differentiate between
 instance variables and method parameters with the same name, and invoke constructors from other 
 constructors within the same class.*/

 //example program for the implementation for this keyword

 class MyClass {
    private int value;

    // Constructor
    public MyClass(int value) {
        // Using "this" to refer to the instance variable
        this.value = value;
    }

    // Method to set the value
    public void setValue(int value) {
        // Using "this" to differentiate between instance variable and method parameter
        this.value = value;
    }

    // Method to get the value
    public int getValue() {
        return this.value;
    }

    // Method to compare two objects
    public boolean isEqual(MyClass other) {
        // Using "this" to refer to the current object's value and "other" to refer to the parameter object's value
        return this.value == other.value;
    }
}

public class ThisKeyword  {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        System.out.println("Value of obj1: " + obj1.getValue()); // Output: Value of obj1: 10
        System.out.println("Value of obj2: " + obj2.getValue()); // Output: Value of obj2: 20

        obj1.setValue(30);
        System.out.println("Updated value of obj1: " + obj1.getValue()); // Output: Updated value of obj1: 30

        System.out.println("Are obj1 and obj2 equal? " + obj1.isEqual(obj2)); // Output: Are obj1 and obj2 equal? false
    }
}


 
// Objected Oriented Programming systems
/*
 * OOPs was introduced to commercialise objectify modularize our problems
 * we could write our program in modules then we can re-use those modules to 
 * solve other problems with little or no modification 
 * start the class name with a capital letter(convention)
 * while methods are started with a small letter
 * syntax for creating an object of a class
 * <className> <object1> = new <className(constructor)>();
 *
 * 4 pillars of oops
 * Polymorphism -> achieving something by different ways and in java 
 * there are 2 types of polymorphism 1 compile time 2 run-time polymorphism
 * compile time polymorphism -> function overloading when we create multiple functions
 * and have a same name for all function we can achieve this either by having different
 * return types or by having different types and number of arguments
 * Inheritance -> inheriting the properties of super classes in sub class inorder to avoid 
 * writing code for same thing over and over again inheritance has 4 types single multi and soo on
 * Encapsulation -> data hiding is another pillar of oops where we hide the data of our
 * classes and give limited access to the end user
 * Abstraction -> giving blueprint of some concept so that another programmer will work 
 * on the and make something better and more efficient as per his needs and in our case 
 * we will create an abstract class discussed in seperate file
 */

 // constructors
 /*
 * constructor is a function of the class whose work is to construct an object of
 * the class, constructor name is same as that of the class name, constructor don't
 * return anything, constructors are only called once that is while creating an object
 * in java if we don't write a code for the constructor java handles that itself and creates
 * the same. in java we don't have destructors whose work is to free up the memory
 * here we have garbage collector which work in the same way
 * 
 * there are 3 types of constructor -->
 * 1. Non parameterized constructor
 * 2. Parameterized constructor
 * 3. Copy constructors
*/

// Static keyword
/*
 * static has various uses in java at different levels (variable, method, block,class)
 ** Static variable -> is shared among all the instances of a class, that means all the
 * instances of the class access the same variable
 ** Static method -> belong to the class, not instance of the class, they can be called 
 * without creating an instance of the class
 ** Static block -> is used for static intialization, they run once when the class is 
 * first loaded and can be used to intialize static variable. Static block runs before
 * any static method or variables are accessed and before any instance are created
 ** Static class -> in java you can have a static nested class. A static nested class 
 * can access the static members of its outer class but cannot access instance members
 * of the outer class. 
 */


public class OOPS {

    public static void main(String[] args) {
        // creating instance of Pen class
        Pen pen1 = new Pen();
        // access data of class
        pen1.color = "blue";
        // pen1.type = "gel"; -> this will throw an error as type is private member and we can only access it through methods
        pen1.write();
        pen1.Color("black");
        pen1.Type("ball point");
        pen1.write();

        Pen pen2 = new Pen();
        pen2.Color("red");
        pen2.Type("Ink");
        pen2.write();

        //Student s1 = new Student(); -> statement for non parameterized constructor
        // s1.age = 21;
        // s1.name = "faheem";
        Student s1 = new Student("faheem", 22); // parameterized constructor
        s1.printInfo();

        Student s2 = new Student(s1); // copy constructor 
        
        // polymorphism -> functions have name but different functionality 
        s2.printInfo();
        s1.printInfo("faheem");
        s2.printInfo(22);

        // inheritance
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.sides = 3;
        t1.printInfo();
        t1.perimeter();
        
    }
}

// this is custom class that we made and it has data and members
class Pen {
    // default scope of data members and methods is public but we can change it with using 
    // keywords like default protected private

    // data -> information that a class stores
    String color;
    private String type = "not assigned"; // this is data hiding were in main class we can't change this 
    // data member and this data member's scope is limited to this class only similarly scopes of various 
    // access modifers is already discuss in another file

    // methods -> all the functions of the class that performs some function with the data members
    // it can return something or not based on requirement 
    public void write() {
        System.out.println("writing in " + color + " color with " + type + " ink");
    }

    public void Color(String color) {
        this.color = color; // -> this keyword is used to access the data members of the class
    }

    public void Type(String type) {
        this.type = type;
    }

}

class Student {

    String name;
    int age;

    void printInfo() {
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }

    void printInfo(String name) {
        System.out.println("name of the student is " + name);
    }
    void printInfo(int age) {
        System.out.println("age of the student is " + age);
    }

    // // non parameterized constructor and we don't have to write void
    // Student() { 
    //     System.out.println("constructor called");
    // }
    // parameterized constructor 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor -> copies the data members of one object to the other object
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

//inheritance
class Shape {
    String color;
    int sides;

    void printInfo(){
        System.out.println("I have " + this.color + " and " + this.sides + " sides");       
    }
}

// triangle class while inherit all the data members and methods of shape
class Triangle extends Shape {
    void perimeter() {
        System.out.println("my perimeter is " + this.sides*3);
    }
}
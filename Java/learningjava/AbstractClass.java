// abstract class 
/* The abstract class in java cannot be instantiated(we cannot create object of abstract classes)
 * 1 -> we use the abstract keyword to declare an abstract class 
 * 2 -> An abstract class can have both the regular methods and abstract methods 
 * 3 -> A method that doesn't have it's body is known as an abstract method
 * 4 -> Though abstract classes cannot be instantiated we can create subclasses 
 *      from it. We can then 
 *      access members of the abstrat class using  the object of the subclass.
 * 5 -> If the abstract class includes any abstract method, then all the 
 *      child classes inherited from the abstract superclass must provide 
 *      the implementation of the abstract method. 
 * 6 -> A normal class can't have an abstract method 
 */


abstract class Vehcile {

    // abstrate methods in abstrate class
    abstract public void accelerate(); // abstrate method can't have a body

    abstract int brake(int wheels); // abstract method are by defalut public 
    
    void honks(){
        System.out.println("beep");
    }
}

class Car extends Vehcile {

    @Override // annotation -> are used to provide supplemental informartion about program that provide 
    // meta data to the program elements(instance variable, constructor) they change the way 
    // how program is complied and are also used as an alternative to XML  
    // here override annotation is used to tell complier that this method is being 
    // overrided  
    public void accelerate() {
        System.out.println("car is accelerating");
    }

    @Override
    int brake(int wheels) {
        System.out.println("brakes applied on " + wheels);
        return wheels;
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.brake(2);
        c1.honks();
    }
}

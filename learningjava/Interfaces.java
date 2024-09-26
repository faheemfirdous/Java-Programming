// Interfaces
/*  An interface is a fully abstract class.It includes a group of
*   abstrac methods (methods without a body) 
*   Like abstract classes, we cannot create objects of interfaces.
*   to use an interface, other classes must implement it. We use the 
*   implements keyword to implement an interface. as in java mutliple
*   inheritance is not allowed but with the help of interfaces we can
*   achive the same.
*   in interface methods are by default abstract so we don't have to
*   write abstract keywords while declaring a method
 */


interface Mammals {
    void reproduce();
    void habitat();
    // this method in interface will have an default which will excuete very time this method
    // is called and this doesn't need to implemented by any class that implements this interface
    default void walk() {
        System.out.println("Mammals usually walk on their legs ");   
    }
}
interface Animal{
    void eats();
    void legs();
    void tail();

}
// multiple inheritance implements using interfacing
class Cat implements Animal, Mammals {

    @Override
    public void reproduce() {
        System.out.println("directly gives birth to kitten");
    }

    @Override
    public void habitat() {
       System.out.println("lives on land");
    }

    @Override
    public void eats() {
        System.out.println("is an ominvours");
    }

    @Override
    public void legs() {
        System.out.println("has 4 legs");
    }

    @Override
    public void tail() {
        // this is an exception raised by user to let know that this method is not implemented
        throw new UnsupportedOperationException("Unimplemented method 'tail'");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eats();
        cat.habitat();
        cat.legs();
        //cat.tail(); //this will through an error because we have not implemented it
        cat.reproduce();
        cat.walk();
    }
    
}


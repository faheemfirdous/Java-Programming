// Inner classes and Nested Static Class
/*
 * A non-static nested class is a class within another class. It has access to 
 * members of the ensclosing class (outer class). It is commonly called inner class
 * Since the inner class exisrs within the outer class, you mist instantiate the outer class
 * first, in order to instantiate the inner class
 * Unlike inner class, a static nested class cannot access the member variable of the outer 
 * class. It is because the static nested class doesn't require you to create an instance of the 
 * outer class.
 */

public class innerClassAndNestedClass {

    public class Store {
        
        class Toy { // inner class because it is non static
            
            void bear() {
                System.out.println("i am bear toy");
            }
        }
        
        static class Robot {
            
            void bird() {
                System.out.println("I am a robot bird");
            }
        }
    }

    static class PlayStation {
        int price;
        void printPrice(){
            System.out.println(this.price);
        }
    }

    public static void main(String[] args) {
        // instance of public class
        innerClassAndNestedClass outer = new innerClassAndNestedClass();
        
        // instance of inner class store 
        Store store = outer.new Store(); // syntax = <className> <obj> = <objOfOuterClass>.new <constructorOfClass>;
        
        // instance of sub inner class toy using same method.
        Store.Toy toy = store.new Toy();
        
        // accessing members of sub inner class
        toy.bear();
        
        // creating instance of a sub inner class without using the object of outter class
        Store.Robot robo = new Store.Robot(); // syntax = <outerClass>.<className> obj = new <outerClass>.<constructor>;
        robo.bird();

        // creating object of static inner class without using the object of outer class
        PlayStation ps1 = new innerClassAndNestedClass.PlayStation(); // syntax = <className> obj = new <outerClass>.<constructor>;
        ps1.price = 100;
        ps1.printPrice();
    }
}


// to be continue

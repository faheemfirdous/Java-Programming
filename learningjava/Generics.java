// Generics means parameterized types using generics it is possible to create classes that
// work with different data types. An entity such as class, interfaces, or method that
// operates on a parameterized types is a generic entity 
// like in C++ we have concept of templates here in java we have the concept of generics
// here we can define a universal class that can support all datatypes 

// in this class we wont specify any datatype and we will replace it by any 
// capital english letter (convention)
class Dog<G,V> { // we can add any number of generics to it so that our class would handle
    G id;       // handle all data types
    V name;
    public void dog(G id, V name) {
        this.id = id;
        this.name = name;
    }
    void printInfo() {
        System.out.println(id);
        System.out.println(name);
        
    }
}

public class Generics{
    public static void main(String[] args) {
        //Dog<int,String> d1 = new Dog();
        //d1.printInfo();
    }
}


// make a calculator using this concept
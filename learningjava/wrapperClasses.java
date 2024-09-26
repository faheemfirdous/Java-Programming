
import java.util.ArrayList;

// Wrapper class
/* A wrapper class in java class whose object wraps or contains
primitive data types. when we create an object to a wrapper class
it contains a field and in this field we can store primitive data types/
primitive data types | wrapper class
        char         |    Character     
        byte         |    Byte     
        short        |    Short     
        int          |    Int    
        long         |    long  
        float        |    Float     
        double       |    Double    
        boolean      |    Boolean     
these classes in java.util package handles only objects and 
hence wrapper classesx help in this case also
data structures in the collection framework, such as ArrayList and 
vectors, store only objects and not primitive types
an object is needed to support synchronization in multithreading
*/

public class wrapperClasses {
    public static void main(String[] args) {
        
        Integer obj1 = new Integer(12);
        Integer obj2 = Integer.valueOf(12);
        Integer obj3 = 12; // autoboxing -> the automatic conversion of 
        // primitive types to the object of their corresponding wrapper classes
        // ex -> coversion of int to Integer, short to Short
        // unboxing it is the reverse process of autoboxing -> converting an object of 
        // a wrapper class to its corresponding primitive type
        int obj4 = obj1;// all the conversion happens in compile time 
        int obj5 = obj2;
        int obj6 = obj3;

        //ArrayList<int> a = new ArrayList<>(); this is not allowed we can't assign primitive
        // data type to an arraylist we need to convert it into it's wrapper class
        
        ArrayList<Integer> a = new ArrayList<>();

        // we can convert any datatype to other dataType by using valueOf() method
        // example
        Integer obj7 = Integer.valueOf("122");

        

    }
}
// strings is a non primitive data type and is used to store
// long paragraphs, words or we can say any word which
// have multiple characters it is an array of character.

import java.util.*;

public class Strings {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // declaration and intialization
        String name = "faheem";
        String fullName = "faheem firdous";
        String essay = "Lorem ispsum sdah;fjahsjnasdkf dshfan sdfjh;sjadkfhkjhdfslkhse f feskiohsdfoj";

        // taking a string from a user
        String newName = sc.next(); // this will only take one word as input
        // and to take whole line as input we have to use sc.nextLine(); method

        // printing a string
        System.out.println("your name is " + name);
        System.out.println("full name is " + fullName);
        System.out.println("eassy is " + essay);
        System.out.println("you have enter this -> " + newName);

        // concatenation -> combining two string 

        fullName = name + " " + name;

        System.out.println("new fullName is " + fullName);

        // string builder
        /*in java string are immutable(because they are stored in stack) i.e. once created we can eidt the string
        we can use that variable to store new string this create a problem that when we have to edit 
        or perform any action on the string we have to compromise with the efficiency of our program
        to overcome this problem we have a better string class called string builder class which allows 
        altering of string*/
        StringBuilder sb = new StringBuilder("afhimm");
        System.out.println(sb);

        System.out.println(sb.charAt(0)); // printing char at index 0
        sb.setCharAt(0, 'X'); // this altering our string
        System.out.println(sb);
        
        sb.insert(0, "noo"); // appending char to our original string
        System.out.println(sb);
        
        sb.delete(1, 3); // deleting char in our string
        System.out.println(sb);
    }
}
 
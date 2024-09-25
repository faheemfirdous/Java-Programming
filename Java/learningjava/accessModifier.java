// Package 
/*
 * a package arrange number of classes interfaces sub-packages
 * of same type into a particular group
 * a package is nothing but folder in windows
 * types -> pre-defined -> developed by java developers
 *       -> user-defined -> developed by end users
 */

// access modifiers in packages
/*
 *      access modifier | within class | within packages | outside package by sub-class | outside package
           private      |     yes      |      no         |           no                 |       no
           default      |     yes      |      yes        |           no                 |       no
           protected    |     yes      |      yes        |           yes                |       no
           public       |     yes      |      yes        |           yes                |       yes
 */ 

// final keyword 
/*
 * used to define entities that cannot be modified after they are initialized. It can be applied to variables,
 * methods, and classes, each with its own specific meaning.
 * 1. final variable -> When a variable is declared as "final", its value cannot be changed once it is assigned.
 *    This makes the variable a constant.
 * 2. final method -> A method declared as final cannot be overridden by subclasses. This is useful when 
 *    you want to prevent a subclass from altering the implementation of a method.
 * 3. final class -> A class declared as final cannot be subclassed. This is often done to prevent 
 *    the class from being extended, which is useful for creating immutable classes or when you want 
 *    to ensure that the behavior of a class cannot be altered through inheritance.
 */
public class accessModifier {

    public String publicField = "Public Field"; // public access
    protected String protectedField = "Protected Field"; // protected access
    String defaultField = "Default Field"; // default (package-private) access
    private final String privateField = "Private Field"; // private access

    public void publicMethod() { // public access
        System.out.println("Public Method");
    }

    protected void protectedMethod() { // protected access
        System.out.println("Protected Method");
    }

    void defaultMethod() { // default (package-private) access
        System.out.println("Default Method");
    }

    private void privateMethod() { // private access
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        accessModifier demo = new accessModifier();

        System.out.println(demo.publicField); // public access
        System.out.println(demo.protectedField); // protected access
        System.out.println(demo.defaultField); // default (package-private) access
        System.out.println(demo.privateField); // private access

        demo.publicMethod(); // public access
        demo.protectedMethod(); // protected access
        demo.defaultMethod(); // default (package-private) access
        demo.privateMethod(); // private access
    }
}

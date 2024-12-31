
// interface: if an abstract class only has abstract methods we can define it as interface
/*
 * in interface each method is by default public abstract
 * in interface the variables are by default final and static
 * we can implement a class using multiple interfaces multiple inheritance
 * we can inherit one interface in another interface using extends keyword
 */

 // Types of interface
/*
 * Interface is of three types
 * 1. Normal Interface: interface that has two or more methods
 * 2. Functional interface or SAM (Single Abstract Method): interface that has only one method
 * 3. Marker interface : interface that has zero methods it is blank interface
 */




 interface A{
    int age = 50; // static and final
    String area = "Delhi";
    void show();
    void config();
 }

 interface X{
    void run();
 }

 interface Y extends X{

 }

 class B implements A,Y{

    
    public void show() {
        System.out.println("In show B");
    }

    
    public void config() {
        System.out.println("In config B");
    }

    public void run(){
        System.out.println("running in B");
    } // generates error if we do not define this here.

    

 }

public class interfaces {
    public static void main(String[] args) {
        A obj;
        // obj = new A(); // error here
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        // A.age = 55; // error age is final

        // obj.run(); // generates error because A has no idea about run
        B obj1 = new B();
        obj1.run();
    }   
}



// polymorphism: many behavior
/* 
 *two types 
 *compile time (early binding) : behavior is defined at compile time example overloading
 * runtime (late binding) : behavior is defined at runtime example overriding
 */ 



 
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // like computer is base class and laptop is sub class and we can refer the laptop as computer in the same way we are creating reference variable of type A and creating object of B this only works in case of inheritance
        // A obj = new B();
        // obj.show();

        // dynamic method dispatch
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // the same variable obj is behaving differently with different objects - polymorphism
        // irrespective of what type of variable you have but the method depends on which type of object you are reffering to.
    }
}



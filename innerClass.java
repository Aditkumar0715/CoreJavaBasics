

class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B
    // static class B // we can only create inner class as static
    {
        public void config(){
            System.out.println("in Config");
        }
    }
}


abstract class X{
    public abstract void demo();
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();



        // we need an object of B to call config
        // B obj1; // error B can't be resolved because B is not openly available It is part of A
        // A.B obj1; works fine



        // A.B obj1 = new B(); // to create an object of B we nee object of A first because Class B is not static
        A.B obj1 = obj.new B(); // works fine
        obj1.config();



        // for static inner class we can directly do
        // A.B obj1 = new A.B();
        // obj1.config();



        // anonymous inner class: changing the behavior of a method of the class without inheritance or creating new implementation of the class
        // A ob = new A(){
        //     public void show(){
        //         System.out.println("in anonymous show");
        //     }
        // };
        // ob.show();



        // using the abstract class with anonymous inner class
        X x = new X(){
            public void demo(){
                System.out.println("Something New here!!");
            }
        };
        x.demo();


    }    
}

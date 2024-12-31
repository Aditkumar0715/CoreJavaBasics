

// super() -> calls the constructor of the super class
// this() -> calls the constructor of the same class

class A{
    public A(){
        super(); // it is there by default
        System.out.println("In A");
    }
    public A(int x){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super(1);
        System.out.println("In B");
    }
    public B(int x){
        // super(x);
        this();
        System.out.println("In B int");
    }
}

public class superKeyword {
    public static void main(String[] args) {
        // B b = new B();
        B b2 = new B(2);

    }
}


class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class upAndDownCasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // upcasting the child class is converted to parent class it is done even if we do not mention
        obj.show1();
        // we can not access show2() this is because we need downcasting
        // obj.show2();

        
        B obj1 = (B) obj; // downcasting
        obj1.show2(); // perfectly works
    }
}

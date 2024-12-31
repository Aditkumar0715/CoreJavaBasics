

class A{
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In A config");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}


public class overriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
    
}

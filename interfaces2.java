
// need of interfaces shown by below example

interface Computer{
    void code();
}

class Laptop implements Computer{

    
    public void code() {
        System.out.println("Code - Compile - Run");
    }

}

class Desktop implements Computer{

    
    public void code() {
        System.out.println("Code - Compile - Run : faster");
    }

}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class interfaces2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer Aditya = new Developer();
        Aditya.devApp(lap);
    }
}

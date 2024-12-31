

class Mobile{
    String brand;
    int price;
    // Static variable is a class variable and is common to all the objects of the class and should be accessed with class name like Mobile.name and static variable should be initialized in the static block as it is called only once no matter how many objects we create
    static String name;

    static{
        name = "Phone";
        System.out.println("inside Static");
    }
    
    public Mobile(){
        brand = "";
        price = 1000;
        System.out.println("inside Constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static method can be called with class name we can use static variables of the class in the static method to use non static variables in the static method we need to pass the object
    public static void show1(Mobile obj){
        // System.out.println(brand + " : " + price + " : " + name);
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
        System.out.println("In static method");
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        
        // Mobile m1 = new Mobile();
        // m1.brand = "Apple";
        // m1.price = 1500;
        // m1.name = "Smartphone";
        
        // Mobile m2 = new Mobile();
        // m2.brand = "Samsung";
        // m2.price = 1700;
        // m2.name = "Phone";

        // m1.show();
        // m2.show();



        // creating two objects so demonstrate that static is called only once and constructor is called everytime you create an object. and note that static is called before constructor this is because when an object is created the class is loaded before it and also class is loaded only once so as static is called when class is loaded and constructor is called when the object is created.
        // Mobile m3 = new Mobile();
        // Mobile m4 = new Mobile();




        // what is we want to load the class without creating the object in this case we will use Class.forName

        // Class.forName("Mobile"); 
        // this throws an exception ClassNotFoundException


        


    }
}

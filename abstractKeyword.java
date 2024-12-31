// abstract:
/*
 * abstract keywords can be used with methods if you want to declare them
 * if you have any abstract method in the class you have to make the class as abstract
 * It is not compulsory that an abstract class should have abstract method
 * you can not create the object of abstract class
 * If you want to create the object you have to create a new class that implements all the abstract methods of the class known as concrete class
 */
abstract class Car {

    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Music Playing...");
    }
}


abstract class wagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

// concrete class
class UpdatedWagonR extends wagonR{ 

    public void fly() {
        System.out.println("Flying...");
    }
    
}



public class abstractKeyword {
    public static void main(String[] args) {
        Car c = new UpdatedWagonR();
        c.drive();
        c.fly();
        c.playMusic();
    }
}

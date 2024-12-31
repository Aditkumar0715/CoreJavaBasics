// problem and solution of multiple inheritance 
interface Vehicle{
    default void print(){
        System.out.println("I'm a vehicle!!");
    }
}

interface FourWheeler{
    default void print(){
        System.out.println("I'm FourWheeler!!!!");
    }
}

class Car implements Vehicle, FourWheeler{
    // here the problem arises because both the interfaces has default methods with same name and the compiler will get confused which one to call when the object is created

    // Solution 1 override the print method.
        public void print(){
            System.out.println("I'm a FourWheeler Vehicle!");
        }
    


    // Solution 2 using super keyword with interface Name to tell the compiler which method to use to use.
    // public void print(){
    //     Vehicle.super.print();
    //     // FourWheeler.super.print();
    // }
}

public class interfaces3MultipleInheritance {
    public static void main(String[] args) {
        Car alto = new Car();
        alto.print();
    }
}

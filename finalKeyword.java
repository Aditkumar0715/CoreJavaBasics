
// final - variable, method, class
// using final with variable make the variable a constant we can not update it later in the code



// using final with class we can prevent the class from being inherited in futher classes
final class Calc{
    public void show(){
        System.out.println("in calc");
    }
}
// class AdvCalc extends Calc{} // generates error



// using final with methods we can prevent the method from ovrriding in the subclass
class Computer{
    final public void By(){
        System.out.println( "IBM");
    }
    public void features(){
        System.out.println("Using the features");
    }
}
class Mac extends Computer{
    // public void By(){
    //     System.out.println("Apple");
    // }
    // generates error : can not override final method
}


public class finalKeyword {
    public static void main(String[] args) {
        // with variable
        // final int x = 5;
        // x = 4; // gives error



        // with class


    }
}

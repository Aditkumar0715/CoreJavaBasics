
/*
 * constructor: It called everytime a new object is created.
 * It is a special method
 * it does not have any return type
 * its name is same as class name
 * it is used to set the default values for the object variables
 * we can also overload the constructor by changing the parameters and the constructor with parameters is called parameterized constructor
 */

 class Person{
    private int age;
    private String name;

    // default constructor: if we explicitely do not create any constructor java automatically creates a constructor for us with no arguments and that is why it is called default constructor.
    public Person() {
        age = 18;
        name = "Unknown";
    }

    // parameterized constructor
    public Person(int a, String n){
        age = a;
        name = n;
    }

    public Person(String n){
        name = n;
        age = 16;
    }
// we can create many more constructors

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    
 }

public class constructors {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getName() + " : " + p.getAge());
        
        Person p2 = new Person(21, "Aditya");
        System.out.println(p2.getName() + " : " + p2.getAge());
        
    }
}

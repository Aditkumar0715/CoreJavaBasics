
// binding the data and the methods together so that no-one from the outside world can access them directly

class Human{
    private String name;
    private int age;


    // defining getter and setter functions
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }
// using this keyword if we set the name of parameter in the below method as age it create a confusion which one is class variable and which one is paramter so we can use this to tell that the variable is class variable. this keyword represent the current object.
    public void setAge(int age){
        this.age = age;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(14);
        h.setName("Someone");

        System.out.println(h.getName() + " : " + h.getAge());
    }
}

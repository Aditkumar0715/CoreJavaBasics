
// annotations (metadata) : suppliment to compiler or runtime



class A{
    public void showTheDataThatBelongsToThisClass(){
        System.out.println("In A show");
    }
}

class B extends A{
    @Override
    public void showTheDataThatBelongsToThisClass(){
        System.out.println("In B show");
    }
}

public class annotations {
    public static void main(String[] args) {
        A obj = new B();
        obj.showTheDataThatBelongsToThisClass();
    }
}


// throws keyword : used for ducking the exception generally used for checked exceptions basically used for checked exceptions


class A{
    public void show() throws ClassNotFoundException {
        Class.forName("SomeNonExistingClass");
    }
}

public class throwsKeyword{
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
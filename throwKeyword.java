
// throw keyword is used to throw an exceptions and we use catch block to catch the exception



// creating our own exceptions
class SomeException extends Exception{
    public SomeException(String s){
        super(s);
    }
}
public class throwKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if (j==0) {
                // throw new ArithmeticException("We do not want to print 0");
                throw new SomeException("Some Exception occured");
            }
        } catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("That's the default output : " + e);
        } catch(Exception e){
            System.out.println("Something went wrong : " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}






// Exceptions and errors
/*
 * 1) Compile time errors: detected by the compiler like syntatical errors mostly easy to solve
 * 2) Runtime Errors: code compiles and run with no issues but due to some reasons the code suddenly stops working and throw errors when we get runtime errors the execution normally stops runtime errors are also called exceptions and we have to handel it
 * 3) Logical Errors: occured due to confusing logics and are difficult to solve
 */

 /*
  *                             Object
                                Throwable
                Exception                        Error
    Runtime(Unchecked)     SQL IO                  ThreadDeath IOError...
    Arithmatic              (Checked)
    NullPointer
    ArrayIndexOutOfBound


    // Unckechecked exceptions : it's our choice if we want to handel unchecked exceptions the compiler will not give any error
    // Checked exceptions : All other exceptions other that Runtime Exceptions are Checked exceptions and the compiler will throw error if do not handle checked exceptions



  */
 

public class exceptions {
   public static void main(String[] args) {
    int i = 2;
    int j = 0;
    int nums[] = new int[5];
    String s = null;
    try{
        j = 18/i;
        System.out.println(nums[1]);
        System.out.println(nums[3]);
        System.out.println(s.length());
    }
    catch(ArithmeticException e){
        System.out.println("Can not divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index is out of bound");
    }
    catch(Exception e){
        System.out.println("Something unexpected happened");
        System.out.println(e);
    }
    System.out.println(j);
    System.out.println("Bye");
   } 
}  

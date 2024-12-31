import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class inputs {
  public static void main(String[] args) throws IOException{
    System.out.println("Enter some values");
    // int num = System.in.read(); // throws exception and returns the ascii value of the input you give also it only reads the first character
    // System.out.println(num); // prints the ascii value



    // Buffer Reader
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in); // it accepts inputstreamreader as argument we can use readLine method of this class which returns a string it can be used to take input from keyboard or from file... bg is a resource and we need to free the resource when we are done.
    int num2 = Integer.parseInt(bf.readLine());
    System.out.println(num2);
    bf.close();


    
    // Scanner class
    Scanner sc = new Scanner(System.in); 
    // String name = sc.next();
    // System.out.println(name);
    // String fullName = sc.nextLine();
    // System.out.println(fullName);
    // int val = sc.nextInt();
    // float deci = sc.nextFloat();
    // byte byt = sc.nextByte();
    // short sh = sc.nextShort();

  }
}

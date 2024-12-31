import java.util.*;

public class io {
  public static void main(String[] args) {
    System.out.println("enter the two numbers you want sum of: ");
    Scanner sc = new Scanner(System.in);
    float first = sc.nextFloat();
    float second = sc.nextFloat();
    float sum = first + second;
    System.out.println("the sum of the two numbers is : " + sum);
  }
}

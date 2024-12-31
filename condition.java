import java.util.*;

public class condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // using if else statements

    // System.out.print("enter a number to check if it is even or odd: ");
    // int num = sc.nextInt();
    // if (num % 2 == 0) {
    // System.out.println("even number");
    // }
    // else {
    // System.out.println("hey your an old number");
    // }

    // using if else if else statements

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // if (a == b) {
    //   System.out.println("a is equal to b");
    // } else if (a > b) {
    //   System.out.println("a is greater than b");
    // } else {
    //   System.out.println("b is greater than a");
    // }


    // using terniary operator ?:
    int n = 4;
    int m = 0;
    m = n%2==0 ? 10 : 20;
    System.out.println(m);
  }
}

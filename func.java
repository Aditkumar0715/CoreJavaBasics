import java.util.*;
public class func {
  public static void main(String[] args) {
    printLine();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the two numbers you want sum of");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int result = findSum(num1, num2);
    System.out.println("the sum of two numbers is : " + result);
    printLine();
    printLine();
  }

  public static int findSum(int x, int y) {
    int answer = x + y;
    return answer;
  }
  public static void printLine() {
    System.out.println("-------------------------------------------------------------------------------");
  }
}

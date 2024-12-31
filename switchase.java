import java.util.*;
public class switchase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose a button from 1, 2 and 3 : ");
    int btn = sc.nextInt();
    switch (btn) {
      case 1:
        System.out.println("you pressed 1");
        break;
      case 2:
        System.out.println("you pressed 2");
        break;
      case 3:
        System.out.println("you pressed 3");
        break;
      default:
        System.out.println("Invalid button");
    }
  }
}

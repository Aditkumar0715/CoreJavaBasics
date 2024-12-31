import java.util.*;

public class loops {
  public static void main(String[] args) {
    int n = 3;
    // for loop
    for (int i = 0; i < n; i++) {
      System.out.println("for");
    }



    // while loop:
    int j = 0;
    while (j < n) {
      System.out.println("while");
      j++;
    }



    // do while loop executes atleat once
    int k = 0;
    do {
      System.out.println("do-while");
      k++;
    } while (k < n);



    // for each loop or enhanced for loop
    int arr[] = {1,2,3};
    for (int x : arr) {
      System.out.println(x);
    }

    

  }
}


// finally: it executed weather or not try fails to execute the code when we are using finally with try we can omit the catck block
/*
 * finally makes sense when we want the close the resources we are using in try block so that irrespective of exception it is always executed.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallyKeyword {
    public static void main(String[] args) throws IOException {
        // int i=5;
        // int j=0;
        // try {
        //     j = 18/i;
            
        // } catch (Exception e) {
        //     System.out.println("Something went wrong");
            
        // } finally{
        //     System.out.println("Bye...");
        // }




        // try with finally only
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            int num3 = Integer.parseInt(br.readLine());
        }
        finally{
            br.close();
        }



        // try with resources whenever the try block ends the resources are automatically closed
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     int num3 = Integer.parseInt(br.readLine());
        // } 
    }
}

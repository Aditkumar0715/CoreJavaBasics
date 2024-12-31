public class arrays {
    public static void main(String[] args) {
        // single dimensional array
        // int arr[] = {2,3,4};
        // int arr[] = new int[4];
        // arr[0] = 2;
        // arr[1] = 3;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }




        // multi dimensional array
        // int nums[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         nums[i][j] = (int) (Math.random() * 100);

        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        // using enhanced for loop to print array
        // for (int n[] : nums) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }




        // jagged array: it is an array of array in which inside array can have different numbers of elements in it.

        // int jag[][] = new int[3][];
        // jag[0] = new int[3];
        // jag[1] = new int[4];
        // jag[2] = new int[2];
    
        //         for (int i = 0; i < jag.length; i++) {
        //     for (int j = 0; j < jag[i].length; j++) {
        //         jag[i][j] = (int) (Math.random() * 100);
        //     }
        // }

        // for(int x[]: jag){
        //     for(int y: x){
        //         System.out.print(y + " ");
        //     }
        //     System.out.println();
        // }




        // three dimensional array
        // int three[][][] = new int[2][4][3];
        // for (int i = 0; i < three.length; i++) {
        //     for (int j = 0; j < three[i].length; j++) {
        //         for (int j2 = 0; j2 < three[i][j].length; j2++) {
        //             three[i][j][j2] = (int)(Math.random() * 100);
        //         }
        //     }
        // }

        
        // for (int i = 0; i < three.length; i++) {
        //     for (int j = 0; j < three[i].length; j++) {
        //         for (int j2 = 0; j2 < three[i][j].length; j2++) {
        //             System.out.print(three[i][j][j2] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        //     System.out.println();
        // }

        // //  printint using enhanced for loop
        // System.out.println("_________________________________________________");
        // for(int p[][]: three){
        //     for(int q[]: p){
        //         for(int r: q){
        //             System.out.print(r + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        //     System.out.println();
        // }




    }
}

class temp{

    public static void main(String a[]){
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        byte by = 127;
        short sh = 50;
        long l = 534l;

        float f = 5.8f;
        double d = 4.5;

        char c = 'k';

        boolean b = true;


        System.out.println(result);
        System.out.println("Hello, World!");

        // working with binary and hexadecimal numbers
        // binary
        int y = 0b101;

        //hexadecimal
        int x = 0x7E;

        // using _ for readability
        int z = 10_00_00_000;

        // using exponent

        double number = 12e10;

        System.out.println(y);
        System.out.println(x); 
        System.out.println(z);
        System.out.println(number);

        char ch = 'a';
        ch++;
        System.out.println(ch);
        
    }
}

class casting {

    public static void main(String a[]) {
        byte b = 127;
        int c = 12;
        // explicit conversion -> casting
        // b = (byte)c;
        // implicit conversion
        c = b;
        // System.out.println(c);

        float f = 5.6f;
        int x = (int) f;
        // here x is 5;
        // System.out.println(x);

        byte m = 127;
        int n = 257;
        m = (byte) n;
        // here the compiler use modulo operator with the range of the byte 257 % 256 =
        // 1
        // m = 1 here
        // System.out.println(m);

        // Type promotion:
        byte s = 10;
        byte t = 30;
        int result = s * t;
        // here it works because of type promotion
        System.out.println(result);

    }
}

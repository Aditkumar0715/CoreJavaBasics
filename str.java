// stored in double quotes ""
// Strings are stored in a specific location in heap known as string constant pool
// Strings are immutable

public class str {
    public static void main(String[] args) {
        String name = "Aditya";
        String nme = new String("Ankush");

        // System.out.println(name);
        // System.out.println(nme);
        // // printing hashcode
        // System.out.println(nme.hashCode());

        // using + for concatination of strings
        System.out.println("hello " + name);




        // mutable strings created using string buffer or string builder

        // StringBuffer default size is 16 but every time we add some data it keeps 16 bytes for new characters
        StringBuffer sb = new StringBuffer("Aditya");
        System.out.println(sb.capacity());
        // we can convert string buffer to string by using toString method


        
        // String Builder is almost similar to string buffer but there is only one difference: StringBuffer is thread same but String builder is not

    }   
}

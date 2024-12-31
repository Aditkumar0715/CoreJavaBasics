

// Streams: stream can be of integer strings or other
// we can use stream only once


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,2,3,6);

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n->System.out.println(n));
        // s1.forEach(n->System.out.println(n)); // gives error stream can be used once only

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n-> n*2);
        // s3.forEach(n->System.out.println(n));
        int reduced = s3.reduce(0, (c,e)->c+e);
        System.out.println(reduced);






        // doing all this in one line
        int red = nums.stream()
                    .filter(n->n%2==0)
                    .map(n->n*2)
                    .reduce(0, (c,e)->c+e);
        
        System.out.println(red);



    }
}

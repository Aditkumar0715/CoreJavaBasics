
// collection API -> concept in which we work with multiples classes and the interface
// Collection -> interface
// Collections -> class

/*
 *              Collection
 * List           Queue                Set ...
 * ArrayList        DeQueue..           HashSet
 * LinkedList..                    LinkedHasSet
 */

// by default Collection elements are object so we need to specify the type in <>
// collection do not support indexing but List does
// List may have duplicate values but Set does not allow this

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class collections {
    public static void main(String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(5);
        // nums.add(4);
        // nums.add(3);
        // nums.add(2);
        // nums.add(5); // duplicate value not supported by set
        // System.out.println(nums.get(2) + " is value at index 2"); // supported by
        // List

        // for (int x : nums) {
            // System.out.println(x);
        // }





        // using Map
        Map<String, Integer> students = new HashMap<>();
        // keys are unique
        students.put("Aditya", 88);
        students.put("Giri", 85);
        students.put("Aman", 82);
        students.put("Amit", 78);
        students.put("Giri", 88);

        System.out.println(students);
        System.out.println(students.get("Giri"));
        System.out.println(students.keySet());
        // using enhanced for loop to print
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}

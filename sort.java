import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(79);
        nums.add(32);
        nums.add(91);

        Collections.sort(nums);
        // using comparator

        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}

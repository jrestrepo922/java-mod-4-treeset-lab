import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        // your code here
        TreeSet<Integer> numberSorted = new TreeSet<>(new MaxComparator());
        for(int i = 0; i < nums.length; i++){
            numberSorted.add(nums[i]);
        }

        return new ArrayList<>(numberSorted.tailSet(25));
    }
}





class MaxComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}


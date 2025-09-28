import java.util.Set;
import java.util.HashSet;

public class Duplicates {

	public static void main(final String[] args) {
        final int[] nums = {1,3,6,1,2};

        System.out.println("Dupilicates found: " + containsDuplicates(nums));

        return;
    }

    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> checkedNumbers = new HashSet<Integer>();

        // checks all numbers in the input array
        for (int num : nums) {
            if (checkedNumbers.contains(num)) {
                return true;
            }

            checkedNumbers.add(num);
        }

        // only reach this when no duplicates have been found
        return false;
    }
}

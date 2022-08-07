import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int i = 0;
        int j = 0;
        int lenArr = nums.length;

        while (i < lenArr) {
            if (nums[i] == val) {
                i++;
            } else {
                if (i != j) nums[j] = nums[i];
                j++;
                i++;
            }
        }
        for (i = j + 1; i < lenArr; i++) nums[i] = 0;

        System.out.println(Arrays.toString(nums));

    }
}

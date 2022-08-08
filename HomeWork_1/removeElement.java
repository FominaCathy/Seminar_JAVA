import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int copyPos = 0;
        int lenArr = nums.length;

        for (int i = 0; i < lenArr; i++) {
            if ((nums[i] != val)) {
                nums[copyPos] = nums[i];
                copyPos++;
            }
        }
        for (int i = copyPos + 1; i < lenArr; i++) nums[i] = 0;
        System.out.println(Arrays.toString(nums));
    }
}

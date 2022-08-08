//

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 0, 6, 8, 0, 6}; //[1,5,2,0,0,6,8,0]
        int i = 0;
        int j = 0;
        int n = arr.length - 1;
        int counter = arr.length - 1;

        for (i = 0; i <= counter; i++) {
            if (arr[i] == 0)
                if (i == counter) j = 1;
                else counter--;
        }
        if (counter != n) {
            if (j == 1) arr[n] = arr[counter];
            for (i = j; i <= counter; i++) {
                arr[n - i] = arr[counter - i];
                if ((arr[counter - i] == 0)) {
                    n--;
                    arr[n - i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

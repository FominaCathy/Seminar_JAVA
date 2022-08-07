//

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 0, 6, 8, 0, 6}; //[1,5,2,0,0,6,8,0]
        int i = 0;
        int j = 0;
        int n = arr.length - 1;
        int lenArr = n;

        for (i = 0; i <= lenArr; i++) {
            if (arr[i] == 0)
                if (i == lenArr) j = 1;
                else lenArr--;
        }
        if (lenArr != n) {
            if (j == 1) arr[n] = arr[lenArr];
            for (i = j; i <= lenArr; i++) {
                arr[n - i] = arr[lenArr - i];
                if ((arr[lenArr - i] == 0)) {
                    n--;
                    arr[n - i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

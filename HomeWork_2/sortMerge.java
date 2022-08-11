import java.util.Arrays;

public class sortMerge {

    public static void main(String[] args) {

        int[] arrSort = {2, 6, 9, 4, 13, 7, 99, 0};
        System.out.println("начальный список: ");
        System.out.println(Arrays.toString(arrSort));
        myMerdgeSort(arrSort, 0, arrSort.length - 1);
        System.out.println("отсортированный список: ");
        System.out.println(Arrays.toString(arrSort));
    }

    public static void myMerdgeSort(int[] array, int posLeft, int posRight) {

        if (posLeft == posRight)
            return;
        int posMid = (posLeft + posRight) / 2;
        myMerdgeSort(array, posLeft, posMid);
        myMerdgeSort(array, posMid + 1, posRight);
        myMergeArr(array, posLeft, posRight, posMid);
    }

    public static void myMergeArr(int[] array, int posLeft, int posRight, int posMid) {

        int[] arrLeft = new int[posMid - posLeft + 1];
        int[] arrRight = new int[posRight - posMid];

        System.arraycopy(array, posLeft, arrLeft, 0, (posMid - posLeft + 1));
        System.arraycopy(array, (posMid + 1), arrRight, 0, (posRight - posMid));

        int countLeft = 0;
        int countRigth = 0;

        for (int i = posLeft; i < posRight + 1; i++) {

            if ((countLeft < arrLeft.length) && (countRigth < arrRight.length)) {
                if (arrLeft[countLeft] < arrRight[countRigth]) {
                    array[i] = arrLeft[countLeft];
                    countLeft++;

                } else {
                    array[i] = arrRight[countRigth];
                    countRigth++;
                }
            } else {
                if (countLeft == arrLeft.length) {
                    array[i] = arrRight[countRigth];
                    countRigth++;
                } else {
                    array[i] = arrLeft[countLeft];
                    countLeft++;
                }

            }
        }
    }
}

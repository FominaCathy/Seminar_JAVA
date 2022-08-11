import java.util.ArrayList;
import java.util.List;

public class combine {

    public static void main(String[] args) {

        combine(4, 2);
        System.out.println(listCombine);
    }

    static List<List<Integer>> listCombine = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        getComb(n, k, 0, new ArrayList<>());
        return listCombine;
    }

    private static void getComb(int n, int k, int prevElem, List<Integer> currentCombine) {
        if (currentCombine.size() == k)
            listCombine.add(new ArrayList<>(currentCombine));

        for (int i = prevElem + 1; i <= n; i++) {
            currentCombine.add(i);
            getComb(n, k, i, currentCombine);
            currentCombine.remove(currentCombine.size() - 1);

        }
    }

}

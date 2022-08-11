import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.parseInt;

public class Task_5 {
    static List<Integer> listSing = new ArrayList<Integer>();
    static char[] equation;

    public static void main(String[] args) { //List<List<Integer>>
        String eq = "2? + ?5 = 72";
        equation = eq.replaceAll("\\s+", "").toCharArray();

        for (int i = 0; i < equation.length; i++) {
            if (equation[i] == '?') listSing.add(i);
            if (equation[i] == '+') equation[i] = ' ';
            if (equation[i] == '=') equation[i] = ' ';
        }
        System.out.println(equation);
        combine(listSing.size(), new ArrayList<>());
    }


    public static void combine(int k, List<Integer> currentCombine) {
        if (currentCombine.size() == k) {
            checkSolved(currentCombine);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            currentCombine.add(i);
            combine(k, currentCombine);
            currentCombine.remove(currentCombine.size() - 1);
        }
    }

    public static void checkSolved(List<Integer> currentCombine) {

        for (int i = 0; i < listSing.size(); i++) {
            equation[listSing.get(i)] = Character.forDigit(currentCombine.get(i), 10);
        }

        String strEquation = new String(equation);

        int q = parseInt(strEquation.split(" ")[0]);
        int w = parseInt(strEquation.split(" ")[1]);
        int e = parseInt(strEquation.split(" ")[2]);

        if (q + w == e) {
            System.out.printf("%d + %d = %d\n", q, w, e);
        }
   }

}


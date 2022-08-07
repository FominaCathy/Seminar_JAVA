public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "blue";
        String tempS = "";
        String newS = "";
        char c;
        int lenS = s.length();
        int i = 0;

        for (i = 0; i < lenS; i++) {
            c = s.charAt(i);
            if (c == ' ') {
                if (tempS != "") {
                    if (newS == "") {
                        newS = tempS;
                    } else
                        newS = tempS + " " + newS;
                    tempS = "";
                }
            } else {
                tempS = tempS + c;
            }
        }
        if (tempS != "") {
            if (newS == "") {
                newS = tempS;
            } else
                newS = tempS + " " + newS;
        }
        System.out.println(newS);
    }
}

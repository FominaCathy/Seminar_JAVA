public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "  hello world  ";//"the sky  is blue ";
        StringBuilder newS = new StringBuilder();
        int count = 0;
        int i = 0;

        for (i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ')
                count++;
            else {
                s.substring(i + 1, i + 1 + count);
                if ((count != 0)) {
                    newS.append(" ");
                    newS.append(s.substring(i + 1, i + 1 + count));
                }
                count = 0;
            }
        }
        if (count != 0) {
            newS.append(" ");
            newS.append(s.substring(i + 1, i + 1 + count));
        }
        newS.delete(0, 1);
        System.out.println(newS);

//
    }
}

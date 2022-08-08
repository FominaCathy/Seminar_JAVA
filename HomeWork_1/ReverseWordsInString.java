public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "the sky  is blue ";
        String newS = "";
        int count = 0;
        int i = 0;

        for (i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ')
                count++;
            else {
                s.substring(i + 1, i + 1 + count);
                if ((count != 0))
                    newS = newS + " " + s.substring(i + 1, i + 1 + count);
                count = 0;
            }
        }
        newS = newS + " " + s.substring(i + 1, i + 1 + count);
        System.out.println(newS.trim());

//
    }
}

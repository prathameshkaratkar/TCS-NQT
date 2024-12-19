package Strings;

class ChangeCase {
    public static String Substitute(String str, int n) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<n; i++) {
            int ascii = (int) str.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                ans.append((char) (ascii + 32));
            } else if (ascii >= 97 && ascii <= 122) {
                ans.append((char) (ascii - 32));
            } else if (str.charAt(i) == ' ') {
                ans.append(' ');
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "take u forward IS Awesome";
        int length = str.length();
        System.out.println("Resultant string: ");
        System.out.println(Substitute(str, length));
    }


}

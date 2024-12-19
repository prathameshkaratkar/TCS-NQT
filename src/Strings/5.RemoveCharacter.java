package Strings;

class RemoveCharacter {
    public static void main(String[] args) {
        String str1 = "take12% *&u ^$#forward";
        int N = str1.length();
        System.out.println("Resultant string: ");
        System.out.println(solved(str1,N));
    }

    public static String solved(String str1, int N) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < N; i++ ) {
            int ascii = (int) str1.charAt(i); // ascii value
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                ans.append(str1.charAt(i));
            }
        }
        return ans.toString();
    }
}

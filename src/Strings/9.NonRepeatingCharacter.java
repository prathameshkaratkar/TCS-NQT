package Strings;

/*
    Approach :-
        1. we will define frequency array
        2. we will be using 2 loops. the outer loop we will be used
            to select a character let's say 'x' and initialize 'x' at
            the corresponding index in the frequency array with +1
        3. In the inner loop, we will compare the 'x' character with
            the rest of the charactre of the string
        4. If we found 'x' we will again increment the frequency of 'x' by
            +1  and set the 'x' character as '-' to make it a visited character
        5. finally we will print the character whose frequency is equal
            to 1 and we will ignore the spaces in the string (as it is
            not considered as a character) and also '-' to avoid
            repetition of character
 */


class NonRepeatingCharacter {

    static void notRepeating(String st, int n) {
        int[] freq = new int[200];
        char[] s = st.toCharArray();
        for(int i= 0; i<n;i++ ) {
            freq[i] = 1;
            for(int j = i + 1; j<n;j++) {
                if(s[i] == s[j]) {
                    freq[i]++;
                    s[j]='-';
                }
            }
        }
        for(int i= 0;i<n;++i) {
            if(freq[i] == 1 && s[i] != ' ' && s[i] != '-'){
                System.out.print(s[i] + " ");
            }
        }
    }



    public static void main(String[] args) {
        String st = "blockchain technology";
        int n = st.length();
        System.out.println("Non-repeative character: ");
        notRepeating(st, n);
    }
}

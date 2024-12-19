package Strings;

/*
    Using stack :-
        1. take an empty stack
        2. iterate over the given string from start to end
        3. in each iteration, push the character at index i to the stack
        4. after the first loop is completed,set a while loop till the stack is non-empty
        5. pop character at the stack and start re-assigningg the string

 */

import java.util.Stack;

class ReverseString {
    public static void main(String[] args) {
        String str2 = "HELLO";

        char[] reverseStrings = new char[str2.length()];
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i< str2.length();i++) {
            stack.push(str2.charAt(i));
        }
        int i = 0;
        while(!stack.isEmpty()) {
            reverseStrings[i++] = stack.pop();
        }
        str2 = new String(reverseStrings);
        System.out.println("The reversed string is- " + str2);
    }
}

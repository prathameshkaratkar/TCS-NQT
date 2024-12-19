package Arrays;
import java.util.Arrays;

class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        findRepeatingElement(arr);

    }

    static void findRepeatingElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The repeating elements are: ");
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    /*
    Maps :-
        Store the elements in the hashmap with its frequency of occurance.
        iterate through the hashmap. If occurance is more than 1, return the element

     */


}

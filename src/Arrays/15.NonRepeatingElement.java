package Arrays;


/*
    using Maps :-
        1. Declare a hashmap for storing elements as the key and
        their number of occurances as values
        2. Interate through the array and store elements and their
        occurances in the map
        3. Print elements whose occurances were equals to 1.

 */


import java.util.HashMap;
import java.util.Map;

class NonRepeatingElement {

    static void findNonRepeatingElements(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i:arr) {
            if(hashMap.get(i) == null) hashMap.put(i,1);
            else hashMap.put(i,hashMap.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.print(entry.getKey()+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,1,3,1};
        System.out.println("Non-repeating numbers are: ");
        findNonRepeatingElements(arr);
    }
}

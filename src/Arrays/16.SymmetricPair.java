package Arrays;

import java.util.HashMap;

/*
    Using HashMap :-
        1. Store pairs in the hashmap
        2. Let "first" be the first element of the pair and
            "second" be the second element of the pair
        3. while iterating through the pairs we will check if
            {second,first} exists by using map.
        4. if {second,first} exists the print the pairs, else store it in the map
 */


class SymmetricPair {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,1},{3,4},{4,5},{5,4}};

        HashMap<Integer,Integer> mp = new HashMap<>();
        System.out.println("The symmetric pairs are:");

        for(int i = 0; i< arr.length;i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            if(mp.get(second) != null && mp.get(second) == first){
                System.out.println("("+first+" " + second+") ");
            } else{
                mp.put(first,second);
            }
        }
    }
}

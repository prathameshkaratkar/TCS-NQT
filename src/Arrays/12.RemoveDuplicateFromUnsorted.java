package Arrays;

import java.util.HashMap;

class RemoveDuplicateFromUnsorted {
    public static void main(String[] args) {
        int n = 9;
        int[] arr  = {4,3,9,2,4,1,10,89,34};
        duplicate(arr,n);
    }
    static void duplicate(int[] arr,int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                map.put(arr[i], 1);
            }
        }
    }
}

package Arrays;

import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int k = removeDuplicate(arr);
        System.out.print("The array after removing duplicate element is ");
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set) {
            arr[j++]  = x;
        }
        return k;
    }
}

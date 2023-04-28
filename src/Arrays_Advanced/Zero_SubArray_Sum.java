package Arrays_Advanced;

import java.util.HashSet;

public class Zero_SubArray_Sum {

    static  boolean hasZeroSum(int[] arr){
        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();
        int cumSum =arr[0];
        hs.add(cumSum);
        for(int i=1;i<n;i++){
            cumSum += arr[i];
            if(hs.contains(cumSum) || cumSum ==0){
                return true;

            }
            hs.add(cumSum);
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,9,-1,2,-10,6,5};

        System.out.println(hasZeroSum(arr));

    }
}

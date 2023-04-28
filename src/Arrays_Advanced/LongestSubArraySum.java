package Arrays_Advanced;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArraySum {
    static  void hasLongestZeroSum(int[] arr){
        int n = arr.length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int cumSum =arr[0];

        int len =0;
        int left =0;
        int right =0;

        hm.put(cumSum,-1);
        for(int i=0;i<n;i++){
            cumSum += arr[i];
            if(!hm.containsKey(cumSum)){
                hm.put(cumSum,i);
            }else{
                if(i-hm.get(cumSum) >len){
                    len = i -hm.get(cumSum);
                    right =i;
                    left = hm.get(cumSum) +1;
                }

            }

        }
        System.out.println(len +" " +left  +" "+right);

        for( int j = left ; j<=right;j++){
            System.out.println(arr[j]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {6,1,2,-3,-4,4,8,-14};

        hasLongestZeroSum(arr);

    }
}

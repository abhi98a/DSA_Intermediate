package HashMapIntermediate;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    //Given an array check if there is a pair (i,j) such that a[i] +a[j] = k
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,10,0,6,7};
        int k =10;

        //BruteFore using Two loops - Time - O(N^2) : Space-O(1)
        //

        // Using HashMap
        //Time - O(N)
        //Space - O(N)
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
//        }
//        for(int x :arr){
//            int y = k-x;
//            if(x!=y) {
//                if (hm.containsKey(y)) {
//                    System.out.println(x + "," + y);
//                }
//            }else if(x ==y){
//                    if(hm.get(x)>=2){
//                        System.out.println(x +","+y);
//                    }
//
//
//            }
//        }


        //Using Hashset
        //Time -O(N)
        //Space -O(N)
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int x =arr[i];
            int y = k-x;
            if(hs.contains(y)){
                System.out.println(x+","+y);
            }
            hs.add(x);
        }

    }
}

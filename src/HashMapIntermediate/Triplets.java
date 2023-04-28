package HashMapIntermediate;

import java.util.Arrays;
import java.util.HashSet;

public class Triplets {
    //If there is a triplet a[i] + a[j] + a[k] =s
     public static void main(String[] args) {
         int[] arr = {1,3,5,7,8,10,12,14};
         int k =27;
         //BruteForce Using Three loops
         // Time -O(N^3)
         //Space -O(1)




         //Sort The Array and Use Two Pointers

         //Time -O(N^2)
         //Space-O(LogN) - for sorting
//         int s =0;
//         int e=0;
//         Arrays.sort(arr);
//         for(int i=0;i<= arr.length-3;i++){
//             int x =arr[i];
//             s= i+1;
//             e = arr.length-1;
//             while(s<e){
//                 if(arr[s]+arr[e]==k-x ){
//                     System.out.println(x +","+arr[s]+","+arr[e]);
//                     s++;
//                 } else if (arr[s]+arr[e]>k-x) {
//                     e--;
//
//                 }else {
//                     s++;
//                 }
//             }
//
//         }




         HashSet<Integer> hs = new HashSet<>();
         for(int i=0;i<=arr.length-2;i++){
             int x =arr[i];
             for(int j=i+1;j<=arr.length-1;j++){
                 int y = arr[j];
                 int m = k-x-y;
                 if(hs.contains(k-x-y)){
                     System.out.println(x+","+y+","+ m);
                 }
                 hs.add(y);
             }

             hs.clear();
         }

         //Using HashSet

    }
}

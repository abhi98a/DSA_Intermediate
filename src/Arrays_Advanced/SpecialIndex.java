package Arrays_Advanced;

import java.util.Arrays;

public class SpecialIndex {

    /// Given an array of size N, the task is to find the count of array indices such that removing an element
    // from these indices makes the sum of even-indices and odd-indexed array elements equal

   public static void main(String[] args) {


      int[] arr = {4,3,2,7,6,-2};
      int N = arr.length;

      int [] psEven = new int[N];
      int  [] psOdd = new int[N];


      //Even prefix sum

      for(int i=1;i<N;i++){
         psEven[0] = arr[0];
         if(i%2 ==0){
            psEven[i] = psEven[i-1]+arr[i];

         }else{
            psEven[i] = psEven[i-1];
         }
      }

      System.out.println(Arrays.toString(psEven));

      //Odd prefix sum

      for(int i=1;i<N;i++){
         psOdd[0] = 0;
         if(i%2 ==1){
            psOdd[i] = psOdd[i-1]+arr[i];

         }else{
            psOdd[i] = psOdd[i-1];
         }
      }
      System.out.println(Arrays.toString(psOdd));

      int cnt =0;
      for(int i=0;i<N;i++){
         int sEven =0;
         int sOdd =0;
         if(i==0){
            sEven = psOdd[N-1] - psOdd[i];
         }else{
            sEven = psEven[i-1] +(psOdd[N-1] - psOdd[i]);
         }

         if(i==0){
            sOdd = psEven[N-1] - psEven[i];
         }else{
            sOdd = psOdd[i-1] +(psEven[N-1] - psEven[i]);
         }

         if(sEven == sOdd){
            cnt +=1;
         }


      }

      System.out.println(cnt);




   }

}

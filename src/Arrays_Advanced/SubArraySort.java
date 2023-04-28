package Arrays_Advanced;

import java.util.ArrayList;

public class SubArraySort {


    static  Boolean outOfOrder(int[] arr,int i){
        int x =arr[i];
        if(i==0){
            return x >arr[1];
        }
        if(i==arr.length-1){
            return  x < arr[i-1];
        }
        return x>arr[i+1] || x <arr[i-1];
    }

    static ArrayList<Integer> subArraySort(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
            int smallest =Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                int x =arr[i];
                if(outOfOrder(arr,i)){
                    smallest = Math.min(smallest,x);
                    largest = Math.max(largest,x);
                }
            }
            if(smallest == Integer.MAX_VALUE){
                list.add(-1);
                list.add(-1);
                return  list;
            }
            int left =0;
            while(smallest >=arr[left]){
                left++;
            }
            int right = arr.length-1;
            while(largest <=arr[right]){
                right--;
            }
            list.add(0,right);
            list.add(0,left);
            return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,4,10,11};
        ArrayList<Integer> list = new ArrayList<>();
        list = subArraySort(arr);

        int left = list.get(0);
        int right = list.get(1);
        System.out.println("left :" +left +" right :"+right );
    }
}

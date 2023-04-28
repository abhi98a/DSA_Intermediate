package Arrays_Advanced;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    static boolean filterSum(int no, int[] arr,int ans){
        ArrayList<Integer> list = new ArrayList<>();

        int j = 0;
        int sum =0;

        while(no >0){
            int Lastbit = (no&1);
            if(Lastbit ==1){
                list.add(arr[j]);
                sum += arr[j];
            }
            no = no>>1;
            j++;

        }
        if(sum ==ans) {
            System.out.println(list);
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans =3;
        int n = arr.length;

        for(int i=0;i< (1<<3);i++){
            filterSum(i,arr,ans);

        }

    }
}

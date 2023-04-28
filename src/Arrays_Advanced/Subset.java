package Arrays_Advanced;

import java.util.ArrayList;

public class Subset {


    static void filter(int no, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int j = 0;

        while(no >0){
            int Lastbit = (no&1);
            if(Lastbit ==1){
                list.add(arr[j]);
             }
            no = no>>1;
            j++;

        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;

        for(int i=0;i< (1<<3);i++){
            filter(i,arr);

        }

    }
}

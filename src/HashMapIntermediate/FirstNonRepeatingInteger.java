package HashMapIntermediate;

import java.util.HashMap;

public class FirstNonRepeatingInteger {
    public static void main(String[] args) {

        int[] arr = new int[]{6, 4, 1, 3, 2, 2, 1, 6};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(int key: hm.keySet()){
            System.out.println(key +"- " +hm.get(key));
        }

        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                System.out.println("The first Non repeating element is = " + arr[i]);
                System.out.println("No of Unique no's  in the array is = "+ hm.size());
                break;
            }
        }
    }
}

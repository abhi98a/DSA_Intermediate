package Strings_Intermediate;

public class ReverseStringByWords {

    public static void Reverse(int i, int j , char[] arr){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "I like eating apples";

        char[] arr = s.toCharArray();
        int start_index =0;

        for(int i=0;i< arr.length;i++){
            if(arr[i] == ' '){
                Reverse(start_index,i-1,arr);
                start_index = i+1;
                System.out.println(String.valueOf(arr));
            }

        }
        //Reversing the last word

        Reverse(start_index,arr.length-1,arr);
        System.out.println(String.valueOf(arr));


        //Reverse the whole array
        Reverse(0,arr.length-1,arr);
        System.out.println(String.valueOf(arr));
    }
}

package Strings_Intermediate;

import java.util.Arrays;

public class Toggle {
    public static void main(String[] args) {
        char[] S = {'S','n','A','k','e'};

        for(int i=0;i<S.length;i++){
            if(S[i]>='A'&& S[i]<='Z'){
                S[i] = (char)(S[i] -'A' +'a');
            }
            else {
                S[i] = (char)(S[i] -'a' +'A');
            }

        }
        System.out.println(S);

        char[] arr ={'b','a','t','m','a','n'};
        Arrays.sort(arr);
        System.out.println(arr);
    }
}

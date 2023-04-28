package Strings_Intermediate;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] freq = new int[26];

        char[] s = {'a','b','h','i','n','a','v'};

        System.out.println(Arrays.toString(freq));

        for(int i=0;i< s.length;i++){
            freq[s[i]-'a'] +=1;
        }
        System.out.println(Arrays.toString(freq));

        for(int i=0;i<26;i++){
            while (freq[i]!=0){
                System.out.print((char)(i+'a'));
                freq[i]--;
            }
        }


    }
}

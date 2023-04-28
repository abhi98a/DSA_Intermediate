package Strings_Intermediate;

public class LongestPalindrome {
    public static void main(String[] args) {

        int ans =0;
        String str = "klefdabcbadfepr";
        char[] s = str.toCharArray();
        //Checking palliondrom taking middle index is odd
        for(int i=0;i<s.length;i++){
            int p1=i;
            int p2=i;
            ans = Math.max(ans,expand(s,p1,p2));
        }

        //Checking palliondrome taking middle index is even
        for(int i=0;i<s.length;i++){
            int p1=i;
            int p2=i+1;
            ans = Math.max(ans,expand(s,p1,p2));
        }
        System.out.println("The Largest pallindrome is of length = " + ans);
    }
    static  int expand(char [] s,int p1,int p2){
        //Make sure , it doesn't go out of bound
        while(p1>=0 && p2<s.length && s[p1] ==s[p2]){
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
}

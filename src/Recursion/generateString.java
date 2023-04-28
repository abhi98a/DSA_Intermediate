package Recursion;

public class generateString {

    static String genString(String S){

        //0 -> 01
        //1 -> 10

        StringBuilder sb = new StringBuilder();

        for(int i=0;i< S.length();i++){
            char ch =S.charAt(i);
            if(ch== '0') {
                sb.append("01");
            }else{
                sb.append("10");
            }
        }
        return sb.toString();
    }

    public static int generate(String S, int i,int A,int B){
        //Base case
        if(i==A){
            return (int)(S.charAt(B)-'0');
        }

        //recursive case
        System.out.println(S);
        String s1 =genString(S);

        return generate(s1,i+1,A,B);

    }

    public static void main(String[] args) {
       // System.out.println(genString("0110"));

        System.out.println(generate("0",0,5,2));
    }
}

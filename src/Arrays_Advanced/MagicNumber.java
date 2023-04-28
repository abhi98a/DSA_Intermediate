package Arrays_Advanced;

public class MagicNumber {
    public static void main(String[] args) {
        int N =7;
        int last_bit = 0;
        int power =5;
        int ans =0;

        while(N>0){
            last_bit = N&1;
            ans = ans +last_bit*power;
            N = N>>1;
            power = power*5;
        }
        System.out.println("The Magic Number of Nth Element is : " + ans);
    }
}

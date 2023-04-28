package BitManipulation;
import java.util.Arrays;
public class UniqueNoRepeatingThrice {

    public static int uniqueNo(int arr[]){
            int freq[] = new int[32];
            int sum =0;
            int  p=1;
            for(int x :arr){
                    int j=0;
                    while(x>0){
                        int last_bit = (x&1);
                        freq[j] += last_bit;
                        j +=1;
                        x= x>>1;
                    }
            }
            System.out.println(Arrays.toString(freq));

            //next step
            for(int i =0;i<31;i++){
                freq[i] =freq[i] %3;
                //binary to decimal

                sum = sum+ freq[i] *p;
                p = p<<1;
            }
            //generate a number



            return sum;
    }

    static int power(int a, int n){
        int  ans =1;
        while (n>0){
            int last_bit  = (n&1);
            if(last_bit ==1){
                ans = ans*a;
            }
            n = n>>1;
            a =a*a;
        }
        return ans;
    }

    static int powerModulo(int a, int n,int m){
        int  ans =1;
        while (n>0){
            int last_bit  = (n&1);
            if(last_bit ==1){
                ans = (ans*a)%m;
            }
            n = n>>1;
            a =(a%m)*(a%m);
        }
        return ans %m;

        //Time complexity - O(Log N)
        //Space complexity - O(!)
    }
    public static void main(String[] args) {
            int [] arr ={2,4,4,3,2,6,6,7,7,7,2,6,4};

//            int result = uniqueNo(arr);
//        System.out.println(result);

//        int ans = power(3,8);
//        System.out.println(ans);

        System.out.println(powerModulo(2,5,3));
    }
}

package Recursion;

public class Basics {

    static void printInc(int N){
        //base case
        if(N==0){
            return;
        }
        //rec case
        printInc(N-1);// recursion will solve for n-1
        System.out.println(N);// I solve for one step
    }

    public static void main(String[] args) {
            printInc(5);
    }
}

package Arrays_Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayList {

    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> arr2d = new ArrayList<>();
            //let me create a 1D array list and add it to the 2d array list

        ArrayList<Integer> row0= new ArrayList<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);

        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,8));
         arr2d.add(row0);
         arr2d.add(row1);
         arr2d.add(row0);

         arr2d.get(2).set(0,55);
        System.out.println(arr2d);

        for(int r=0;r<arr2d.size();r++){
            for(int c=0;c<arr2d.get(r).size();c++){
                System.out.print(arr2d.get(r).get(c) + " ");
            }
            System.out.println();
        }




    }

    //create a function to read 2d arraylist
    public static ArrayList<ArrayList<Integer>> readArrayList(){
        //N rows
        //M cols

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr2d = new ArrayList<>(N);

        for(int i=0;i<N;i++){
            arr2d.add(new ArrayList<Integer>(M));//row object
            for(int j=0;j<M;j++){
                int no = sc.nextInt();
                arr2d.get(i).add(no);//pushing data inside row
            }
        }

        return arr2d;
    }
}




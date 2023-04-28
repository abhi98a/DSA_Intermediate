package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {

    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{3,4},{0,2},{1,4},{1,3}};

        //sort according to the distance from the origin

        Arrays.sort(coordinates,(int[] o1, int[] o2)->(o1[0]-o2[0]));

        System.out.println(Arrays.deepToString(coordinates));

        //Arrays.sort(coordinates,(int[] o1, int[] o2)->((o1[0]*o1[0]+o1[1]*o1[1]) -(o2[0]*o2[0]+o2[1]*o2[1])));

        Arrays.sort(coordinates, Comparator.comparingInt((int[] o)->(o[0]*o[0]+o[1]*o[1])));

        System.out.println(Arrays.deepToString(coordinates));

        //sort
        //Books according to price using lambda function(Compare to )
        // Arrays.sort(books,(Book b1, Book b2)->(b.price -b2.price));

        //System.out.println(Arrays.deepToString(books));





    }
}

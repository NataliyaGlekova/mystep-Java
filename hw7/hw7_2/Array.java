package teach.homework.hw7.hw7_2;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int [][]arr = new int [2][3];
        int [] arr1 = new int [3];
        int [] arr2 = new int [3];
        Random rnd = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rnd.nextInt(6);
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rnd.nextInt(5) + 6;
        }
        arr[0]= arr1;
        arr[1] = arr2;


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 1; j++) {
//                arr[j+1][i]= arr2[i];
//                arr[j][i] = arr1[i];
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

package teach.homework.hw7.hw7_8;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(5);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum = sum + arr[0][j];
        }
        System.out.println(sum);


    }
}

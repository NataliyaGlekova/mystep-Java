package teach.homework.hw7.hw7_9;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(30);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int j = 0; j < arr[1].length; j++) {
            sum = sum + arr[1][j];
        }
        System.out.println(sum);


    }

}



package teach.homework.hw7.hw7_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

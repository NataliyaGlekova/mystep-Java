package teach.homework.hw7.hw7_3;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
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
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 3){
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ведите индекс");
        Scanner scn = new Scanner(System.in);
        int index = scn.nextInt();

        for (int i = 0; i < arr[index].length; i++) {
            System.out.println(arr[index][i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == index){
                    System.out.println(arr[i][j]); //не работает
                }
            }
        }
    }
}

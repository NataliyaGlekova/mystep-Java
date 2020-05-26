package teach.homework.hw7.hw7_4;


import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String [][] product = new String [2][3];
        String [] prodType = {"Электроника", "Продукты"};
        for (int i = 0; i < product.length; i++) { //спросить как можно разбить в цикле на категории и вводить в соотв с ними
            System.out.println(prodType[i] + " ");
            for (int j = 0; j < product[i].length; j++) {
                System.out.println("Введите товар");
                product[i][j] = new Scanner(System.in).nextLine();
            }
        }
        for (int i = 0; i < product.length; i++) {
            System.out.print(prodType[i] + ": ");
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

    }
}

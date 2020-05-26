package teach.homework.hw9.hw9_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tovar [] tovar = new Tovar[5];
        Random rnd = new Random();
        for (int i = 0; i < tovar.length; i++) {
            tovar[i] = new Tovar("Tovar" + i, rnd.nextInt(991) +10);
        }
        for (int i = 0; i < tovar.length; i++) {
            tovar[i].print();
        }
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput != 3){
            System.out.println("1. Вывести товары эконом сегмента");
            System.out.println("2. Вывести товары премиум сегмента");
            System.out.println("3. Выход");
            userinput = scn.nextInt();
            if (userinput == 1){
                for (int i = 0; i < tovar.length; i++) {
                    System.out.println(tovar[i].GetPrice() < 500);
                }
            } else if (userinput== 2){
                for (int i = 0; i < tovar.length; i++) {
                    System.out.println(tovar[i].GetPrice() >= 500);
                }
            } else if (userinput !=3){
                System.out.println("There is no command");
            }
        }
    }
}

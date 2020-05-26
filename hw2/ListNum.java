package teach.homework.hw2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int n = scn.nextInt();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(51));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int sum = 0;
        System.out.println("size: "+list.size());
        //10 20 30
        //0  1  2
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        }

    }

package teach.homework.hw9.hw9_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone0 = new Phone();
        phone0.name = "Iphone";

        Phone[] phone = new Phone[2];
        Random rnd = new Random();
        for (int i = 0; i < phone.length ; i++) {
            phone[i] = new Phone("Phone" + i, rnd.nextInt(40001) +10000,rnd.nextInt(11)+10);
        }
        for (int i = 0; i < phone.length; i++) {
            phone[i].print();
        }

        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while(userinput != 5){
            System.out.println("1. Узнать цену самого дорогого телефона");
            System.out.println("2. Узнать самое большое количество мегапикселей в камере");
            System.out.println("3. Узнать цену самого дешевого телефона");
            System.out.println("4. Удалить телефон из массива и вывести оставшиеся");
            System.out.println("5. Выход");
            userinput = scn.nextInt();
            if (userinput ==1){
                int max = phone[0].GetPrice();
                for (int i = 0; i < phone.length; i++) {
                    if(phone[i].GetPrice() > max){
                        max = phone[i].GetPrice();
                    }
                }
                System.out.println(max);
            } else if(userinput ==2){
                int max = phone[0].GetPhonePix();
                for (int i = 0; i < phone.length; i++) {
                    if(phone[i].GetPhonePix() > max){
                        max = phone[i].GetPhonePix();
                    }
                }
                System.out.println(max);
            } else if (userinput ==3){
                int min = phone[0].GetPrice();
                for (int i = 0; i < phone.length; i++) {
                    if(phone[i].GetPrice() < min){
                        min = phone[i].GetPrice();
                    }
                }
                System.out.println(min);
            } else if(userinput ==4){
                System.out.println("Введите индекс");
                int index = scn.nextInt();
                phone[index] = null;
                for (int i = 0; i < phone.length; i++) {
                    if (phone[i] != null){
                        phone[i].print();
                    }
                }
            } else if(userinput !=5){
                System.out.println("There is no command");
            }
        }
    }
}

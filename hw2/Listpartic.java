package teach.homework.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Listpartic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput != 5) {
            System.out.println("1. Enter participant");
            System.out.println("2. Print participant");
            System.out.println("3. Check participant");
            System.out.println("4. Delete all participant");
            System.out.println("5. Exit");
            userinput = scn.nextInt();
            if (userinput ==1) {
                System.out.println("please, enter participant");
                String part = new Scanner(System.in).nextLine();
                list.add(part);
            } else if (userinput ==2) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            } else if (userinput ==3) {
                System.out.println("please, enter name");
                String part = new Scanner(System.in).nextLine();
                System.out.println(list.contains(part) + "");
            } else if (userinput ==4) {
                //list.removeAll(list);
                list.clear();
            } else if(userinput != 5) {
                System.out.println("There is no command in menu");
            }

        }
    }

}

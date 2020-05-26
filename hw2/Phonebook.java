package teach.homework.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
        public static void main(String[] args) {
            ArrayList<Long> telnumber = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int userinput = 0;
            while(userinput!=5) {
                System.out.println("1. Enter number");
                System.out.println("2. Print number");
                System.out.println("3. Check number");
                System.out.println("4. Delete number");
                System.out.println("5. Exit");
                userinput = scanner.nextInt();
                if (userinput == 1) {
                    System.out.println("please, enter number");
                    long numb = scanner.nextLong();
                    telnumber.add(numb);
                } else if(userinput == 2) {
                    for (int i = 0; i < telnumber.size(); i++) {
                        System.out.println(i+" "+telnumber.get(i));
                    }
                        //                    System.out.println("Numbers: " + telnumber + " Index: " + telnumber.index); //не поняли как выводить номер и индекс
                } else if(userinput == 3) {
                    System.out.println("please, enter number");
                    long numb = scanner.nextLong();
                    System.out.println(telnumber.contains(numb) + "");
                } else if(userinput == 4) {
                    System.out.println("please, enter number");
                    long numb = scanner.nextLong();
                    int index = telnumber.indexOf(numb);
                    System.out.println(telnumber.get(index) + " Has index: " + index);
                    telnumber.remove(index);


//                    System.out.println("Enter index");
//                    int removeNum = scanner.nextInt();
//                    telnumber.remove(removeNum);
//                    System.out.println("Number is deleted");
                } else if(userinput != 5) {
                    System.out.println("There is no command in menu");
                }
            }

        }
}

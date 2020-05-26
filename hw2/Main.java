package teach.homework.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput !=4){
            System.out.println("1. Enter");
            System.out.println("2. Registration");
            System.out.println("3. Exit");
            System.out.println("4. print");
            userinput = scn.nextInt();
            if (userinput == 1) {
                System.out.println("Enter login and password");
                String login = new Scanner(System.in).nextLine();
                String password = new Scanner(System.in).nextLine();
                User u = new User("", login, password);
                if (user.contains(u)) {
                    System.out.println("Hello " +  " !"); //не смогли добавить имя
                }else{
                    System.out.println("There is no user");
                }
            }else if (userinput == 2) {
                System.out.println("Enter Name");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter login");
                String login = new Scanner(System.in).nextLine();
                System.out.println("Enter password");
                String password = new Scanner(System.in).nextLine();
                User u = new User(name, login, password);
                user.add(u);
            } else if(userinput == 4){
                for (int i = 0; i < user.size(); i++) {
                    user.get(i).print();
                }


            }else if(userinput != 3){
                System.out.println("There is no command in menu");
            }

        }
    }
}

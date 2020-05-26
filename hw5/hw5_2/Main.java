package teach.homework.hw5.hw5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        User user = new User();
        System.out.println("Enter login");
        user.login = new Scanner(System.in).nextLine();
        System.out.println("Enter password");
        user.password = new Scanner(System.in).nextLine();
        System.out.println("Enter status");
        user.status = new Scanner(System.in).nextLine();

        while (userinput !=9){
            System.out.println("1. Вывести на консоль логин пользователя");
            System.out.println("2. Вывести на консоль пароль пользователя");
            System.out.println("3. Вывести на консоль статус пользователя");
            System.out.println("4. Изменить статус пользователя на заблокированный");
            System.out.println("5. Изменить статус пользователя на активный");
            System.out.println("6. Попытаться войти в систему ");
            System.out.println("7. Изменить логин пользователя");
            System.out.println("8. Изменить пароль пользователя");
            System.out.println("9. Выход");
            userinput = scn.nextInt();
            if(userinput == 1){
                System.out.println("Login:" + user.login);

            } else if (userinput == 2){
                System.out.println("Password:" + user.password);

            } else if (userinput == 3){
                System.out.println("Status:" + user.status);
            } else if(userinput ==4){
                System.out.println("Enter status of user: blocked");
                user.status = new Scanner(System.in).nextLine();
            } else if (userinput == 5){
                System.out.println("Enter status of user: active");
                user.status = new Scanner(System.in).nextLine();
            } else if(userinput ==6){
                User u = new User();
                System.out.println("Enter login");
                u.login = new Scanner(System.in).nextLine();
                System.out.println("Enter password");
                u.password = new Scanner(System.in).nextLine();
                boolean b = false;
                u.status = user.status;
                if (u.login.equals(user.login) && u.password.equals(user.password) && u.status.equals("active")) {
                    System.out.println("You are login");
                } else{
                    System.out.println("You are blocked");
                }
//                    b = true;
//                } else {
//                    b = false;
//                }
//                if (b == true) {
//                    System.out.println("You are login");
//                } else {
//
//                }

            } else if (userinput ==7){
                System.out.println("Enter new login");
                String login = new Scanner(System.in).nextLine();
                user.login = login;

            } else if (userinput ==8){
                System.out.println("Enter new password");
                String password = new Scanner(System.in).nextLine();
                user.password = password;
            } else if(userinput !=9) {
                System.out.println("There is no command in menu");
            }
        }

    }
}

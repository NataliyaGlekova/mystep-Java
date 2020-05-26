package teach.homework.hw6.hw6_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random index = new Random();
        User [] user = new User[10];
        for (int i = 0; i < user.length; i++) {
            user[i] = new User();
            user[i].login = "User" + i;
            user[i].password = "zxc" + i;
            System.out.println(user[i].login + " "+ user[i].password);
        }
        System.out.println();
        String login = user[0].login;
        user[0].login = user[1].login;
        user[1].login = login;
        for (int i = 0; i < user.length ; i++) {
            System.out.println(user[i].login + " " + user[i].password);
        }
////        System.out.println();
////                User u = user[8];
////                user[8] = user[9];
////                user[9] = u;
////                for (int i = 0; i < user.length ; i++) {
////        System.out.println(user[i].login + " " + user[i].password);
////        }
//        System.out.println();
//            user [0] = user[9];
//        for (int i = 0; i < user.length ; i++) {
//            System.out.println(user[i].login + " " + user[i].password);
//        }

        }
        }

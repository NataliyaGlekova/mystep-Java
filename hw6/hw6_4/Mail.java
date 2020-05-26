//package teach.homework.hw6.hw6_4;
//
//import java.util.Scanner;
//
//public class Mail {
//    public static void main(String[] args) {
//        Contact[] contact = new Contact[10];
//
//        for(int i=0; i<contact.length; i++){
//            contact[i] = new Contact();
//            contact[i].name = "Name" + i;
//            contact[i].phone = "8903900001" + i;
//            if(i>0 && i<3){
//                contact[i].type = "home";
//            }else if(i>=3 && i<8){
//                contact[i].type = "work";
//            }else{
//                contact[i].type = "other";
//            }
//        }
//        for (int i = 0; i < contact.length ; i++) {
//            System.out.println(contact[i].name + " " + contact[i].phone + " " + contact[i].type);
////            1. Вывести контакт под индексом (пользователь вводит с консоли индекс и программа выводит данные контакта под этим индексом)
////            2. Поменять тип у двух контактов местами (только тип) под индексами (пользователь вводит два индекса и оба элемента менются типами контактов с сохранением остальных значений)
////            3. Поменять местами в массиве два объекта под индексами (пользователь вводит два индекса, в массиве меняются местами два объекта под этими индексами)
////            4. Вывести телефон контакта по имени (Пользователь с консоли вводит контакта и программа выводит его телефон, если такой контакт есть в массиве)
////            5. Вывести контакты одного типа (нужный тип вводится с консоли)
////            6. Удалить ссылку на объект в элементе массива под индексом (индекс элемента вводится с консоли. Теперь не забудьте про NullPointerException при выводе всех контактов)
////            7. Вывести все контакты
////            8. Выход
//
//        }
//        Scanner scn = new Scanner(System.in);
//        int userinput = 0;
//        while (userinput !=8){
//            System.out.println("1. Вывести контакт под индексом");
//            System.out.println("2. Поменять тип у двух контактов местами");
//            System.out.println("3. Поменять местами в массиве два объекта под индексами");
//            System.out.println("4. Вывести телефон контакта по имени");
//            System.out.println("5. Вывести контакты одного типа");
//            System.out.println("6. Удалить ссылку на объект в элементе массива под индексом");
//            System.out.println("7. Вывести все контакты");
//            System.out.println("8. Выход");
//            userinput = scn.nextInt();
//            if (userinput == 1){
//                System.out.println("Ведите индекс");
//                int index = scn.nextInt();
//                System.out.println(contact[index].name + " " + contact[index].phone + " " + contact[index].type );
//            } else if (userinput ==2){
//                System.out.println("Ведите индекс 1");
//                int index = scn.nextInt();
//                System.out.println("Ведите индекс 2");
//                int index1 = scn.nextInt();
//                String type1 = contact[index].type;
//                contact[index].type = contact[index1].type;
//                contact[index1].type = type1;
//            } else if(userinput ==3){
//                System.out.println("Ведите индекс 1");
//                int index = scn.nextInt();
//                System.out.println("Ведите индекс 2");
//                int index1 = scn.nextInt();
//                Contact c = contact[index];
//                contact[index] = contact[index1];
//                contact[index1] = c;
//
//            } else if (userinput ==4){
//                System.out.println("Ведите имя");
//                String name = new Scanner(System.in).nextLine();
//                for (int i = 0; i < contact.length; i++) {
//                    if (contact[i].name.equals(name)){
//                        System.out.println(contact[i].phone);
//                    }
//                }
//            } else if (userinput ==5){
//                System.out.println("Введите тип контакта: home, work, other");
//                String type = new Scanner(System.in).nextLine();
//                for (int i = 0; i < contact.length; i++) {
//                    if (contact[i].type.equals(type)){
//                        System.out.println(contact[i].name + " " + contact[i].phone);
//                    }
//                }
//
//            } else if (userinput == 6){
//                System.out.println("Введите индекс");
//                int index = scn.nextInt();
//                for (int i = 0; i < contact.length; i++) {
//                    if (contact[i] == contact[index]){
//                        contact[i] = null;
//                    }
//                }
//            } else if (userinput == 7){
//                for (int i = 0; i < contact.length; i++) {
//                    if(contact[i] != null){
//                        System.out.println(contact[i].name + " " + contact[i].phone + " " + contact[i].type );
//                    }
//                }
//            } else if (userinput != 8){
//                System.out.println("There is no command");
//
//            }
//
//        }
//
//
//
//    }
//}

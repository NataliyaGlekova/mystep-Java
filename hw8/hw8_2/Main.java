package teach.homework.hw8.hw8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        for (int i = 0; i < book.arrContact.length; i++) {
            book.arrContact[i] = new Contact();
            book.arrContact[i].name = "Name" + i;
            book.arrContact[i].number = "8903555025" + i;
            if(i>0 && i <3){
                book.arrContact[i].type = "домашний";
            } else if(i>=3 && i<5){
                book.arrContact[i].type = "рабочий";
            } else {
                book.arrContact[i].type = "прочие";
            }
        }
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput != 8){
            System.out.println("1. Вывести контакт под индексом");
            System.out.println("2. Поменять тип у двух контактов местами");
            System.out.println("3. Поменять местами в массиве два объекта под индексами");
            System.out.println("4. Вывести телефон контакта по имени");
            System.out.println("5. Вывести контакты одного типа");
            System.out.println("6. Удалить ссылку на объект в элементе массива под индексом");
            System.out.println("7. Вывести все контакты");
            System.out.println("8. Выход");
            userinput = scn.nextInt();
            if (userinput ==1){
                System.out.println("Введите индекс");
                int contactIndex = scn.nextInt();
                book.printContact(contactIndex);
            } else if(userinput ==2){
                System.out.println("ВВедите индекс 1");
                int index1 = scn.nextInt();
                System.out.println("ВВедите индекс 2");
                int index2 = scn.nextInt();
                book.swapContactType(index1, index2);
            } else if(userinput == 3){
                System.out.println("ВВедите индекс 1");
                int index1 = scn.nextInt();
                System.out.println("ВВедите индекс 2");
                int index2 = scn.nextInt();
                book.swapContacts(index1, index2);
            } else if(userinput ==4){
                System.out.println("Введите имя");
                String name = new Scanner(System.in).nextLine();
                book.printContactByName(name);
            } else if(userinput ==5){
                System.out.println("Введите тип");
                String type = new Scanner(System.in).nextLine();
                book.printContactByType(type);
            } else if(userinput ==6){
                System.out.println("Введите индекс");
                int index = scn.nextInt();
                book.removeContact(index);
            } else if(userinput ==7){
                book.printAllContactc();
            } else if(userinput != 8){
                System.out.println("There is no command");
            }

        }
//        1. Вывести контакт под индексом (пользователь вводит с консоли индекс и программа выводит данные контакта под этим индексом) - создаем метод printContact(int contactIndex) в классе PhoneBook
//        В меню должно быть что-то типа: phoneBook.printContact(здесь ваш индекс контакта)
//        2. Поменять тип у двух контактов местами (только тип) под индексами (пользователь вводит два индекса и оба элемента менются типами контактов с сохранением остальных значений) - создаем метод swapContactType(int contactIndex1, int contactIndex2) в классе PhoneBook
//        3. Поменять местами в массиве два объекта под индексами (пользователь вводит два индекса, в массиве меняются местами два объекта под этими индексами) - создаем метод swapContacts(int contactIndex1, int cotactIndex2)
//        4. Вывести телефон контакта по имени (Пользователь с консоли вводит контакта и программа выводит его телефон, если такой контакт есть в массиве) - создаем метод printContactByName(String name)
//        5. Вывести контакты одного типа (нужный тип вводится с консоли) - создаем метод printContactByType(String type)
//        6. Удалить ссылку на объект в элементе массива под индексом (индекс элемента вводится с консоли. Теперь не забудьте про NullPointerException при выводе всех контактов) - создаем метод removeContact(int index)
//        7. Вывести все контакты - создаем метод printAllContactc()
//        8. Выход
    }

}

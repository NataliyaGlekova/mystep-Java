package teach.homework.hw6.hw6_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Name";
        book.page = new Page[5];
        /*
        {
        [0] = new Page()
        [1]= null
        [2]
        [3]
        [4]

        }
         */
        for (int i = 0; i < book.page.length; i++) {
            book.page[i] = new Page(); //спросить что подразумевается под созданием обекта, для чего создаем??
            book.page[i].pageNumber = 1 + i;
            book.page[i].text = "Hello" + i;

        }
        for (int i = 0; i < book.page.length; i++) {
            System.out.println(book.name + " " + book.page[i].pageNumber + " " + book.page[i].text );
        }
//        1. Вывести все страницы из книги (на консоль выводятся их номера и текст)
//        2. Вывести текст со страницы под номером (пользователь вводит индекс страницы)
//        3. Изменить текст странцы под номером (пользователь вводит индекс страницы и новый текст для нее)
//        4. Обменять две страницы местами (пользователь вводит два индекса и два объекта страницы под этими индексами меняются местами)
//        5. Обменять текст двух страниц местами (пользователь вводит два индекса и текст у двух объектов страниц меняется местами, номера страниц не меняются)
//        6. Удалить страницу под номером (пользователь вводит индекс страницы, не забываем теперь про NullPointerException при выборе пунктов меню)
//        7. Выход
        int userinput = 0;
        Scanner scn = new Scanner(System.in);
        while (userinput!=7){
            System.out.println("1. Вывести все страницы из книги");
            System.out.println("2. Вывести текст со страницы под номером");
            System.out.println("3. Изменить текст странцы под номером");
            System.out.println("4. Обменять две страницы местами");
            System.out.println("5. Обменять текст двух страниц местами");
            System.out.println("6. Удалить страницу под номером");
            System.out.println("7. Выход");
            userinput = scn.nextInt();
            if (userinput == 1){
                for (int i = 0; i < book.page.length; i++) {
                    if(book.page[i] != null) {
                        System.out.println(book.page[i].pageNumber + " " + book.page[i].text);
                    }
                }
            } else if(userinput == 2){
                System.out.println("Введите страницу");
                int index = scn.nextInt();
                System.out.println(book.page[index].text);
//                for (int i = 0; i < book.page.length; i++) {
//                    if(book.page[i].pageNumber == index){
//                        System.out.println(book.page[i].text);
//                    }
//                }
            } else if(userinput == 3){
                System.out.println("Введите страницу");
                int index = scn.nextInt();
                for (int i = 0; i < book.page.length; i++) {
                    if(book.page[i].pageNumber == index) {
                        System.out.println("ВВедите новый текст");
                        String newText = new Scanner(System.in).nextLine();
                        book.page[i].text = newText;
                    }
                }
            } else if(userinput == 4){
                System.out.println("Введите страницы");
                int index = scn.nextInt();
                int index1 = scn.nextInt();
                Page p = book.page[index];
                book.page[index] = book.page[index1];
                book.page[index1] = p;

            } else if(userinput ==5){
                System.out.println("Введите страницы");
                int index = scn.nextInt();
                int index1 = scn.nextInt();
                String p = book.page[index].text;
                book.page[index].text = book.page[index1].text;
                book.page[index1].text = p;

            } else if(userinput ==6){
                System.out.println("Введите страницы");
                int index = scn.nextInt();
                book.page[index] = null;
            } else if(userinput != 7){
                System.out.println("There is no command");
            }
        }


    }
}

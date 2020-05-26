package teach.homework.hw8.hw8_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.nameOfBook = "Java";
        for (int i = 0; i < book.page.length; i++) {
            book.page[i] = new Page();
            book.page[i].number = i;
            book.page[i].text = "text" + i;
        }
//        Создать консольное меню:
//        1. Вывести все страницы из книги (на консоль выводятся их номера и текст) - создаем метод printPages() в классе Book, который будет их выводить.
//                В меню вывод всех страниц должен быть: book.printPages()
//        2. Вывести текст со страницы под номером (пользователь вводит индекс страницы) - создаем метод printTextPage(int index) в классе Book
//        В меню должно быть: book.printTextPage(здесь ваш индекс страницы);
//        3. Изменить текст странцы под номером (пользователь вводит индекс страницы и новый текст для нее) - создаем changePageText(int pageIndex, String newText) в классе Book
//        В меню должно быть: book.changePageText(здесь ваш индекс страницы, новый текст на этой странице);
//        4. Обменять две страницы местами (пользователь вводит два индекса и два объекта страницы под этими индексами меняются местами) - создаем метод swapPages(int index1, int index2) В классе Book
//        В меню должно быть: book.swapPages(здесь ваш индекс страницы1, здесь ваш индекс страницы2);
//        5. Обменять текст двух страниц местами (пользователь вводит два индекса и текст у двух объектов страниц меняется местами, номера страниц не меняются) - создаем метод swapPageText(int pageIndex1, int pageIndex2)
//        6. Удалить страницу под номером (пользователь вводит индекс страницы, не забываем теперь про NullPointerException при выборе пунктов меню) - создаем метод removePage(int pageIndex)
//        7. Выход
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput != 7){
            System.out.println("1. Вывести все страницы из книги");
            System.out.println("2. Вывести текст со страницы под номером");
            System.out.println("3. Изменить текст странцы под номером");
            System.out.println("4. Обменять две страницы местами");
            System.out.println("5. Обменять текст двух страниц местами");
            System.out.println("6. Удалить страницу под номером");
            System.out.println("7. Выход");
            userinput = scn.nextInt();
            if (userinput == 1){
                book.printPages();
            }else if(userinput == 2){
                System.out.println("Введите индекс страницы");
                int index = scn.nextInt();
                book.printTextPage(index);
            }else if(userinput ==3){
                System.out.println("Ведите индекс страницы");
                int index = scn.nextInt();
                System.out.println("Введите новый текст");
                String newText = new Scanner(System.in).nextLine();
                book.changePageText(index, newText);
            }else if(userinput ==4){
                System.out.println("Введите индекс страницы 1");
                int index1= scn.nextInt();
                System.out.println("Введите индекс страницы 2");
                int index2= scn.nextInt();
                book.swapPages(index1,index2);
            }else if(userinput ==5){
                System.out.println("Введите индекс страницы 1");
                int index1= scn.nextInt();
                System.out.println("Введите индекс страницы 2");
                int index2= scn.nextInt();
                book.swapPageText(index1, index2);
            }else if(userinput ==6){
                System.out.println("Введите индекс страницы");
                int index = scn.nextInt();
                book.removePage(index);
            }else if(userinput == 7){
                System.out.println("There is no command");
            }
        }
    }
}

package teach.homework.hw3;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userinput = 0;

        //Books
//        ArrayList<Book> book = new ArrayList<>();
//        while (userinput !=6) {
//            System.out.println("1. Add book");
//            System.out.println("2. Delete book");
//            System.out.println("3. Find book");
//            System.out.println("4. Delete all books");
//            System.out.println("5. Print all books");
//            System.out.println("6. Exit");
//            userinput = scn.nextInt(); иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии ииии  и ии  и
//            if (userinput == 1) {
//                System.out.println(contains"Enter author and book");
//                String author = new Scanner(System.in).nextLine();
//                String bookname = new Scanner(System.in).nextLine();
//                Book b = new Book(author, bookname);
//                book.add(b);
//            } else if (userinput == 2) {
//                System.out.println("Enter author and book");
//                String author = new Scanner(System.in).nextLine();
//                String bookname = new Scanner(System.in).nextLine();
//                Book b = new Book(author, bookname);
//                book.remove(b);
//            } else if(userinput == 3) {
//                System.out.println("Enter author and book");
//                String author = new Scanner(System.in).nextLine();
//                String bookname = new Scanner(System.in).nextLine();
//                Book b = new Book(author, bookname);
//                if (book.contains(b)) {
//                    System.out.println("Book: " + author + " " + bookname);
//                } else {
//                    System.out.println("There is no book");
//                }
//            } else if(userinput == 4) {
//                book.clear();
//            } else if (userinput == 5) {
//                for (int i = 0; i < book.size(); i++) {
//                    book.get(i).print();
//                }
//            }else if(userinput !=6 ) {
//                System.out.println("There is no command");
//            }
//        }

        //Studens
        ArrayList<Studens> studens = new ArrayList<>();
        while (userinput !=6){
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Print all student");
            System.out.println("4. Find student");
            System.out.println("5. student with average >3");
            System.out.println("6. Exit");
            userinput = scn.nextInt();
            if (userinput ==1){
                System.out.println("Enter name");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter 3 mark");
                int mark1 = scn.nextInt();
                int mark2 = scn.nextInt();
                int mark3 = scn.nextInt();
                Studens s = new Studens(name, mark1, mark2, mark3);
                studens.add(s);
            }else if (userinput ==2){
                System.out.println("Enter name");
                String name = new Scanner(System.in).nextLine();
                Studens s = new Studens(name,0, 0, 0);
                studens.remove(s);
            }else if (userinput ==3){
                for (int i = 0; i < studens.size(); i++){
                    System.out.println(i + " " + studens.get(i).name + " "+studens.get(i).average() );//вывод среднего балла
                }
            }else if (userinput ==4){
                System.out.println("Enter name");
                String name = new Scanner(System.in).nextLine();
                Studens s = new Studens(name,0, 0, 0);
                if (studens.contains(s)) {
                    System.out.println("Student " + name); //как вывести оценки
                    for (int i = 0; i < studens.size(); i++) {
                        if(studens.get(i).equals(s)){
                            studens.get(i).printInfo();
                        }
                    }
                }else {
                    System.out.println("There is no student");
                }
            }else if(userinput !=5){
                for (int i = 0; i < studens.size(); i++){
                    if(studens.get(i).average()>3){
                        System.out.println(studens.get(i).name+" "+studens.get(i).average());
                    }
                }

            }

        }
    }
}

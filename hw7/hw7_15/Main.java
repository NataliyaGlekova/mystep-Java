package teach.homework.hw7.hw7_15;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        University university = new University();
        university.rating = rnd.nextInt(10) +1;

        for (int i = 0; i < university.arrStudent.length; i++) {
            Student student = new Student();
            student.nameSt = "Name" + i;
            university.arrStudent[i] = student;
            for (int j = 0; j < student.massive.length; j++) {
                Mark mark = new Mark();
                mark.nameOfSubject = "Subj" + i;
                mark.mark = j + 1;
                student.massive[j] = mark;
            }
        }
        Scanner scn = new Scanner(System.in);
        int userinput = 0;
        while (userinput != 6){
            System.out.println("1. Вывести рейтинг университета");
            System.out.println("2. Вывести имена всех студентов в университете");
            System.out.println("3. Вывести оценки студента (пользователь с консоли вводит индекс студента)");
            System.out.println("4. Вывести всех студентов и их оценки");
            System.out.println("5. Найти студента с наивысшим средним баллом по оценкам и вывести его имя и средний балл на консоль");
            System.out.println("6. Выход");
            userinput = scn.nextInt();
            if (userinput == 1){
                System.out.println(university.rating);
            } else if (userinput == 2){
                for (int i = 0; i < university.arrStudent.length; i++) {
                    Student student = university.arrStudent[i];
                    System.out.println(student.nameSt);
                }
            } else if(userinput ==3){
                System.out.println("Введите индекс студента");
                int index = scn.nextInt();
                System.out.print(university.arrStudent[index].nameSt);
                for (int i = 0; i < university.arrStudent[index].massive.length; i++) {
                    System.out.println(university.arrStudent[index].massive[i].mark);
                }
            }else if(userinput==4){
                for (int i = 0; i < university.arrStudent.length; i++) {
                    Student student = university.arrStudent[i];
                    System.out.println(student.nameSt);
                    for (int j = 0; j < student.massive.length; j++) {
                        Mark mark = student.massive[i];
                        System.out.println(mark.mark);
                    }
                }
            } else if(userinput ==5){
                double maxAverageMrk = 0;
                int index = 0;
                for (int i = 0; i < university.arrStudent.length; i++) {
                    Student student = university.arrStudent[i];
                    System.out.println(student.nameSt);
                    int sum = 0;
                    for (int j = 0; j < student.massive.length; j++) {
                        sum = sum + student.massive[i].mark;
                    }
                    double averegaMark = sum / student.massive.length;
                    if(averegaMark > maxAverageMrk){
                        maxAverageMrk = averegaMark;
                        index =i;
                    }
                }
                System.out.println(university.arrStudent[index].nameSt+" "+maxAverageMrk);
            } else if(userinput != 6){
                System.out.println("Нет такой комманды");
            }
        }
    }
}

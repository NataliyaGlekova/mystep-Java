package teach.homework.hw3.hw3_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            Random rnd = new Random();
            int userinput = 0;

            //Studens
            ArrayList<Student> studens = new ArrayList<>();
            while (userinput !=6){
                System.out.println("1. Add student");
                System.out.println("2. Delete student");
                System.out.println("3. Print all student");
                System.out.println("4. Find student");
                System.out.println("5. student with average >3");
                System.out.println("6. student from University ....");
                System.out.println("7. student from University ... with average >3");
                System.out.println("8. Exit");
                userinput = scn.nextInt();
                if (userinput ==1){
                    System.out.println("Enter name and University");
                    String name = new Scanner(System.in).nextLine();
                    String univer = new Scanner(System.in).nextLine();
                    System.out.println("Enter 3 mark");
                    int mark1 = rnd.nextInt(11);
                    int mark2 = rnd.nextInt(11);
                    int mark3 = rnd.nextInt(11);
                    Student s = new Student(name, univer, mark1, mark2, mark3);
                    studens.add(s);
                }else if (userinput ==2){
                    System.out.println("Enter name");
                    String name = new Scanner(System.in).nextLine();
                    Student s = new Student(name,"",0, 0, 0);
                    studens.remove(s);
                }else if (userinput ==3){
                    for (int i = 0; i < studens.size(); i++){
                        System.out.println(i + " " + studens.get(i).name + " "+studens.get(i).average() );//вывод среднего балла
                    }
                }else if (userinput ==4){
                    System.out.println("Enter name");
                    String name = new Scanner(System.in).nextLine();
                    Student s = new Student(name,"",0, 0, 0);
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
                }else if(userinput ==5){
                    for (int i = 0; i < studens.size(); i++){
                        if(studens.get(i).average()>3){
                            System.out.println(studens.get(i).name+" "+studens.get(i).average());
                        }
                    }
                }else if(userinput ==6){
                    System.out.println("Enter University");
                    String univer = new Scanner(System.in).nextLine();
                    if(studens.contains(univer)){
                        System.out.println(univer + studens);
                    }
                }else if(userinput ==6){ //доделать

                }



//            }else if(userinput !=6 ) {
//                System.out.println("There is no command");
//            }
            }
        }
    }

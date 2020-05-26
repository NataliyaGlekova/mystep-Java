package teach.homework.hw5.hw5_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student [] st = new Student[10];
        Random r = new Random();
        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();
            st[i].name = "Student" + i;
            st[i].age = r.nextInt(18);
            st[i].average = r.nextInt(10);
            System.out.println(st[i].name + " " + st[i].age + " " + st[i].average);

        }
        System.out.println();
        Student maxStudent = st[0];
        for (int i = 0; i < st.length ; i++) {
            if(st[i].average > maxStudent.average)
                maxStudent = st[i];
        }
        System.out.println(maxStudent.name + " " + maxStudent.age + " " + maxStudent.average);
        Student minStudent = st[0];
        for (int i = 0; i < st.length ; i++) {
            if (st[i].average < minStudent.average)
                minStudent = st[i];
        }
        System.out.println(minStudent.name + " " + minStudent.age + " " + minStudent.average);


    }
}

package teach.homework.hw5.hw5_5;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Ivan";
        st.mark = 3;
        st.average = 4;

        Student st1 = new Student();
        st1.name = "Vova";
        st1.mark = 5;
        st1.average = 5;

        System.out.println(st.name + " " + st.mark + " " + st.average + " "+ st1.name + " " + st1.mark + " " + st1.average);

//        Student st3 = st;
//        st = st1;
//        st1 = st3;
//        System.out.println(st.name + " " + st.mark + " " + st1.name + " " + st1.mark);

        String name1 = st.name;
        int mark1 = st.mark;

        st.name = st1.name;
        st.mark = st1.mark;
        st1.name = name1;
        st1.mark = st1.mark;

        System.out.println(st.name + " " + st.mark + " " + st.average + " "+ st1.name + " " + st1.mark + " " + st1.average);



    }
}

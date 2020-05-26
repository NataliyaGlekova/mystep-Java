package teach.homework.hw3.hw3_1;

public class Student {

        public String name;
        public String nameOfUniversity;
        public int mark1;
        public int mark2;
        public int mark3;

    public Student(String name, String nameOfUniversity, int mark1, int mark2, int mark3) {
        this.name = name;
        this.nameOfUniversity = nameOfUniversity;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

        public void printInfo(){
            System.out.println(mark1+" "+mark2+" "+mark3);
        }
        @Override
        public boolean equals(Object obj) {
            Student s = (Student)obj;
            return name == s.name;
        }
        public int average(){
            return (mark1 + mark2 + mark3)/3;
        }

}

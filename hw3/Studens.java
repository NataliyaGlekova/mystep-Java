package teach.homework.hw3;

public class Studens {
    public String name;
    private int mark1;
    private int mark2;
    private int mark3;

    public Studens(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void printInfo(){
        System.out.println(mark1+" "+mark2+" "+mark3);
    }
    @Override
    public boolean equals(Object obj) {
        Studens s = (Studens)obj;
        return name == s.name;
    }
    public int average(){
        return (mark1 + mark2 + mark3)/3;
    }

}

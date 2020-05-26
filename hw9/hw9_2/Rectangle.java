package teach.homework.hw9.hw9_2;

public class Rectangle {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void printSide(){
        System.out.println(a + " " + b);
    }
    public int square(){
        return a * b;
    }
    public int perimetr(){
        return 2*(a + b);
    }
}

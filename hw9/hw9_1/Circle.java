package teach.homework.hw9.hw9_1;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }
    public double area(){
        return 2 * Math.PI * r;
    }
    public void ptintR(){
        System.out.println(r);
    }
}

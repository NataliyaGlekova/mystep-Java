package teach.homework.hw1;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }


    public double GetSquare() {
      return Math.PI * r * r;
    }
}

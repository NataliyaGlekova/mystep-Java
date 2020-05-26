package teach.homework.hw1;

public class Parallepiped {
    double length;
    double width;
    double height;

    public Parallepiped (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double GetSquare() {
        return 2*(length*width + width*height + length*height);
    }
    public double GetPerimetr() {
        return 4*(length + width + height);
    }
    public double GetVolume() {
        return (length * width * height);
    }

    public int EqualFigure(Parallepiped p) {
        double result1 = GetVolume();
        double result2 = p.GetVolume();
        return 0;

    }
}


package teach.homework.hw9.hw9_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle [] circle = new Circle[2];
        Random rnd = new Random();
        for (int i = 0; i < circle.length; i++) {
            //circle[i] = new Circle(2+ (8)*rnd.nextDouble());
            circle[i] = new Circle(rnd.nextInt(8)+2);
//            double square = circle[i].area();
        }
        for (int i = 0; i < circle.length; i++) {
            circle[i].ptintR();
        }
        for (int i = 0; i < circle.length; i++) {
            System.out.println(circle[i].area());
        }

    }
}

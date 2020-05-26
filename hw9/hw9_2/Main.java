package teach.homework.hw9.hw9_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rec = new Rectangle[2];
        Random rnd = new Random();
        for (int i = 0; i < rec.length; i++) {
           rec[i] = new Rectangle(rnd.nextInt(9)+2, rnd.nextInt(11)+2);
        }
        for (int i = 0; i < rec.length; i++) {  //не работает
            rec[i].printSide();
        }
        for (int i = 0; i < rec.length; i++) {
            System.out.println(rec[i].perimetr());
        }
        for (int i = 0; i < rec.length; i++) {
            System.out.println(rec[i].square());
        }

    }

}

package teach.homework.hw7.hw7_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product [][] pr = new Product[3][4];
        Random rnd = new Random();
        for (int i = 0; i < pr.length; i++) {
            for (int j = 0; j < pr[i].length; j++) {
                pr[i][j] = new Product();
                pr[i][j].price = rnd.nextInt(10);
                pr[i][j].name = "name"+i;
            }
        }
        for (int i = 0; i < pr.length; i++) {
            for (int j = 0; j < pr[i].length; j++) {
                System.out.print(pr[i][j].price + "_"+pr[i][j].name+" ");
            }
            System.out.println();
        }


    }
}

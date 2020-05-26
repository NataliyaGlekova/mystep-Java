package teach.homework.hw6.hw6_3;

public class Main {
    public static void main(String[] args) {
        Product pTask3 = new Product();
        pTask3.name = "banana";
        pTask3.price = 120;


        Product[] pr = new Product[2];
        pr[0] = pTask3;
        pr[1] = pTask3;

        pr[0].price = 100;
        System.out.println(pTask3.price);
        System.out.println(pr[1].price);
    }
}

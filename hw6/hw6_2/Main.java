package teach.homework.hw6.hw6_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "apple";
        product.price = 100;
        Product f1 = product;
        Product f2 = product;
        Product f3 = product;

        f1.name = "orange";
        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);

    }
}

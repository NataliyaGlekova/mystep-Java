package teach.homework.hw5.hw5_4;

public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.name = "apple";
        f1.price = 10;

        Fruit f2 = new Fruit();
        f2.name = "orange";
        f2.price = 20;

        String str = f1.name;
        f1.name = f2.name;
        f2.name = str;
    }

}

package teach.homework.hw1;

public class Product {
    String name;
    int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println(name+" "+price);
    }
}

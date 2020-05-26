package teach.homework.hw9.hw9_6;

public class Tovar {
    String name;
    int price;


    public Tovar (String name, int price){
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println(name + " " + price);
    }
}

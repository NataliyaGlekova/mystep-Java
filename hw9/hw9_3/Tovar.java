package teach.homework.hw9.hw9_3;

public class Tovar {
    public String name;
    public int price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println(name + " " + price);
    }
    public int GetPrice(){
        return price;
    }

}

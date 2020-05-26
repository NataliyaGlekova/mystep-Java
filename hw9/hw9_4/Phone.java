package teach.homework.hw9.hw9_4;

public class Phone {
    String name;
    int price;
    int pixel;

    public Phone(){
        name = "Ivan";
        price = 0;
        pixel = 0;
    }

    public Phone(String name, int price, int pixel) {
        this.name = name;
        this.price = price;
        this.pixel = pixel;
    }
    public void print(){
        System.out.println(name + " " + price + " " + pixel);
    }
    public int GetPrice(){
        return price;
    }
    public int GetPhonePix(){
        return pixel;
    }
}

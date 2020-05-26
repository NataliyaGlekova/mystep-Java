package teach.homework.hw9.hw9_6;

public class TovarDataBase {
    Tovar[] arrTovar;

    public TovarDataBase() {
        arrTovar = new Tovar[5];
    }

    public TovarDataBase(int size) {
        arrTovar = new Tovar[size];
    }
    public void add(String name, int price, int index){
        arrTovar[index] = new Tovar(name, price);
    }
    public void add(Tovar tovar, int index){
        arrTovar[index] = tovar;
    }
}

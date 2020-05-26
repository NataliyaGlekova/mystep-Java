package teach.homework.hw9.hw9_6;

public class Main {
    public static void main(String[] args) {
        TovarDataBase tovarDataBase1 = new TovarDataBase(); //создастся массив на 5 элементв
        TovarDataBase tovarDataBase2 = new TovarDataBase(3); //создастся массив на 3 элемена
//        for (int i = 0; i < tovarDataBase2.arrTovar.length; i++) {
//            tovarDataBase2.add("tovar"+i, i*10, i);
//        }

        for (int i = 0; i < tovarDataBase2.arrTovar.length; i++) {
            tovarDataBase2.add(new Tovar("tovar"+i, i*10), i);
        }
    }
}

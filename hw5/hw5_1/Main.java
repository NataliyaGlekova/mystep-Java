package teach.homework.hw5.hw5_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.name = "apple";
        f1.price = 50;
        f1.benefit = 5;

        Fruit f2 = new Fruit();
        f2.name = "banana";
        f2.price = 80;
        f2.benefit = 4;

        //правильный ответ
        f1.price = f2.price;
        System.out.println(f1.name);

//        System.out.println(f1.name + " "+ f1.price + " "+ f1.benefit+ " " + f2.name+ " " + f2.price+ " " + f2.benefit);

        Fruit f3 = new Fruit();
//        f3 = f1;
        f3.name = f1.name;
        f3.price = f1.price;
        f3.benefit = f1.benefit;
        System.out.println(f3.name + f3.price + f3.benefit);

        //верные варианты
//        Fruit[] arr = new Fruit[];
        Random ran = new Random();
        Fruit[] arr = new Fruit[15];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Fruit();
            arr[i].name = "fruit" + i;
            arr[i].price = ran.nextInt(151);
            arr[i].benefit = ran.nextInt(6);
            System.out.println(arr[i].name + " " + arr[i].price + " " + arr[i].benefit);
        }
//        System.out.println(arr[0].name);
        Fruit maxprice = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].price > maxprice.price)
                maxprice = arr[i];
        }
        System.out.println(maxprice);
        Fruit minprice = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].price < minprice.price)
                minprice = arr[i];
        }
        System.out.println(minprice);
        Fruit bestbenefit = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].benefit > bestbenefit.benefit)
                bestbenefit = arr[i];
        }
        System.out.println(bestbenefit);
        Fruit useless = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].benefit < useless.benefit)
                useless = arr[i];
        }
        System.out.println(useless);

    }

}

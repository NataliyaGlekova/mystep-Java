package teach.homework.hw8.hw8_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Random rnd = new Random();

        for (int i = 0; i < shop.car.length; i++) {
            Car car = new Car();
            car.nameOfCar = "Car" + i;
            car.maxSpeed = rnd.nextInt(201)+50;
            shop.car[i] = car;
        }


//        1. Вывести все авто на консоль - создаем метод printCars() в классе Shop
//        В меню должно быть что-то типа: shop.printCars()
//        2. Удалить из массива ссылки на объекты, чья максимальная скорость ниже 100 - создаем метод removeSlowCars() в классе Shop
//        В меню должно быть что-то типа: shop.removeSlowCars()
//        3. Выход
        int userinput = 0;
        Scanner scn = new Scanner(System.in);
        while (userinput !=3){
            System.out.println("1. Вывести все авто на консоль");
            System.out.println("2. Удалить из массива ссылки на объекты, чья максимальная скорость ниже 100");
            System.out.println("3. Выход");
            userinput = scn.nextInt();
            if (userinput == 1){
                shop.printCar();
            } else if (userinput == 2){
                shop.removeSlowCars();
            } else if (userinput != 3){
                System.out.println("There is no command");
            }
        }

    }
}

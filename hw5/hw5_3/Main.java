package teach.homework.hw5.hw5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus bus = null;
        Scanner scn = new Scanner(System.in);
        int userinput = 0;

        while (userinput!=4){
            System.out.println("1. заменить значение поля name");
            System.out.println("2. записать в переменную новый объект");
            System.out.println("3. вывести значения из объекта");
            System.out.println("4. Выход");
            userinput =scn.nextInt();
            if (userinput == 1){
                if (bus == null){
                    System.out.println("Выберете пункт 2");
                } else {
                    System.out.println("Введите название");
                    bus.name = new Scanner(System.in).nextLine();
                }
            } else if (userinput == 2){
                bus = new Bus();
                System.out.println("Название автобуса");
                bus.name = new Scanner(System.in).nextLine();
                System.out.println("Введите кол-во мест");
                bus.сountOfSeats = scn.nextInt();
            } else if (userinput ==3){
                System.out.println("Наименование: " + bus.name + " " + "Кол-во мест: " + bus.сountOfSeats);
            } else if(userinput !=4){
                System.out.println("There is no command");
            }
        }

    }
}
//    Car car = null;
//        car = new Car();
//                car.name = "bmw";
//                car.price = 100;
//                car.maxspeed = 200;
//                System.out.println(car.name+" "+car.price+" "+car.maxspeed);
//
//                car.name = "auda";
//                System.out.println(car.name+" "+car.price+" "+car.maxspeed); //выведет audi 100 200
//
//                car = new Car();
//                car.name = "lada";
//                car.price = 50;
//                car.maxspeed = 150;
//                System.out.println(car.name+" "+car.price+" "+car.maxspeed); //выведет lada 50 150
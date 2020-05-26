package teach.homework.hw6.hw6_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Car[] car = new Car[10];
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            car[i].name = "Car" + i;
            car[i].maxSpeed = rnd.nextInt(201)+50;
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].name + " " + car[i].maxSpeed);
        }
        for (int i = 0; i < car.length; i++) {
            if(car[i].maxSpeed < 100){
                car[i] = null;
            }
        }
        int count = 0;
        for (int i = 0; i < car.length; i++) {
            if(car[i] != null){
                count = count + 1;
            }
        }
        System.out.println();
        Car[] newCar = new Car[count];
        int index = 0;
        for (int i = 0; i < car.length; i++) {
            if(car[i] != null){
              newCar[index] = car[i];
              index = index +1;
            }

        }
        for (int i = 0; i < newCar.length; i++) {
            System.out.println(newCar[i].name + " " + newCar[i].maxSpeed);
        }

    }
}

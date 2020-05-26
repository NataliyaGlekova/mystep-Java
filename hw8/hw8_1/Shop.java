package teach.homework.hw8.hw8_1;

public class Shop {
    Car[] car = new Car[5];

    public void printCar(){
        for (int i = 0; i < car.length; i++) {
            if(car[i] != null){
                System.out.println(car[i].nameOfCar + " " + car[i].maxSpeed);
            }
        }
    }
    public void removeSlowCars(){
        for (int i = 0; i < car.length; i++) {
            if(car[i].maxSpeed < 100){
              car[i] = null;
            }
        }
    }
}

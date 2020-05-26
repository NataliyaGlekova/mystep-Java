package teach.homework.hw1;

public class Main {
    public static void main(String[] args) {
//        Parallepiped parallepiped = new Parallepiped(4, 3,2);
//        System.out.println("Периметр:" + parallepiped.GetPerimetr() + ""
//                + "Площадь:" + parallepiped.GetSquare() + ""
//                + "Обьем:" + parallepiped.GetVolume());
//
//        Parallepiped parallepiped1 = new Parallepiped(5, 4,3);
//        System.out.println("Периметр:" + parallepiped1.GetPerimetr() + ""
//                + "Площадь:" + parallepiped1.GetSquare() + ""
//                + "Обьем:" + parallepiped1.GetVolume());
//
//        parallepiped.EqualFigure(parallepiped1)

        //Площадь круга
//        Circle[] circle = new Circle[5];
//        for (int i = 0; i < 5; i++) {
//            circle[i] = new Circle(i + 1);
//            double square = circle[i].GetSquare();
//
//            System.out.println("Площадь: " + square); //Найти круг с наибольшим радиусом.Найти круг с наибольшей площадью.
//        }
//        double maxRadius = 0;
//        for (int i = 0; i < circle.length; i++) {
//            double square = circle[i].GetSquare();
//            if (maxRadius < square) {
//                maxRadius = square;
//            }
//        }
//        System.out.println(maxRadius);
        //Товары
        Product[] arr = new Product[5];
        arr[0] = new Product("Молоко", 50);
        arr[1] = new Product("Печенье", 60);
        arr[2] = new Product("Масло", 150);
        arr[3] = new Product("Картофель", 30);
        arr[4] = new Product("Томаты", 200);

        Product product = new Product("Томаты", 170);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(product.name)) {
                System.out.println("Продукт совпал " + product.name);
            } else {
                System.out.println("Продукт не найден " + product.name);
            }
        }
    }

}


//    public EqualFigure(Parallepiped p)




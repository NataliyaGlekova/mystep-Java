package teach.homework.hw1;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random rnd = new Random();
        //int random = rnd.nextInt(21); //генерирует одно число в диапазоне от 0 до 21 не включительно
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(6); //случайное число в диапазоне от 0 до 6 не включительно
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
            System.out.println("Минимальный элемент: " + min);

            int max = array[0];
            for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
    }
            System.out.println("Максимальный элемент: " + max);

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов: " + sum);
    }
}

package teach.homework.hw6.hw6_5;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(41)+10;
            System.out.println(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 25){
                count= count +1;
            }
        }
        System.out.println(count);
        int [] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 25){
                newArr[index] = arr[i];
                index = index +1;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[index]);
        }
    }
}

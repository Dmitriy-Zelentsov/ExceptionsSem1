package Sem1;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Ex1
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int [] array = {32,45,7567,4,7};
        // int res = arrayN(array,a);
        System.out.println(arrayN(array,a));
        // switch (res) {
        //     case -3  System.out.println("массив не может быть null");
        //     case -4 System.out.println("длинна массива равна нулю");
        //     case -1 System.out.println("массив меньше заданной длинны");
        //     case -2 System.out.printf("%d не найден в массиве", a);
        //     default System.out.printf("%d имеет индекс", a, res);
        // }

        s.close();
    }

    public static int arrayN(int[]array, int a) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0){
            return -4;
        }
        if (array.length < 3){
            return -1;
        }

        for (int i = 0; i<array.length; i++){
            if (array[i] == a) {
                return i;
            }
        }
        return -2;
    }
}

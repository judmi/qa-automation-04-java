package hw_4.part_2;/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.

 */

public class Task3 {

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //int min = array[0];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}

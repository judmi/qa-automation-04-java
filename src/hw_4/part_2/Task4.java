package hw_4.part_2;/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.

 */

public class Task4 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum / array.length);
    }
}

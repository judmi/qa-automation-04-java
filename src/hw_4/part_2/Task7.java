package hw_4.part_2;/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.

 */

public class Task7 {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int numOfElements = 0;
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            numOfElements = numOfElements + array[i].length;
        }

        System.out.println(numOfElements);
    }
}

package hw_3;

public class Task5 {

    public static void main(String[] args) {

        /* task 3.2.2
        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        вывести результат возведения в степень.
         */

        for (int i = 5; i < 10_000; i = i * 5) {
            System.out.println(i);
        }
    }
}

package hw_3;

public class Task1 {

    public static void main(String[] args) {

        /* task 1
        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения
        переменным на ваш выбор и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a
         */
        int a = 9;
        int b = 43;

        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
}

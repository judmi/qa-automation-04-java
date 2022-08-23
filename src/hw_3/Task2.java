package hw_3;

public class Task2 {
    public static void main(String[] args) {

        /* task 2
        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные
        значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная
         */

        int a = 24;
        int b = 85;

        if ((a + b) % 2 == 0){
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}

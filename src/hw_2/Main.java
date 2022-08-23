package hw_2;

public class Main {

    public static void main(String[] args) {

        /* task 1
        Необходимо создать целочисленные переменные a и b,
        присвоить произвольные значения переменным на ваш выбор и
        вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление и остаток от деления.
        Так же сделать проверку на четность этих переменных и вывести результат
        */

        int a = 23;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println((a + 0.0) / b);
        System.out.println(a % b);
        System.out.println("a is even:" + a % 2);
        System.out.println("b is odd:" + b % 2);


        /* task 2
        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
         */

        System.out.println("\ud83d\ude00");
    }
}
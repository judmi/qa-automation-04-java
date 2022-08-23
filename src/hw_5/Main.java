package hw_5;/*
Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

 */

public class Main {

    public static void main(String[] args) {

        Methods m = new Methods();

        int a = 16;
        int b = 4;

        System.out.println(m.getSum(a, b));
        System.out.println(m.getDifference(a, b));
        System.out.println(m.getMultiplication(a, b));
        System.out.println(m.getDivision(a, b));
    }

    public static boolean isLove(final int flower1, final int flower2) {

        boolean result = true;

        if (flower1 % 2 == 0) {
            if (flower2 % 2 != 0) {
                result = true;
            }
        } else if (flower2 % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        //Integer n = num;
        //return n.toString();
        //return String.valueOf(num);
        return  Integer.toString(num);
    }

}

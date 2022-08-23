package hw_4.part_1;/*
Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.

 */

public class Task2 {

    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";
        int countE = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                countE++;
            }
        }

        System.out.println(countE);
    }
}

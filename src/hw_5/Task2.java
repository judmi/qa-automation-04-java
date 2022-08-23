package hw_5;/*
0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0

 */

public class Task2 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String space = "";

        for (int i = 9; i >= 0; i--) {

            if (i < 9) {
                space = space + "  ";
                System.out.print(space);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();

        }

        for (int i = 9; i >= 0; i--) {

            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

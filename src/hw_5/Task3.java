package hw_5;/*
9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0

 */

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String space = "";

        for (int i = 9; i >= 0; i--) {
            if (i < 9) {
                space = space + "  ";
                System.out.print(space);
            }
            for (int j = i; j >= 0; j--) {

                System.out.print(arr[j] + " ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {

            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();
        }

//        for (int i = 9; i >= 0; i--) {
//
//            if (i < 9) {
//                space = space + "  ";
//                System.out.print(space);
//            }
//            for (int j = 9; j >= i; j--) {
//                System.out.print(arr[j] + " ");
//            }
//
//            System.out.println();
//
//        }
    }
}

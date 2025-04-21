public class Patterns {
    public static void main(String args[]) {
        /*
         * Qs. Print the pattern:-
         *
         **
         ***
         ****
         */

        // Solution:
        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-
         ****
         ***
         **
         *
         */

        // Solution:
        // int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:- Invert this pattern to 180 degree
                *
               **
              ***
             ****
         */

        // Solution:
        // int n = 4;

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop for printing spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // inner loop for printing stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        // Solution:
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        // Solution:
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:- (Floyd's Triangle)
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */

        // Solution:
        // int n = 5;
        // int number = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */

        // Solution:
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/
       
        /*
         * Qs. Print the pattern:-
         *    1
         *   010
         *  10101
         * 0101010
         */

        // Solution:
        // int n = 4;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop to print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        
        //     // inner loop to print 1st half of the pattern
        //     for (int j = 1; j <= i; j++) {
        //         int sum = i + j;
        //         if (sum % 2 == 0) {
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        
        //     // inner loop to print 2nd half of the pattern
        //     for (int j = i; j < (2 * i - 1); j++) {
        //         int sum = i + j;
        //         if (sum % 2 == 1) {
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:- (Butterfly Pattern)
         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *
         */

        // Solution:
        // int n = 4;

        // // upper part
        // for (int i = 1; i <= n; i++) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // // spaces
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // lower half
        // for (int i = n; i >= 1; i--) {
        // // 1st half
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // // spaces
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-(Solid Rhombus)
             *****
            *****
           *****
          *****
         *****
         * 
         */

        // Solution:
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-(Number Pyramid)
         *     1
         *    2 2
         *   3 3 3
         *  4 4 4 4
         * 5 5 5 5 5
         */

        // Solution:
        // int n = 5;

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop to print spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // inner loop to print numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-(Palindromic Pattern)
         *         1
         *       2 1 2
         *     3 2 1 2 3
         *   4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */

        // Solution:
        // int n = 5;

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop for printing spaces
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }

        // // inner loop for printing 1st half numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }

        // // inner loop for printing 2nd half number
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Print the pattern:-(Diamond Pattern)
               *
             * * *
           * * * * *
         * * * * * * *
         * * * * * * *
           * * * * *
             * * *
               *
         */

        // Solution:
        // int n = 4;

        // // upper half
        // for (int i = 1; i <= n; i++) {
        // // printing spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // printing stars
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // lower half
        // for (int i = n; i >= 1; i--) {
        // // printing spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // printing stars
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/
    }

}

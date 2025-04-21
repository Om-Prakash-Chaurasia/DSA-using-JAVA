// FUNCTIONS IN JAVA

/*
 * Functions are block of codes in Java which takes some inputs and returns us
 * the output by performing some operation
 * syntax for writing a function:-
 * returnType functionName(type arg1, type arg2...) {
 * operations
 * }
 * 
 * Return type can be integer or float or double or void whichever data-types we
 * have studied.
 * Here 'void' is the type which means 'no return'
 * But return type should be of only one type.
 * 
 * e.g. public static void main (String[] args) {}
 * Here: we will study about 'public' and 'static' keyword in further classes
 * but, for now in this, 'void' is the 'returnType', 'main' is the
 * 'functionName'. 'functionName' can be anything but not 'keywords' of Java.
 * 
 * After functionName we pass the arguments in '()' along with its dataType like
 * int, float, double, string, etc.. There can be any number of arguments.
 * e.g. public static int personDetail(String name, int age) {
 * operations
 * }
 * 
 * NOTE: The 'functionName' should be in camelCase.
 */
/*--------------------------------------------------------*/

// EXAMPLES OF FUNCTIONS

// Qs. Print a given name in a function:-

// Solution:
// import java.util.*;

// class Strings {
// public static void printMyName(String name) {
// System.out.println(name);
// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();

// printMyName(name); // function call

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// Qs. Make a function to add 2 numbers and return the sum:-

// Solution:
// import java.util.*;

// class Sum {
// public static int calculateSum(int a, int b) {
// int sum = a + b;
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = calculateSum(a, b);
// System.out.println(sum);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// Qs. Make a function to multiply 2 numbers and return their product:-

// Solution:
// import java.util.*;

// class Product {
// public static int calculateProduct(int a, int b) {

// return a * b;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();

// System.out.println(calculateProduct(a, b));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// Qs. Find the factorial of a number:-

// Solution:
// import java.util.*;

// class Factorial {
// public static void printFactorial(int n) {

// if (n < 0) {
// System.out.println("Invalid Number");
// return;
// }
// int factorial = 1;
// for (int i = n; i >= 1; i--) {
// factorial *= i;
// }
// System.out.println(factorial);
// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// printFactorial(n);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

/*
 * What is the difference between functions and methods?
 * Functions and methods does the same work but the only difference is that
 * 'functions' are called 'directly' whereas, 'methods' are called 'through
 * class objects'.
 */
/*--------------------------------------------------------*/

// Qs. Make a function to check if a number is prime or not:-

// Solution:
// import java.util.*;

// class IsPrime {
// public static boolean isPrime(int n) {

// boolean flag = false;
// for (int i = 2; i <= n / 2; i++) {
// if (n % i == 0) {
// flag = true;
// break;
// }
// }

// if (!flag) {
// System.out.println(n + " is prime");
// } else {
// System.out.println(n + " is not prime");
// }

// return flag;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// isPrime(n);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// Qs. Make a function to check if a given number is even or not:-

// Solution:
// import java.util.*;

// class EvenOrOdd {
// public static boolean isEven(int n) {
// boolean flag = false;
// if (n % 2 == 0) {
// flag = true;
// }

// if (flag) {
// System.out.println(n + " is even");
// } else {
// System.out.println(n + " is not even");
// }

// return flag;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// isEven(n);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// Qs. Make a function to print the table of a given number n:-

// Solution:
// import java.util.*;

// class PrintTable {
// public static void printTable(int n) {

// for (int i = 1; i <= 10; i++) {
// System.out.println(n * i);
// }

// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// printTable(n);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 1. Enter 3 numbers from the user & make a function to print their average:-

// Solution:
// import java.util.*;

// class Average {
// public static int average(int a, int b, int c) {
// return (a + b + c) / 3;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// System.out.println(average(a, b, c));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 2. Write a function to print the sum of all odd numbers from 1 to n:-

// Solution:
// import java.util.*;

// class SumOfOdds {
// public static int sumOfOdds(int n) {
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// if (i % 2 != 0) {
// sum += i;
// }
// }
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// System.out.println(sumOfOdds(n));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 3. Write a function which takes in 2 numbers and returns the greater of those
// two:-

// Solution:
// import java.util.*;

// class Greater {
// public static int greaterNumber(int a, int b) {
// if (a > b) {
// return a;
// } else {
// return b;
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();

// System.out.println(greaterNumber(a, b));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 4. Write a function that takes in the radius as input and returns the
// circumference of a circle:-

// Solution:
// import java.util.*;

// class Circumference {
// public static double circumference(int r) {
// return (2 * 3.14 * r);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int r = sc.nextInt();

// System.out.println(circumference(r));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 5. Write a function that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 is eligible to vote:-

// Solution:
// import java.util.*;

// class Vote {
// public static void canVote(int age) {
// if (age > 18) {
// System.out.println("Yes, is eligible");
// } else {
// System.out.println("No, is not eligible");
// }

// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int age = sc.nextInt();

// canVote(age);

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 6. Write an infinite loop using do while condition:-

// Solution:
// import java.util.*;

// class DoWhile {
// public static void main(String[] args) {
// int i = 0;
// do {
// System.out.println("Om Prakash Chaurasia");
// i++;
// } while (i > 0);
// }
// }
/*--------------------------------------------------------*/

// 7. Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered:-

// Solution:
// import java.util.*;

// class Counts {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int positive = 0;
// int negative = 0;
// int zeros = 0;

// System.out.println("Press 1 to continue or 0 to stop");

// int input = sc.nextInt();

// while (input == 1) {
// System.out.println("Enter your number: ");
// int number = sc.nextInt();

// if (number > 0) {
// positive++;
// } else if (number < 0) {
// negative++;
// } else {
// zeros++;
// }

// System.out.println("Press 1 to continue or 0 to stop");
// input = sc.nextInt();
// }

// System.out.println("Positives: " + positive);
// System.out.println("Negatives: " + negative);
// System.out.println("Zeros: " + zeros);

// sc.close();
// }
// }

// In this program after every input we are asking user whether he/ she wants to
// continue or not.
/*--------------------------------------------------------*/

// 8. Two numbers are entered by the user, x and n. Write a function to find the
// value of one number raised to the power of another i.e. x^n:-

// Solution:
// import java.util.*;

// class PowerOfX {
// public static double power(int x, int n) {
// double pow = Math.pow(x, n);

// return pow;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int x = sc.nextInt();
// int n = sc.nextInt();

// System.out.println(power(x, n));

// sc.close();
// }
// }
/*--------------------------------------------------------*/

// 9. Write a function that calculates the Greatest Common Divisor of 2 numbers.

// Solution:
// import java.util.*;

// class GCD {
// public static int greatestCommonDivisor(int n1, int n2) {
// int gcd = 0;
// for (int i = 1; i <= n1 && i <= n2; i++) {
// if (n1 % i == 0 && n2 % i == 0) {
// gcd = i;
// }
// }
// return gcd;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n1 = sc.nextInt();
// int n2 = sc.nextInt();

// System.out.println(greatestCommonDivisor(n1, n2));
// sc.close();
// }
// }
/*--------------------------------------------------------*/

/*
 * 10. Write a program to print Fibonacci series of n terms where n is input by
 * user:
 * 0 1 1 2 3 5 8 13 21...
 * In the Fibonacci series, a number is the sum of the previous 2 numbers that
 * came before it.
 */

// Solution:
// import java.util.*;

// class Fibonacci {
// public static int fibonacciNumbers(int n) {
// int sum = 0;
// int a = 0;
// int b = 1;

// System.out.println(a + " ");

// for (int i = 2; i <= n; i++) {
// System.out.println(b + " ");
// sum = a + b;
// a = b;
// b = sum;
// }
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// fibonacciNumbers(n);

// sc.close();
// }
// }

// OR

// import java.util.*;

// class Fibonacci {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int a = 0, b = 1;

// System.out.print(a + " ");

// if (n > 1) {
// // find nth term
// for (int i = 2; i <= n; i++) {
// System.out.print(b + " ");
// // the concept below is called swapping
// int temp = b;
// b = a + b;
// a = temp;
// }

// System.out.println();
// }
// sc.close();
// }
// }
/*--------------------------------------------------------*/
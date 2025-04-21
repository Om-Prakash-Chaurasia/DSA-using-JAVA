// NON-PRIMITIVE DATA-TYPES
/*
 * 1. ARRAYS IN JAVA
 * 
 * 1-D ARRAYS
 * 
 * List of items of the same type in java is called arrays.
 * 
 * Defining an arrays in java:-
 * 
 * syntax:- type arrayName[] = new type[size];
 * 
 * e.g. int marks[] = new int[3];
 * 
 * Now, how to store our marks in this array?
 * For that we use index of the array. Index of any array always starts from
 * zero '0'.
 * e.g.
 * marks[0] = 97;
 * marks[1] = 98;
 * marks[2] = 95;
 * 
 * Now, how to know these marks from the array?
 * For that we simply do,
 * marks[0];
 * marks[1];
 * marks[2];
 * OR, if we want to print these marks then we simply use our print statement.
 * e.g.
 * System.out.println(marks[0]); etc.
 */

// EXAMPLES OF ARRAYS IN JAVA

// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// int marks[] = new int[3];
// marks[0] = 97; // phy
// marks[1] = 98; // chem
// marks[2] = 95; // eng
// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);

// // Instead of printing marks individually, if we want to print all the marks
// // then we can use loops.
// // e.g.
// for (int i = 0; i < 3; i++) {
// System.out.println(marks[i]);
// }
// }
// }
/*---------------------------------------------------------------- */

/*
 * Another way to define the array in java:-
 * 
 * In this way, we already know the that what is the size of this array or what
 * variables/ values we are going to store in this array.
 * 
 * syntax:- type arrayName[] = {values of the array separated by comma ','};
 */
// e.g.
// public class DataTypes {
// public static void main(String[] args) {
// int marks[] = { 97, 98, 95 };

// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);

// for (int i = 0; i < 3; i++) {
// System.out.println(marks[i]);
// }
// }
// }
/*---------------------------------------------------------------- */

// Taking input from the user for an array and performing the operation:-

// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int numbers[] = new int[size];

// // this loop is for input of the array elements
// for (int i = 0; i < size; i++) {
// numbers[i] = sc.nextInt();
// }

// // this loop is for output of array
// for (int i = 0; i < size; i++) {
// System.out.println(numbers[i]);
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Take an array as input from the user. Search for a given number x and
// print the index at which it occurs:-

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int nums[] = new int[n];
// for (int i = 0; i < n; i++) {
// nums[i] = sc.nextInt();
// }

// int x = sc.nextInt();

// for (int i = 0; i < n; i++) {
// if (nums[i] == x) {
// System.out.println("x found at index: " + i);
// }
// }

// sc.close();
// }
// }

// In this question we are searching for an element at every index of the array
// one by one, this searching technique is called 'Linear Search'. In further
// lectures we will learn about or Searching techniques which are more
// optimized than linear search.
// Every array has a property called 'length' and in this the total size of the
// array is stored.
/*---------------------------------------------------------------- */

// Qs. Take an array of names as input from the user and print them on the
// screen.

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// String names[] = new String[n];

// for (int i = 0; i < n; i++) {
// names[i] = sc.next();
// }

// for (int i = 0; i < n; i++) {
// System.out.println("Hello " + names[i]);
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Find the maximum & minimum number in an array of integers:-
// HINT: Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int nums[] = new int[n];
// for (int i = 0; i < n; i++) {
// nums[i] = sc.nextInt();
// }

// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

// for (int i = 0; i < n; i++) {
// if (nums[i] < min) {
// min = nums[i];
// } else if (nums[i] > max) {
// max = nums[i];
// }
// }

// System.out.println("Largest number is: " + max);
// System.out.println("Smallest number is: " + min);

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Take an array of numbers as input and check if it is an array sorted in
// ascending order:-
// e.g. {1, 2, 4, 7} is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int nums[] = new int[n];

// for (int i = 0; i < n; i++) {
// nums[i] = sc.nextInt();
// }

// boolean isAscending = true;
// for (int i = 0; i < n - 1; i++) { // NOTICE n-1 as termination condition.
// Why? Dry run the code you'll get.
// if (nums[i] > nums[i + 1]) { // This is the condition for descending order.
// isAscending = false;
// }
// }

// if (isAscending) {
// System.out.println("The array is sorted in ascending order");
// } else {
// System.out.println("The array is not sorted in ascending order");
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

/*
 * 2D-ARRAYS IN JAVA
 * 
 * Defining 2-D arrays in java
 * 
 * syntax:- type arrayName[][] = new type[rows][columns];
 * 
 * e.g. int numbers[][] = new int[3][5];
 */
// EXAMPLES OF 2-D ARRAYS

// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int rows = sc.nextInt();
// int columns = sc.nextInt();
// int numbers[][] = new int[rows][columns];

// // input
// // rows
// for (int i = 0; i < rows; i++) {
// // columns
// for (int j = 0; j < columns; j++) {
// numbers[i][j] = sc.nextInt();
// }
// }

// // output
// // rows
// for (int i = 0; i < rows; i++) {
// // columns
// for (int j = 0; j < columns; j++) {
// System.out.print(numbers[i][j] + " ");
// }
// System.out.println();
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Take a matrix as input from the user. Search for a given number x and
// print the indices at which it occurs:- (Linear Search)

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int m = sc.nextInt();
// int mat[][] = new int[n][m];

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// mat[i][j] = sc.nextInt();
// }
// }

// int x = sc.nextInt();

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// if (mat[i][j] == x) {
// System.out.println("x found at: " + "(" + i + "," + j + ")");
// }
// }
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. For a given matrix of n*m, print its transpose:-

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int m = sc.nextInt();
// int mat[][] = new int[n][m];

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// mat[i][j] = sc.nextInt();
// }
// }

// // Transpose of matrix means interchanging i,j --> to j,i
// System.out.println("Transpose of the given matrix is: ");
// for (int j = 0; j < m; j++) {
// for (int i = 0; i < n; i++) {
// System.out.print(mat[i][j] + " ");
// }
// System.out.println();
// }
// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print the spiral order matrix as output for a given matrix of numbers:-
// [Difficult for Beginners]

// Solution:
// import java.util.*;

// public class DataTypes {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int m = sc.nextInt();
// int mat[][] = new int[n][m];

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// mat[i][j] = sc.nextInt();
// }
// }

// int rowStart = 0;
// int rowEnd = n - 1;
// int colStart = 0;
// int colEnd = m - 1;

// while (rowStart <= rowEnd && colStart <= colEnd) {

// for (int col = colStart; col <= colEnd; col++) {
// System.out.print(mat[rowStart][col] + " ");
// }
// rowStart++;

// for (int row = rowStart; row <= rowEnd; row++) {
// System.out.print(mat[row][colEnd] + " ");
// }
// colEnd--;

// for (int col = colEnd; col >= colStart; col--) {
// System.out.print(mat[rowEnd][col] + " ");
// }
// rowEnd--;

// for (int row = rowEnd; row >= rowStart; row--) {
// System.out.print(mat[row][colStart] + " ");
// }
// colStart++;
// }

// sc.close();
// }
// }

// Need to dry run this code to understand...
/*---------------------------------------------------------------- */

/*
 * 2. STRINGS IN JAVA
 * 
 * It is a collection of characters or words in java. The String class is by
 * default present in java so we cannot use it as our className.
 * 
 * syntax:- String stringName = "value";
 * 
 * e.g.
 * String name = "Om";
 * String fullName = "Om Prakash Chaurasia";
 * String sentence = "My name is Om Prakash Chaurasia";
 */
// EXAMPLES OF STRINGS

// Taking the userName as input from user and printing it as output:-

// Solution:
import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println("Your name is " + name + ".");

        // Functions performed on Strings
        // 1. concatenation:- Means add two or more strings together. e.g. is shown
        // below

        // String firstName = "Om";
        // String lastName = "Chaurasia";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        /*---------------------------------------------------------------- */

        // 2. length():- It gives the total length of the String. e.g. is shown
        // below

        // String firstName = "Om";
        // String lastName = "Chaurasia";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());
        /*---------------------------------------------------------------- */

        // 3. charAt():- This method helps us to print the individual characters in a
        // String. e.g. is shown below

        // String firstName = "Om";
        // String lastName = "Chaurasia";
        // String fullName = firstName + " " + lastName;

        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }
        /*---------------------------------------------------------------- */

        // 4. .compareTo():- This method is used to comparing two Strings, whether two
        // Strings are same or not. This method compares three parameters of these
        // Strings i.e i. s1 > s2 then it returns a +ve value, ii. s1 == s2 then it
        // returns 0, iii. s1 < s2 then it returns -ve value. e.g. is shown below

        // String name1 = "Om Prakash Chaurasia";
        // String name2 = "Om Prakash Chaurasia";

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        /*---------------------------------------------------------------- */

        // What if we use '==' to compare instead of .compareTo()? The output in our
        // case will remain same but this may fail with other Strings i.e test cases may
        // fail. So, we should always use .compareTo() for String comparison.
        // if (name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        /*---------------------------------------------------------------- */

        // 5. .substring():- This method gives a part of String, for this we should use
        // the method as: substring(startingIndex, endingIndex);. Here, endingIndex is
        // exclusive i.e it is not included in our String. i.e it is up to length()-1.
        // In case, if we don't provide ending index then the String will by default go
        // till the end but we must provide 'startingIndex' and then we should store
        // this new String in a variable. e.g. is shown below

        // String sentence = "My name is Om Prakash";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);
        /*---------------------------------------------------------------- */

        // String sentence = "OmPrakash";
        // String name = sentence.substring(0, 2);
        // System.out.println(name);
        /*---------------------------------------------------------------- */

        // String sentence = "OmPrakash";
        // String name = sentence.substring(2);
        // System.out.println(name);
        /*---------------------------------------------------------------- */

        // 6. parseInt() of Integer class:- This method converts String to Integer. e.g.

        // String str = "123";
        // System.out.println(str);
        // System.out.println(str.length());
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        // By seeing, both the output is looking same but inside the java engine the 1st
        // output is a String whereas, 2nd output is an Integer, this can be confirmed
        // by the length() applied on the String here.
        /*---------------------------------------------------------------- */

        // 7. toString() of String class:- This method converts Integer to String. e.g.

        // int number = 123;
        // System.out.println(number);
        // String str = Integer.toString(number);
        // System.out.println(str);
        // System.out.println(str.length());

        // Here, str.length() confirms that this number has been converted to String as
        // length() can only be applied to Non-primitive types i.e Strings and Arrays.
        /*---------------------------------------------------------------- */

        // Qs. Take an array of Strings input from the user & find the cumulative
        // (combined) length of all those strings:-

        // Solution:
        // int n = sc.nextInt();
        // String array[] = new String[n];
        // int toLength = 0;
        // for (int i = 0; i < n; i++) {
        // array[i] = sc.next();
        // toLength += array[i].length();
        // }

        // System.out.println(toLength);
        /*---------------------------------------------------------------- */

        // Qs. Input a String from the user. Create a new String called 'result' in
        // which you will replace the letter 'e' in the original string with letter
        // 'i':-

        // Solution:
        // String s = sc.nextLine();
        // String result = "";

        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == 'e') {
        // result += 'i';
        // } else {
        // result += s.charAt(i);
        // }
        // }

        // System.out.println(result);
        /*---------------------------------------------------------------- */

        // Qs. Input an email from the user. You have to create a username from the
        // email by deleting the part that comes after '@'. Display that username to the
        // user.
        // e.g. email = "apnaCollegeJava@gmail.com"; username = "apnaCollegeJava"
        // e.g. email = "helloWorld123@gmail.com"; username = "helloWorld123"

        // Solution:
        // String email = sc.nextLine();
        // String userName = "";

        // for (int i = 0; i < email.length(); i++) {
        // if (email.charAt(i) == '@') {
        // break;
        // } else {
        // userName += email.charAt(i);
        // }
        // }

        // System.out.println(userName);
        /*---------------------------------------------------------------- */

        /*
         * 8. Strings are Immutable:- That means once String is stored in the memory
         * then it cannot be changed/ modified or a part of it cannot be deleted. If we
         * want to do these things then we need to create a new String and then perform
         * these operations. But creating a new String and performing these operations
         * are time taking so, to optimize this there is a new class in java called
         * StringBuilder.
         * 
         * How to declare StringBuilder?
         * 
         * syntax:- StringBuilder sb = new StringBuilder("value");
         */
        // e.g.

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // StringBuilder also has all the same methods as of String along with some
        // additional methods like now we can replace or delete the String or characters
        // of a String.
        // e.g. char at index 0; (getting the character)
        // System.out.println(sb.charAt(0));
        /*---------------------------------------------------------------- */

        // i.e set char at index; (setting the character)
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);
        /*---------------------------------------------------------------- */

        // Insert a Character using StringBuilder. i.e (inserting the character)
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);
        /*---------------------------------------------------------------- */

        // Deleting the character
        // sb.delete(2, 3);
        // System.out.println(sb);

        // sb.delete(2, 4);
        // System.out.println(sb);
        /*---------------------------------------------------------------- */

        // We can also append characters i.e we can add characters at the end of the
        // String with the help of StringBuilder. e.g.

        // StringBuilder sb = new StringBuilder("h");
        // System.out.println(sb);
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());
        /*---------------------------------------------------------------- */

        // Qs. Reverse a String:-

        // Solution: TC = O(n);
        // StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb);

        // for (int i = 0; i < sb.length() / 2; i++) {
        // int front = i;
        // int back = sb.length() - 1 - i; // 5-1-0 = > 4

        // char frontChar = sb.charAt(front);
        // char backChar = sb.charAt(back);

        // sb.setCharAt(front, backChar);
        // sb.setCharAt(back, frontChar);
        // }

        // System.out.println(sb);
        /*---------------------------------------------------------------- */

        sc.close();
    }
}
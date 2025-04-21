/*
 * Operators :- Operators are symbols that has specific meaning and perform
 * certain operations. This operations are performed on the operands. The
 * operators in Maths are called binary operators because it performs operations
 * in between two numbers.
 * 
 * Operators in Java :-
 * 
 * 1. Arithmetic Operators :-
 * 
 * a. Binary :- +, -, *, /, %
 * 
 * b. Unary :- Works with one operand only. e.g. ++ is increment operator, -- is
 * decrement operator. In this also we have two types as i.e. pre-increment or
 * pre-decrement operator as ++a or --a and post-increment or post-decrement
 * i.e. a++ or a--.
 * These operators are generally used in loops to update the state.
 * Pre-increment or pre-decrement means 1st we change value and then use value.
 * Whereas, post-increment or post-decrement means 1st we use value and then we
 * change value.
 * 
 * 2. Relational Operators :- Give the relation between two operands. e.g. ==,
 * !=, >, <, >=, <=. It returns boolean output.
 * 
 * 3. Logical Operators :- Combines two or more statements and returns a boolean
 * output. e.g. &&, ||, !
 * a. && :- If both or all the statements are true then output is true or else
 * false.
 * b. || :- If either of the statement is true then output is true or else
 * false.
 * c. ! :- This operator inverse the value of the output.
 * 
 * 4. Bitwise Operators :- These are Binary Operators. e.g. & (Binary AND), |
 * (Binary OR), ^ (Binary XOR), ~ (Binary One's Complement), << (Binary Left
 * Shift), >> (Binary Right Shift).
 * 
 * 5. Assignment Operators :- =, +=, -=, *=, /=.
 * a. a = b means that the value of a is now same as b.
 * b. a = a+b can also be written as a += b
 * c. a = a-b can also be written as a -= b
 * d. a = a*b can also be written as a *= b
 * e. a = a/b can also be written as a /= b
 * 
 * 
 */

// public class Operators {
// public static void main(String[] args) {

// // // e.g. of post-increment

// // int a = 10;
// // int b = 0;

// // b = a++;

// // System.out.println(a); // here is the updated value of a.
// // System.out.println(b); // we have use the value 1st and then updating the
// // value of a.
/*---------------------------------------------------------------- */

// // // e.g. of pre-increment

// // int a = 10;
// // int b = 0;

// // b = ++a;

// // System.out.println(a); // here is the updated value of a.
// // System.out.println(b); // here we update the value of a 1st and then we
// are
// // using.
/*---------------------------------------------------------------- */

// // // e.g. of pre-decrement

// // int a = 10;
// // int b = 0;

// // b = --a;

// // System.out.println(a);
// // System.out.println(b);
/*---------------------------------------------------------------- */

// // // e.g. of post-decrement

// // int a = 10;
// // int b = 0;

// // b = a--;

// // System.out.println(a);
// // System.out.println(b);
// }
// }
/*---------------------------------------------------------------- */

/*
 * BIT Manipulation :-
 * 
 * a. Left shift:- Pushes the bits from right to left and adds zero to the right
 * and is written as N << i. e.g. 2 << 1 i.e 010 << 1 = 100.
 * b. Right shift :- Pushes the bits from lefty to right and adds zero to the
 * left and is written as N >> i. i.e. 2 >> 1 i.e 010 >> 1 = 001.
 * 
 * Here in these operations N is the number and i is the number of bits to be
 * shifted.
 * 
 * We will discuss 4 major operations in Bit manipulation.
 * 1. Get Bit
 * 2. Set Bit
 * 3. Clear Bit
 * 4. Update Bit
 * 
 * All these operations in Bit manipulation is called Bit Masking and these
 * processes we use additional number called Bit Mask.
 */

/*
 * 1. Get Bit :- AND operation is performed.
 * Get the 3rd bit (position = 2) of a number n. (n = 0101)
 * To solve this problem we have a process in which we 1st Mit Mask: 1 << i and
 * then perform AND operation.
 * 
 * Here, Bit Mask is 1 << i so we 1st create a number 0001 << 2 where i is the
 * position given.
 * Then number turns out to be 0100.
 * Operation: AND :- Now performing AND operation between 0100 AND 0101 = 0100.
 * Now if the result is a non-zero number then our bit which we want to find is
 * 1. And if the result is zero then the bit which we want to find is 0.
 * 
 * Another e.g. Lets take the same number and take position = 3. (n = 0101)
 * Bit Mask: 1 << i = 1 << 3 = 0001 << 3 = 1000
 * Operation: AND :- Now performing AND operation between 1000 AND 0101 = 0000.
 * Here the result is a zero number therefore, the position 3 bit is a 0 bit.
 * 
 * Performing these examples in code.
 */

// public class Operators {
// public static void main(String args[]) {
// int n = 5;
// int position = 0;
// int bitMask = 1 << position;

// if ((bitMask & n) == 0) {
// System.out.println("Bit was zero");
// } else {
// System.out.println("Bit was one");
// }
// }
// }
/*---------------------------------------------------------------- */

/*
 * 2. Set Bit :- OR operation is performed.
 * Set bit 2nd bit (position = 1) of a number n. (n = 0101)
 * Bit Mask: 1 << i
 * Operation: OR
 * Solution :-
 * 1 << 1 = 0001 << 1 = 0010.
 * Now, performing Operation OR :- 0010 OR 0101 = 0111.
 * 
 * Performing this e.g. in code.
 */

// public class Operators {
// public static void main(String[] args) {
// int n = 5;
// int position = 1;
// int bitMask = 1 << position;

// int newNumber = bitMask | n;

// System.out.println(newNumber);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 3. Clear Bit :- AND with NOT operation is performed. This means making the
 * positioned bit zero.
 * Clear the 3rd bit (position = 2) of a number n. (n = 0101)
 * Bit Mask: 1 << i
 * Operation: AND with NOT
 * Solution :-
 * 1 << i = 1 << 2 = 0001 << 2 = 0100.
 * Now, performing AND with NOT :- ~(0100) = 1011. Now, performing AND with 1011
 * AND 0101 = 0001.
 * 
 * Performing this e.g. in code.
 */

// public class Operators {
// public static void main(String[] args) {
// int n = 5;
// int position = 2;
// int bitMask = 1 << position;
// int notBitMask = ~(bitMask);

// int newNumber = notBitMask & n;
// System.out.println(newNumber);
// }
// }
/*---------------------------------------------------------------- */

/*
 * Update Bit :- It's either Clear operation or Set operation.
 * Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
 * i.e. if 0 then make it 1 and if 1 then make it 0.
 * Solution :-
 * Bit Mask: 1 << i = 1 << 1 = 0001 << 1 = 0010.
 * Now, 0010 | 0101 = 0111.
 * or, ~(0010) = 1101 then, 1101 & 0101 = 0101.
 * 
 * Performing this e.g. in code.
 */

// import java.util.*;

// public class Operators {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int operation = sc.nextInt();
// int n = 5;
// int position = 1;

// int bitMask = 1 << position;

// if (operation == 1) {
// int newNumber = bitMask | n;
// System.out.println(newNumber);
// } else {
// int newBitMask = ~(bitMask);
// int newNumber = newBitMask & n;
// System.out.println(newNumber);
// }

// sc.close();
// }
// }
/*---------------------------------------------------------------- */
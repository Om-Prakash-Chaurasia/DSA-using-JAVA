public class TimeAndSpace {
    // TIME AND SPACE COMPLEXITY

    /*
     * Relation between Input Size & Running Time (Operations)
     * 
     * TIME COMPLEXITY:- It's the no. of operation we are doing/ its running time.
     * Time complexity is calculated in 3 cases:-
     * Best Case:- It is the minimum time required to execute the code, it is
     * represented by omega(1).
     * Average Case:- It is the average time required to execute the code, it is
     * represented by theta((n+1)/2).
     * Worst Case:- It is the maximum time require to execute the code, no matter
     * what the time won't exceed this time limit, it is represented by O(n).
     * It depends upon the size of the input, as input size increases the running
     * time also increases.
     * e.g. for 1 input and 1 output the time taken is O(1), similarly for n no. of
     * inputs and n no. of outputs the time taken is O(n).
     * 
     * The running time may vary 'linearly' i.e. if we increase input by 10, then
     * output time will also increase by 10. It can also vary 'quadratically' i.e.
     * if input increase by 2 times, then output time will increase by 4 times. It
     * can also be 'cubic' i.e. if input increases by 2 times, then output time will
     * increase by 8 times. Similarly, it can be in 'log' or 'square' and many more.
     * 
     * EXAMPLES OF TIME COMPLEXITY
     * 
     * 1.
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * for(int i = 0; i < n; i++) {
     * System.out.println("hello");
     * }
     * }
     * 
     * Here, input is n is the no. of inputs. Therefore, the time complexity for
     * this code is O(n).
     * /*--------------------------------------------------------
     */
    /*
     * 2.
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * for(int i = 0; i < n; i++) {
     * for(int j = 0; j < n; j++) {
     * System.out.println("hello");
     * }
     * }
     * }
     * 
     * Here, input is n but nested for loops are running where the outer for loop
     * takes O(n) and then for every one operation of outer for loop the inner for
     * loop is also running O(n) times i.e. the total time complexity becomes n*n =
     * O(n^2).
     */
    /*--------------------------------------------------------*/

    /*
     * 3.
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int m = sc.nextInt();
     * 
     * for(int i = 0; i < n; i++) {
     * for(int j = 0; j < m; j++) {
     * System.out.println("hello");
     * }
     * }
     * }
     * Here, input is n and m but in nested for loops are running where the outer
     * for loop
     * takes O(n) and then for every one operation of outer for loop the inner for
     * loop is running O(m) times i.e. the total time complexity becomes O(n*m).
     * /*--------------------------------------------------------
     */
    /*
     * 4.
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int m = sc.nextInt();
     * 
     * for(int i = 0; i < n; i++) {
     * System.out.println("hello");
     * }
     * for(int j = 0; j < m; j++) {
     * System.out.println("hello");
     * }
     * }
     * 
     * Here, input is n and m and are running in two separate for loops so, the
     * overall time complexity becomes O(n+m). And say, if we take n = 2 and m = 3
     * then the time complexity remains the same but when input varies largely e.g.
     * if n = 10^6 and m = 3, in this case the final time complexity becomes O(n),
     * as in comparison to n, m is not taking any time that's why.
     * 
     * This shows that in small code the time complexity doesn't matter much but it
     * affects greatly on large codes.
     */
    /*--------------------------------------------------------
     */

    /*
     * In general, whenever we talk about Time Complexity, we talk in Worst Case
     * scenario i.e. in O(n) and above.
     * To calculate the time complexity we have Master's Theorem which we will study
     * later classes.
     */
    /*--------------------------------------------------------*/

    /*
     * SPACE COMPLEXITY
     * 
     * It is defined as the amount of space taken by the code in the memory. It
     * depends up to the number of variables store in the memory due to this code.
     * Here, the size of the input does not impact the memory as it is store in only
     * one variable in the memory but the number of inputs does impact... e.g.
     * 1.
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * for(int i = 0; i < n; i++) {
     * System.out.println("hello");
     * }
     * }
     * /*--------------------------------------------------------
     */
    /*
     * But again, there are some input types which heavily impacts the memory size.
     * e.g. Arrays, Object and Functions.
     */
    /*--------------------------------------------------------*/
}

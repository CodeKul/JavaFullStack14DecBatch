/**
 * Types of Variables
 *  1. local variable --> variables declared inside method body
 *  2. instance variable --> variables declared inside class but outside the method body
 *  3. static variable --> cannot be local,share among all the instance of class, memory allocation
 *                          happens only once when the class loaded in memory
 *
 */

public class Variables {
    int a = 15; //instance variables
    static int b = 20;
    public static void main(String[] args){
        int m = 10; //local variables
    }
}

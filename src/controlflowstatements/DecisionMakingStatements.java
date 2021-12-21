package controlflowstatements;

import java.util.Scanner;

/**
 * 1. if Statements
 *    a) Simple if
 *    b) if else
 *    c) if-else-if ladder
 *    d) Nested if
 *
 * 2. Switch Statements
 *    switch(expr){//int,short,byte,char or String
 *    case 1: // cases cannot be repeated
 *     statements;
 *     break; // optional
 *     case 2:
 *     statements;
 *     break;
 *     .
 *     .
 *     .
 *     .
 *     default: //optional
 *
 *    }
 */
public class DecisionMakingStatements {

    public static void main(String[] args) {
        int x = 15;
        int y = 20;
        int z = 35;
        //Simple if
        if(y>x)
            System.out.println("y is greater");

        //if else
        if (x>y)
            System.out.println("x is greater");
        else
            System.out.println("y is greater");

        //if-else-if ladder
        if (x>y){
            System.out.println("x is greater");
        }else {
            if (y > z) {
                System.out.println("y is greater");
            } else {
                if (z > y) {
                    System.out.println("z is greater");
                } else {
                    System.out.println("y is greater");
                }
            }
        }
        //Nested if
       String city = "Pune";
       String name = "abc";
        if (city == "Pune1"){
            if (name == "xyz"){
                System.out.println("city is Pune and name is xyz");
            }
            else {
                if (name == "abc"){
                    System.out.println("city is Pune and name is abc");
                }
            }
        }else {
            System.out.println("You are living in Mumbai");
        }


        //Switch statements
        int a = Integer.parseInt(args[0]);
        System.out.println("From cmd a : "+a);
        String type = args[1];
        System.out.println("From cmd type is "+type);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int cnt = scanner.nextInt();
        switch (cnt){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Default "+cnt);
        }

    }
}

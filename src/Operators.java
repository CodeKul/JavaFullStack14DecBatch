/**
 * 1. Unary Operator -> expr++,expr--,--expr,++expr,!,~
 * 2. Arithmetic Operators -> +,-,*,/,%
 * 3. Logical Operators -> Logical AND (&&) ,Logical OR (||)
 * 4. Bitwise Operators -> Bitwise AND (&),Bitwise OR (|)
 * 5. Shift Operators -> <<, >>
 * 6. Ternary Operators -> ? :
 * 7. Assignment Operators -> =,+=,-=,*=,/=,%=,!=
 * 8. Relational Operators -> <,>,<=,>=
 */

public class Operators {
    public static void main(String[] args) {
        //Unary Operator
        int a=10;
        System.out.println(a);//10
        System.out.println(a++);// 10
        System.out.println(++a);//12
        System.out.println(a--);//12
        System.out.println(--a);//10
        System.out.println(~a);// (-a)-1=-10-1 = -11

        int b = 25;
        System.out.println(b);//25
        System.out.println(b++);//25
        System.out.println(++b);//27
        System.out.println(b--);//27
        System.out.println(--b);//25
        boolean f = true;
        System.out.println(!f);//false

        //Arithmetic
        a=10;
        b=5;
        System.out.println(10%5);//0
        a=10;
        b=5;
        int c=20;
        //Logical AND
        System.out.println(a<b && b<c); // false
        //Bitwise AND
        System.out.println(a<b & b<c);

        //Logical OR
        System.out.println(a>b || b>c); //true
        //Bitwise Or
        System.out.println(a<b | b>c); //true

        //Shift Operators
        System.out.println(a<<2);// 10<<2 = 10*2^2 = 10*4=40
        System.out.println(a<<3);//10<<3 = 10*2^3 = 10*8=80
        System.out.println(20<<4);//20*2^4 = 20*16=320

        System.out.println(10>>2);//10/2^2 = 10/4 = 2
        System.out.println(20>>3);//20/2^3 = 20/8 = 2
        a=10;
        b=5;
        int min = a<b?a:b;
        System.out.println(min);
        if (a<b)
            min = a;
        else
            min = b;

        //Assigment Operators
        a=10;
        b=5;
        a = a+ 10;
        a+=10;
        a-=10;
        a*=10;
        a/=10;
        System.out.println(a!=b);
        //Relational Operators
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        a = 10;
        b = 15;
        c = 20;
        int d = 5;
        System.out.println(a++ + ++b + --a + --b + c++ + --a);
        //10 + 16 + 10 + 15 + 20 + 9
    }
}

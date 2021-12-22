package controlflowstatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int cnt = 1;
        do {
            System.out.println("cnt :"+cnt);
            cnt++;
        }while (cnt>=3);

        //infinite do-while

        do {
            System.out.println("infinite ");

        }while (true);
    }
}

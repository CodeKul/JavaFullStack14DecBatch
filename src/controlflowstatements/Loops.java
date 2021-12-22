package controlflowstatements;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        //Nested for loop
        for (int i=1;i<=3;i++){  //i=1,2
            for (int j=1;j<=3;j++){ //j=1,2,3 ||1
                System.out.println(i+" "+j);
            }
        }
        //infinite for loop
//        for (;;){
//            System.out.println("infinite");
//        }
        //for-each loop (Enhanced for loop)
        int array[] = {2,8,9,6,8,5};
        for (int a:array){
            System.out.print(" "+a);
        }
        System.out.println();

        ///while loop
        int i = 1;
        while (i<=5){
            System.out.println("in while loop "+i);
            i++;
        }
        //infinite while
//        while (true){
//            System.out.println("infinite");
//        }
    }
}

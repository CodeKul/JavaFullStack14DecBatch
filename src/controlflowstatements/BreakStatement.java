package controlflowstatements;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i =1;i<=5;i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }

        for (int i=1;i<=3;i++){ // i=1||2||3
            for (int j=1;j<=3;j++){ //j=1,2,3,4||1,2||1,2,3
                if (i==2 && j==2){
                    break;
                }
                System.out.println(i +" "+j);
            }
        }
    }
}

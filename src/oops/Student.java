package oops;

public class Student {
    int rollNo = 1;
    String name = "abc";
    int age = 25;
    void show(){
        System.out.println("Show Method");
    }
    public static void main(String[] args){
        //heap area
        Student s1 = new Student();
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.show();
    }
}

import java.util.Scanner;

public class methods {
    public int grades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark: ");
        int marks = sc.nextInt();
        if(marks>=0 && marks<=49){
            System.out.println("C-");
        }else if(marks>=50 && marks<=59){
            System.out.println("C");
        }else if(marks>=60 && marks<=69){
            System.out.println("B-");
        }else if(marks>=70 && marks<=85){
            System.out.println("B+");
        }else if(marks>=86 && marks<=100){
            System.out.println("A");
        }else{
            System.out.println("Enter Correct Marks");
        }
        return marks;

    }
    public static void main(String[] args){
     methods d = new methods();
     d.grades();


    }
}

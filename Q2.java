import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your mark1:");
        double mark1 =sc.nextDouble();
        System.out.print("enter your mark2:");
        double mark2 =sc.nextDouble();
        System.out.print("enter your mark3:");
        double mark3 =sc.nextDouble();
        System.out.print("enter your mark4:");
        double mark4 =sc.nextDouble();
        double avg=(mark1+mark2+mark3+mark4)/4;
        char grade='v';
        if (avg<0) {
            System.out.println("invalid.");
        }
        else if(avg>=90){
            grade='O';
        }
        else if(avg>=80 && avg<90){
          grade='E';
        }
        else if(avg>=70 && avg<80){
            grade='A';
        }
        else if(avg>=60 && avg<70){
             grade='B';
        }
        else if(avg>=50 && avg<60){
            grade='C';
        }
        else{
            grade='F';
        }
System.out.printf("YOUR GRADE:%s",grade);
sc.close();
    }
}
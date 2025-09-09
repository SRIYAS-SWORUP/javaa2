import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary:");
        double salary =sc.nextDouble();
        double tax=0;
        if(salary<0){
            System.out.println("enter a valid salary.");
        }
        else if(salary<=150000){
            tax=0;
        }
        else if(salary>=150001 && salary<300000){
            tax=salary*0.1;
        }
        else if(salary>=300000 && salary<500000){
            tax=salary*0.2;
        }
        else{
            tax=salary*0.3;
        }
System.out.println("TAX IS:"+tax);
sc.close();
    }
}
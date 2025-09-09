import java.util.Scanner;
public class RECURSIVE {
    public static int summ(int num, int sum1) {
        if (num <= 0) {
            return sum1; 
        } else {
            return summ(num - 1, sum1 + num); 
        }
    }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("enter a number to find sum till number:");
            int num= sc.nextInt();
            System.out.println(RECURSIVE.summ(num,0));
            sc.close();
}
}

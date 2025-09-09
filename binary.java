import java.util.Scanner;
public class binary{
public static int reverse(int num){
    int pal=num;
    int sum1=0;
    int place = 1;

        while (pal != 0) {
            int rev = pal % 2;       
            sum1 = rev * place + sum1; 
            pal = pal / 2;           
            place *= 10;             
            }

        return sum1;
    }
 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer:");
        int num=sc.nextInt();
        System.out.println(binary.reverse(num));
        sc.close();
}
}

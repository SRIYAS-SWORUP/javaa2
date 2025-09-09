import java.util.Scanner;

public class pallindrome {
public static int reverse(int num){
    int pal=num;
    int sum1=0;
    while(pal!=0){
        int rev=pal%10;
        sum1 = (sum1)*10+rev;
        pal=pal/10;
    }
    return sum1;
}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer:");
        int num=sc.nextInt();
        System.out.println();
       if (pallindrome.reverse(num)==num) {
        System.out.println("pallindrome");
       }
       else{
        System.out.println("not pallindrome");
       }

        sc.close();
}
}

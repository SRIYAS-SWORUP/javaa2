import java.util.Scanner;

public class prime {
    public static void p(int num){
        int cnt=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                cnt=1;
            }
        }
        if (num==1) {

            System.err.println("NOT PRIME.");
        }
        else if(cnt==1){
            System.err.println("NOT PRIME.");
        }
        else{
            System.out.println("PRIME");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer:");
        int num=sc.nextInt();
        System.out.println();
       prime.p(num);

        sc.close();
}
}

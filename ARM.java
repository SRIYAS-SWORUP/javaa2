
public class ARM {
    public static int count(int num){
        int cnt=0;
        int p=num;
        while(p!=0){
            p/=10;
            cnt++;
        }
        return cnt;
    }
    public static int strong(int num){
    int pal=num;
    int sum1=0;
    int counter=count(num);
        while (pal != 0) {
            int rev = pal % 10;       
            sum1 =sum1+(int)(Math.pow(rev,counter)); 
            pal = pal / 10;                   
            }
        return sum1;
    }
    public static void main(String[] args) {
        for(int i=1;i<=10000;i++){
            if(ARM.strong(i)==i){
                System.out.println(i);
            }
        }
}
}

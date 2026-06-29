import java.util.Scanner;
public class Prime2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            System.out.println("not prime");
            return;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
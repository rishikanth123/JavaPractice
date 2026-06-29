import java.util.Scanner;
public class Prime1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean isprime=true;
         if(n<=1){
            System.out.println("not a prime number");
            return;
        } 
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
       
        if(isprime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
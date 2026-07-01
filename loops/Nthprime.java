import java.util.Scanner;
public class Nthprime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int n=sc.nextInt();
        int count=0;
        int num=2;
        while(count<n){
            boolean isprime=true;
            for(int i =2;i*i<=num;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                count++;
            }
            if(count==n){
                System.out.println("The nth prime for the number is: "+num);
                break;
            }
            num++;
        }
    }
}
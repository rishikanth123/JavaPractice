import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position to find fibonacci: ");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next=0;
        if(n==0){
            System.out.println(n);
            return;
        }
        if(n==1){
            System.out.println(n);
            return;
        }
        for(int i=2;i<=n;i++){
            next=first+second;
            first=second;
            second=next;
        }
        System.out.println(second);
        
    }
}
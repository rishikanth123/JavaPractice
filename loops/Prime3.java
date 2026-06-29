import java.util.Scanner;
public class Prime3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        if(n<=1){
            System.out.println("not prime");
            return;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}


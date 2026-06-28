import java.util.Scanner;
public class secondlast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int a=n%100;
        int b=a/10;
        System.out.println(b);

    }
}
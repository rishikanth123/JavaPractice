import java.util.Scanner;
public class lasttwosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        int a=n1%10;
        int b=n2%10;
        System.out.println(a+b+"is the sum of last digit of two numbers");

    }
}
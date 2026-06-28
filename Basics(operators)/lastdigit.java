import java.util.Scanner;
public class lastdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(n%10+""+"is the last digit of the number");

    }
}
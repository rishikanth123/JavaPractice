import java.util.Scanner;
public class multiple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        int res=dividend%divisor;
        System.out.println("The result is: "+res);
        if(res==0){
            System.out.println("It is an exact multiplier");
        }
        else{
            System.out.println("It is not an exact multiplier.because the remainder we got is "+res);
        }
    }
}
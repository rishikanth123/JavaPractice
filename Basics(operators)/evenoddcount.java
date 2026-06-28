import java.util.Scanner;
public class evenoddcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the number at index position ["+i+"] is : ");
            a[i]=sc.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
        }
        System.out.println("The number of even numbers in the array is: "+evencount);
        System.out.println("The number of odd numbers in the array is: "+oddcount);
    }
}
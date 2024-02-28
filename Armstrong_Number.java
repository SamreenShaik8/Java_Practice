// Armstrong number is a number that is equal to the sum of cubes of its digits.
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while (num>0) {
            int a=num%10;
            sum=sum+a*a*a;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("The given number is armstrong");
        }
        else{
            System.out.println("The given number is not armstrong");
        }

    }
}

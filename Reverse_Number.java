import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        // initially reverse value will be zero
        int rev=0;

        // condition
        while(num!=0){
            // modulus is always gives the remainder
            rev=rev*10+num%10;
            // div is always give quotient
            num=num/10;

        }
        System.out.println("Reversed number is: "+rev);
    }
}
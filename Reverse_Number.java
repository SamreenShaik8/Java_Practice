import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

        int number=sc.nextInt();
        int rem,rev=0;

        // condition for reverse anumber
        while(number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("Reversed number:"+rev);

    }
}

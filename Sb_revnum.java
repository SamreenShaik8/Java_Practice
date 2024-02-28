// reverse a number using string buffer class
import java.util.*;
public class Sb_revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        // String buffer is an inbuilt class
        StringBuffer s=new StringBuffer(String.valueOf(num));
        System.out.println("Reversed number is:"+s.reverse());
    }
}

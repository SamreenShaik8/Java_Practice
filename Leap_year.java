// a year, occurring once every four years, which has 366 days 
import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        // Condition for leap year

        if(year % 400==0){
            System.out.println(year + "is a leap year");
        }
        else if(year % 4==0 && year%100!=0){
            System.out.println(year + "is a leap year");
        }
        // Not a leap year
        else{
            System.out.println(year + "is not a leap year");
        }
    }
}

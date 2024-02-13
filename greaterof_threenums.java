import java.util.*;
public class greaterof_threenums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        // Checking condition for num1
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+ "is greater");
        }
        // checking condition for num2
        else if (num2>=num1 && num2>=num3) {
            System.out.println(num2+ "is greater");
        }
        // checking condition for num3
        else{
            System.out.println(num3+"is greater");
        }
    }
}

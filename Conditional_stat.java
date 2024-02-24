/*Conditional Statements ‘if-else’
The if block is used to specify the code to be executed if the condition specified
in if is true, the else block is executed otherwise.*/
import java.util.*;
public class Conditional_stat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        // if condition checks weather condition is true or not if it is true then the  if condition will be printed
        if(age>=18){
            System.out.println("The person is adult");
        }
        // if codition is not true the else statement will be printed
        else{
            System.out.println("The pearson is not adult");
        }
    }
}

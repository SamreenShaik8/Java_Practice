import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // we will take take any variable lets take temp variable
        int temp=0;

        // for loop to check the condition if the number is 
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(n+" is prime number");

        }
        else{
            System.out.println(n+" is not a prime number");
        }
        
    }
}
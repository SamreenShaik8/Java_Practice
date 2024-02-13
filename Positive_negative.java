import java.util.*;
class Positive_negative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("The number is   Negative");
        }
        else if (num>0) {
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The number is zero");
        }
        
    }

}

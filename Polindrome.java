public class Polindrome {
    public static void main(String[] args) {
        String s1="malayalam";
        String rev="";

        int len=s1.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println("reversed string:"+rev);

        // s1.equals is inbuilt method to check the string is equal or not
        if(s1.equals(rev)==true){
            System.out.println("The string is polidrome");
        }
        else{
            System.out.println("The string is not a polindrome");
        }
    }
}

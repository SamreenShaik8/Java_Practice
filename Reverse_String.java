// reverse a string 
public class Reverse_String {
    public static void main(String[] args) {
        String s1="WELCOME";
        String rev="";
        // len is a inbuilt method that will check the length of a string.
        int len=s1.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+s1.charAt(i);

        }
        System.out.println("reversed string:"+rev);
    }
}

import java.util.*;
public class rvrstring {

    public static void main(String[] args) {
        System.out.println("Enter a string to reverse");
        Scanner ra = new Scanner(System.in);
        String str= ra.nextLine();
        char fs;
        String rev="";
        method(str);
        if(str.matches("[a-z A-Z]+"))
        {
            for(int i=0;i<str.length();i++)
            {
                fs=str.charAt(i);
                rev=fs+rev;
            }
            System.out.println("Reverse of entered string is: "+rev);
        }
        else
        {
            System.out.println("Error!! The input is not a string");
        }
    }
    public static String method(String str){
        return str;
    }
}
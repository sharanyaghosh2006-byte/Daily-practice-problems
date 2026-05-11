import java.util.Scanner;
import java.lang.*;

public class strings3 {
    public static void palindrome(String str){
        int c=0;
    for(int i=0;i<str.length()/2;i++)
    {
       int n=str.length();
        if(str.charAt(i)==str.charAt(n-i-1))
        {
            c=1;
            continue;
        }
        c=0;
        break;
    }
    if(c==1){
        System.out.println(" palindrome string");
    }
    else{
        System.out.println(" non palindrome");
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=sc.nextLine();
        int s=str.length();
        System.out.println(s);
        palindrome(str);
    }
    
    
}

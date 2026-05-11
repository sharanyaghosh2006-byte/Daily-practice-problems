import java.util.Scanner;
import java.lang.*;

public class string2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=sc.nextLine();
        int s=str.length();
        System.out.println(" length"+s);
        System.out.println("enter another string");
        String str1=sc.nextLine();
        int s1=str1.length();
        System.out.println(" length"+s1);
      String str2= str.concat(str1);
        System.out.println(str2);
        boolean f=str.equals(str1);
        System.out.println(f);
        int t=str.compareTo(str1);
        System.out.println("lexicographic comparison"+t);
        for(int i=0;i<str2.length();i++)
        {
            char c=str2.charAt(i);
            System.out.println(c);
        }
    }
    
}

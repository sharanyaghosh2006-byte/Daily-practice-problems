import java.util.*;
import java.lang.*;
public class strings5{
    public static void up(String str){
        int i;
        String str1="";
        str1+=Character.toUpperCase(str.charAt(0));
        for(i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str.charAt(i-1)==' ')
            {
              str1+=Character.toUpperCase(str.charAt(i));
            
            }
            else{
            str1+=ch;
            }
        }
        System.out.println(str1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=sc.nextLine();
        up(str);
}
}
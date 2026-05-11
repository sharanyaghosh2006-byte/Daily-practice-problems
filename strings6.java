import java.util.*;
import java.lang.*;
public class strings6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int i,c=0;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                c++;
            }
        }
        System.out.println(" number of lowercase vowels:"+c);

    }
    
}

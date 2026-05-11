import java.util.*;
import java.lang.*;
public class strings1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=sc.nextLine();
        int s=str.length();
        System.out.println(s);
        String sp=str.substring(1,5);
        System.out.println("substring:"+sp);
    }
    
}

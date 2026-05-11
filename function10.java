import java.math.*;
import java.util.*;
public class function10 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double s=Math.abs(a);
        double p=Math.max(a,b);
        double y=Math.min(a,b);
        double k=Math.pow(a,b);
        double x=Math.sqrt(a);
        System.out.println("absolute value"+s);
        System.out.println(" minimum"+y);
        System.out.println(" maximum"+p);
        System.out.println(" power"+k);
        System.out.println("square root"+x);
    }
    
}

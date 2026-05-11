import java.util.*;
public class function8 {
    public static int isEven(int a)
    {
    boolean s=(a%2==0)?true:false;
    System.out.println(s);
    return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc .nextInt();
        isEven(a);
    }
    
}

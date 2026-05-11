import java.util.*;
public class function2 {
    public static void factorial(int a){
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
     System.out.println("factorial:"+f);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        factorial(a);
         System.out.println("enter a number");
        int b=sc.nextInt();
        factorial(b);
    }
    
}

import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
try{        int c=sc.nextInt();
int avg=(a+b+c)/3;
System.out.println("average:"+avg);
    }catch(ArithmeticException e)
    {
        System.out.println(e.getMessage());
    }
    
}
}

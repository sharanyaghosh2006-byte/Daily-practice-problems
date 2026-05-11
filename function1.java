import java.util.*;
public class function1 {
    public static void product(int a,int b)
    {
        int r=a*b;
        System.out.println("result:"+r);
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println(" enter two numbers");
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     product(n1,n2);
     System.out.println(" enter two numbers");
    int n3=sc.nextInt();
    int n4=sc.nextInt();
    product(n3,n4);
}
}

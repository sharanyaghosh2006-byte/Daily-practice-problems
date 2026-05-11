import java.util.*;
public class function6 {
    public static void dectobin(int a){
        int k[]=new int[30];
        int i=0,j;
     while(a!=0)
     {
       int l=a%2;
       k[i]=l;
       a=a/2;
        i++;
     }
     System.out.println(" binary digit");
     for(j=i-1;j>=0;j--)
     {
        System.out.print(k[j]);
     }
    }
    public static void bintodec(int b){
        double i=0.0,s=0.0;
        while(b!=0)
         {
            int l=b%10;
             s=s+l*Math.pow(2.0, i);
             b=b/10;
             i++;
         }
             System.out.print(s);
             }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number in decimal");
        int a=sc.nextInt();
        dectobin(a);
        System.out.println("enter na number in binary");
        int b=sc.nextInt();
        bintodec(b);
    }
}

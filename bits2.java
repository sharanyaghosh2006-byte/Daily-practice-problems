import java.util.*;
import java.lang.*;
public class bits2 {
    public static void getith(int n,int i){
        int bitmask=(1<<i);
        if((n&bitmask)==0)
        {
            System.out.println("ith bit is 0");
        }
        else{
            System.out.println("ith bit is 1");
        }
    }
    public static void setith(int n,int i){
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
    public static int clearith(int n,int i){
        int bitmask=~(1<<i);
        System.out.println(n&bitmask);
        return n&bitmask;
    }
    public static void updatebit(int n,int i,int newbit)
    {
      int n1=clearith(n,i);
       System.out.println(n1|(newbit<<i));

    }
    public static void clearlastbits(int n,int i){
        int bitmask=((~0)<<i);
        System.out.println(n&bitmask);
        
    }
    public static void clearange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bm=a|b;
        int s=n&bm;
        System.out.println(bm);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number");
        int n=sc.nextInt();
        System.out.println("enter the position");
        int i=sc.nextInt();
        System.out.println(" enter new bit");
        int nb=sc.nextInt();
        System.out.println(" enter value of j");
        int j=sc.nextInt();
        getith(n, i);
        setith(n, i);
        clearith(n, i);
        updatebit(n, i, nb);
        clearlastbits(n, i);
        clearange(n,i,j);
    }
}

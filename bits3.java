import java.util.*;
public class bits3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number to check");
        int n=sc.nextInt();
        int c=0;
        if((n&(n-1))==0)
        {
            System.out.println("power of two");

        }
        else{
            System.out.println(" not a power of two");
        }
        while(n>0)
        {
            if((n&1)==1){
                c++;

            }
            n=n>>1;

        }
        System.out.println(("no.of set bits:"+c));
    }
    
}

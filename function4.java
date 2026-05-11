import java.util.*;
public class function4 {
    public static void prime(int a){
        int i,c=0;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c>0){
            System.out.println(" not a prime");
        }
        else{
            System.out.println(" prime number");
        }
        }
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter a number");
            int a =sc.nextInt();
            prime(a);
        }
}

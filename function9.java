import java.util.*;
public class function9 {
    public static int sum(int a)
    {
        int s=0,p=0;
      int k=a;
        while(a!=0)
        {
            int l=a%10;
            s=s+l;
            p=p*10+l;
            a=a/10;
        }
        System.out.println(" sum of digits"+s);  
        if(p==k)
            {
                System.out.println(" palindrome number");
            }  
            else
            {
                System.out.println("non palindrome");
            }
            return a;

        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter a number");
            int a=sc.nextInt();
            sum(a);
            }
            }
        
    
        
    
    


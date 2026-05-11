
import java.util.*;
public class function3 {
     public static int factorial(int a){
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the power");
        int n=sc.nextInt();
        System.out.println("enter the term you whose binomial you want to find");
        int r=sc.nextInt();
        int p=n-r;
        int s=factorial(n);
        int d=factorial(r);
        int t=factorial(p);
        int bc=s/(d*t);
        System.out.println(" binomial coefficient:"+bc);

    }

    
}

import java.util.*;
public class bits1 
    {
        public static void oddeven(int n)
        {
            if((n&1)==1){
                System.out.println(" odd number");
            }
            else{
                System.out.println(" even numbers");
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n=sc.nextInt();
            oddeven(n);
        }
    }
    


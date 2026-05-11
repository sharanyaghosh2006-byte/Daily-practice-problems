import java.util.*;
public class function5 {
    public static void primerange(int s,int e){
        int i,j;
        for (i=s;i<=e;i++)
        {
            int c=0;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==0 & i!=1){
            System.out.println(i);
        }
        }
        }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range start number");
        int s=sc.nextInt();
        System.out.println("enter the range end number");
        int e=sc.nextInt();
        primerange(s,e);
        
    }
}
    


import java.util.*;
public class bits4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number");
    int n=sc.nextInt();
    System.out.println(" enter the power");
    int i=sc.nextInt();
    int result=1;
    while(n>0)
    {
    if(i%2!=0)
    {
        result=result*n;
    }
    n=n*n;
    i=i/2;
    }
    System.out.println(result);
}    
}


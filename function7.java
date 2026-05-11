import java.util.*;
public class function7 {
    public static void average(int a,int b,int c){
        int av=(a+b+c)/3;
    System.out.println("average:"+av);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a,b,c);
    }
    
}

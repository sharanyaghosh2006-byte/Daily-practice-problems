import java.util.*;
import java.lang.*;
public class strings4 {
    public static void shortestdistance(String str,int sx,int sy){
        int x=sx,y=sy;
      int  x1=sx;
       int y1=sy;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='w')
            {
                x=x-1;
            }
            else if(ch=='e')
            {
             x=x+1;
            }
            else if(ch=='s')
            {
                y=y-1;
            }
            else if(ch=='n'){
                y=y+1;
            }
            }
         int s=(y-y1)*(y-y1)+(x-x1)*(x-x1);
         double sd=Math.sqrt(s);
         System.out.println("shortest distance:"+sd);
        }
    
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter the direction string");
            String str=sc.nextLine();
            System.out.println("enter starting distance and ending distance");
           int sx=sc.nextInt();
           int sy=sc.nextInt();
            shortestdistance(str,sx,sy);
        }
}
    


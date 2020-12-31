package strong;
import java .util.*;
public class Armstrong
{
    public void arm(int n)
   {
      int originalnum,rem,result=0;
       originalnum=n;       
       while(originalnum!=0)
        {
         rem=originalnum%10;
         result+=Math.pow(rem,3);
         originalnum/=10;
        }
    if(result==n)
      System.out.println(n+"Is an Armstrong");
    else
            System.out.println(n+"Is not an Armstrong");

   }
}

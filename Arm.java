package strong;
import java .util.*;
public class Armstrong
{
    public void arm(int n)
   {
      int num,originalnum,rem,result=0;
       originalnum=num;       
       while(originalnum!=0)
        {
         rem=originalnum%10;
         result+=Math.pow(rem,3);
         originalnum/=10;
        }
    if(result==num)
      System.out.println(num+"Is an Armstrong");
    else
            System.out.println(num+"Is not an Armstrong");

   }
}

import strong.Armstrong;
import java.util.*;
public class ArmDemo
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
      int num=s.nextInt();
       Armstrong obj=new Armstrong();
       obj.arm(num);
   }
}

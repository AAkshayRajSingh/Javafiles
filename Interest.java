import java.util.Scanner;
import java.lang.Math;
public class Interest
{
  float SI,CI;
  Interest(int p,int r,int t)
  {
    SI=p+p*r*t;
    
  }
  Interest(int p,int r,int t,int n)
  {
    CI=(p*(Math.pow(1+r),n)-1));
   
  }
 public static void main(String args[])
 {
   Interest obj1=new Interest(3,2,5);
   System.out.println("Simple interest="+obj1.SI);
   Interest obj2=new Interest(3,4,2,2);
   System.out.println("Compound interest="+obj2.CI);
   }
 }
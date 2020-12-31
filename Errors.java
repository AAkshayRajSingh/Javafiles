import java.util.Scanner;
class Errors
{
  void disp(int a,double b)
  {
    System.out.println("Method A");
  }
  void disp(int a,float b,double c)
  {
    System.out.println("Method B");
  } 
  void disp(int a,float b)
  {
    System.out.println("Method C");
  }

}
class test
{
 public static void main(String args[])
 {
   int inte=100;byte by=1;float flt=20.5f;
   Errors obj=new Errors();
   obj.disp(by,flt);
   obj.disp(by,inte,flt);
   }
 }
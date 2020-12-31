import java.util.Scanner;
abstract class A
{
   abstract void callme();
   public void Instance()
{ 
   System.out.println("this is instance method");
}
}
 public class B extends A
   {
     void callme()
      {
         System.out.println("This is abstract method call me.");
      }
       public static void main(String args[])
       {
         B b=new B();
          b.callme();
           b.Instance();
       }
   }
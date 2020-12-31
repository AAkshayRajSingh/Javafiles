import java.util.*;
class DuplicateCharacter1
{
   public static void main(String args[])
   {
     System.out.println("Enter string with duplicates:");
     Scanner s=new Scanner(System.in);
     String i="";
     i=s.nextLine();
     uniqueCharacters(i);
   }
   public static void uniqueCharacters(String i)
   {
     String temp="";
     for(int k=0;k<i.length();k++)
     {
         char cur=i.charAt(k);
         if(temp.indexOf(cur)<0)
         {
            temp=temp+cur;
         }
       else
        {
          temp=temp.replace(String.valueOf(cur),"");
        }
     } 
  System.out.println(temp+" ");
   }
}
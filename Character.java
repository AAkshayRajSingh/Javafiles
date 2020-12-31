import java.util.*;
class DuplicateCharacter
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
         if(temp.indexOf(i.charAt(k))==-1)
         {
            temp=temp+i.charAt(k);
         }
     } 
  System.out.println(temp+" ");
   }
}
import java.util.*;
public class specialChar
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String str1=str.replaceAll("//str+","");
	String str2=str1.replaceAll("[^a-zA-Z]","");
	System.out.println("String with no special characters is:"+str2);
    System.out.println("No of characters in a String is: "+str2.length());

	}
}
import java.util.*;
cimport java.util.ArrayList;
import java.Math.max;
public class printVertically
{
	public List<String> printVertical(String s){
	  List<String> result=new ArrayList<>();
	  String[] words=s.split();
	  int maxLength=getMaxlength(words);
	  for(int i=0;i<maxlength;i++){
	    StringBuilder Str =new StringBuilder();
		for(String word:words){
		 if(i>=word.length())
			 str.append(" ");
		 else
			 str.append(word.charAt(i));
		}
		result.add(trimRight(str.toString()));
	   }
	   return result;
	}
	private String trimRight(String word){
	 int i=maxLength();
	 while(--i>-1)
		 if(word.charAt(i)!=' ')
		  return word.substring(0,i+1);
	 return null;
	}
	private int getMaxlength(String[] words){
	 int max=0;
	 for(String word:words){
	 max=Math.max(max,word.length());
	 }
	 return max;
	}
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 String s;
	 for(int i=0;i<n;i++){
	 s=sc.nextLine();
	 }
	 printVertically print = new printVertically();
	 print.printvertical(s);
	}
}
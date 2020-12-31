/*
Friend's Relationship
Attempted by: 10515/Accuracy: 86%/Maximum Points: 20/
/
No tags
PROBLEMEDITORIALMY SUBMISSIONSANALYTICSDISCUSSIONS
Jack is your friend and Sophia is his girlfriend. But due to some unknown reason ( unknown for us, they know it) Sophia started hating to Jack. Now, Jack is in big trouble but he has a solution, He knows that if he will gift T patterns of a particular type ( For pattern observation see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need your help to gift her that type patterns of '*' and '#' of N lines. So, it's your responsibility to save your friend's relationship.

Jack is your friend and Sophia is his girlfriend. But due to some unknown reason ( unknown for us, they know it) Sophia started hating to Jack. Now, Jack is in big trouble but he has a solution, He knows that if he will gift T patterns of a particular type ( For pattern observation see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need your help to gift her that type patterns of '*' and '#' of N lines. So, it's your responsibility to save your friend's relationship.

Constraints :

1 =? T =?100

1 =? N =?30

Input :

First Line contains T i.e. number of test case.
Each of the next T lines contain an integer N.

Output:

For each test case print the pattern of N lines then after a blank line.

SAMPLE INPUT 
3
9
2
5
SAMPLE OUTPUT 
*################*
**##############**
***############***
****##########****
*****########*****
******######******
*******####*******
********##********
******************

*##*
****

*########*
**######**
***####***
****##****
**********

*/
import java.util.*;
public class pattern
{
	public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int T=sc.nextInt();
  int X;
  while(T-->0){
	  X=sc.nextInt();
   for(int i=1;i<=X;i++){
     for(int j=1;j<=(2*X);j++){
	  if(j>i && j<=(2*X)-i)
		  System.out.print("#");
	  else
		  System.out.print("*");
	 }
	 System.out.println();
   }
   System.out.println();
   
  }
	}
}
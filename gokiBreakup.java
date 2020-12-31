/*import java.util.*;
public class gokiBreakup
{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.n	extInt();
	int x=sc.nextInt();
	int temp;
	for(int  i=0;i<n;i++){
	temp=sc.nextInt();
	if(temp>=x)
		{
	      System.out.println("YES");
	    }
		else
			System.out.println("NO");
	}
	}
}*/
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class gokiBreakup {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int x=Integer.parseInt(br.readLine());
        int temp;
        for(int i=0;i<n;i++){
           temp=Integer.parseInt(br.readLine());
            if(temp>=x)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        
    }
}

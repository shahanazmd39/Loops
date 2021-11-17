import java.util.Scanner;

public class Oddnumbers {

	public static void main(String[] args) 
	{
		Scanner pav = new Scanner(System.in);
        System.out.println("Enter the minimum limit");
        int x = pav.nextInt();
        Scanner reh = new Scanner(System.in);
        System.out.println("Enter the maximum  limit");
        int n = reh.nextInt();
        
        //check minimum value is even or odd.
        
        if(x%2==0) 
        {
        	x= x+1;
        }
		do {
			System.out.println(x);
			x = x+2;
		   }while(x<n); 
     }
}

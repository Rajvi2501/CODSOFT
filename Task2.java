import java.util.*;
public class Task2 {

	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int S1,S2,S3,S4,S5;
	System.out.print("Marks of Subject1: ");
	S1=sc.nextInt();
	System.out.print("Marks of Subject2: ");
	S2=sc.nextInt();
	System.out.print("Marks of Subject3: ");
	S3=sc.nextInt();
	System.out.print("Marks of Subject4: ");
	S4=sc.nextInt();
	System.out.print("Marks of Subject5: ");
	S5=sc.nextInt();
	int s=S1+S2+S3+S4+S5;
	int avg=s/5;                            
	System.out.println("Average marks: "+avg);
	if(avg>=90)
	 System.out.print("Grade: A");        
	else if(avg>=80&&avg<90)
	  System.out.print("Grade: B");        
	else if(avg>=70&&avg<80)
		  System.out.print("Grade: C");    
	else if(avg>=60&&avg<70)
		  System.out.print("Grade: D");    
	else if(avg>=50&&avg<60)
		  System.out.print("Grade: E");   
	else
		System.out.print("Grade: F");      
	}
}
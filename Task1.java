import java.util.*;
public class Task1{
    public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(100),b=1,s=0;
        System.out.println("Welcome to the Number Game");
        while(b<=5)
        {
	        System.out.print("Enter The Number:    ");
	        int c = sc.nextInt();
	        if(c>a)
	        {
		        System.out.println("It is large value");
		        s++;
	        }
	        else if(c<a)
	        {
		        System.out.println("It is small value ");
		        s++;
	        }
	        else
	        {
		        System.out.println("Succesful");
		        break;
	        }
	        b++;
        }
        int f=5-s;
  
        if(s==5)
        {
	    System.out.println("Better luck next time!!");
        }
        else
        {
	    System.out.println("Congrats!! You Won The Game!\nPlay Again!");
	    System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number is "+a);
    }
}
import java.util.Scanner;
/**
*
* @author KgaogeloM
* @VAT IT Test
*/
public class Fibonacci {
   //The main method
   public static void main(String args[])
   {
       //Declaring variables
       int input = 0;
       int num = 0;
       int firstFib = 1;
       int secondFib = 1;
       int thirdFib;
       Scanner scan = new Scanner(System.in);
       
       //Prompting and validating user input
       do
       {
          System.out.print("\nEnter the desired nth term: ");
		   
          if(scan.hasNextInt())
          {
             num = scan.nextInt();
             input = 1;
          }
          else
          {
             String dump = scan.next();
          }
		   
       }while(input == 0);
	   
       //Printing the nth term 
       System.out.println("The " + num +"th term is: " + Calculator.fab(num));
       
       //printing the series of numbers up to the nth term
       System.out.println("\nThe series of numbers is : ");

       for(int i = 0; i < num; i++)
       {
          System.out.print(firstFib + " ");
	  thirdFib = firstFib + secondFib;
	  firstFib = secondFib;
	  secondFib = thirdFib; 
       }   
   }

}

/**
*
* @author KgaogeloM
* @VAT IT Test
*/
public class Calculator 
{
   //Static recursive method to calculate and sets the nth term 
   public static int fab(int n)
   {
      if(n <= 1)
      {
         return n;
      }
      //statement returning the desired nth term
      return (fab(n-1) + fab(n-2));
   }
}


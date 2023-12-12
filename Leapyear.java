import java.util.Scanner;

public class Leapyear
{
   public static void main(String args[])
   {
     Scanner reader=new Scanner(System.in);
     System.out.print("enter the year:");
     int year= reader.nextInt();
     if(year%400 ==0)
     {
        System.out.print(+year+ "is leap year");
     }
     else if(year % 4==0 && year % 100!=0)
     {
        System.out.print(+year+ "is a leap year");
     }
     else
     {
        System.out.print(+year+ "is not a leap year");
     }
   }
}
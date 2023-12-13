import java.util.Scanner;
public class SumAverage
{
   public static void main(String arg[])
   {
     Scanner reader=new Scanner(System.in);
     System.out.println("enter the first number:");
     int n1=reader.nextInt();
     System.out.println("enter the secound number:");
     int n2=reader.nextInt();
     System.out.println("enter the third number:");
     int n3=reader.nextInt();
     System.out.println("enter the fourth number:");
     int n4=reader.nextInt(); 
     System.out.println("enter the fifth number:");
     int n5=reader.nextInt();
     int Sum =n1+n2+n3+n4+n5;
     float avg=Sum/5;
     System.out.println("the sum is="+Sum);
     System.out.println("the Average is="+avg);
    }
}      
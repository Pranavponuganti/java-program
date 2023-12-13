import java.util.Scanner;

public class firstNnatural
{
  public static void main(String args[])
  {
    System.out.println("enter the number:");
    Scanner reader =new Scanner(System.in);
    int number=	reader.nextInt();
    System.out.println("first n natural numbers are:");
    for(int i=1;i<=number;i++)
    {
       System.out.println(i);
    }
   }
} 
    
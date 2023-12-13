import java.util.Scanner;
public class Multiplication
{
  public static void main(String args[])
  {
    System.out.println("enter the number:");
    Scanner reader=new Scanner(System.in);
    int number= reader.nextInt();
    for(int i=1;i<11;i++)
    {
       System.out.println(number+"x"+i+ "=" +number*i);
    }
   }
}
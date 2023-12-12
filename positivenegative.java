import java.util.Scanner;
public class positivenegative
{
  public static void main(String args[])
  {
     Scanner reader=new Scanner(System.in);
     System.out.print("enter the number:");
     int number=reader.nextInt();
     if(number>0)
     {
        System.out.print(+number + "is an positive number");
     }
     else
     {
        System.out.print(+number + "is an negative number");
     }
  }
}
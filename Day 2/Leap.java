import java.util.Scanner;
public class Leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int year,leap=1;
System.out.println("enter a year number");
year=s.nextInt();
if(year%400==0)
{
leap=year;
System.out.println("that is a leap year"+leap);
}
else
{
System.out.println("not a leap year");
}
}
}

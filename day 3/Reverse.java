import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,n;
System.out.println("enter n natural numbers:");
n=s.nextInt();
i=10;
while(i>=n)
{
System.out.println(i);
i--;
}
}
}


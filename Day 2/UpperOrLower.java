import java.util.Scanner;
public class UpperOrLower
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch;
System.out.println("enter an input:");
ch=s.next().charAt(0);
if(ch>='A'||ch<='Z')
{
System.out.println("upper case");
}
else
{
System.out.println("lower case");
}
}
}


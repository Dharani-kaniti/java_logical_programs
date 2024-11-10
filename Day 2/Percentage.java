import java.util.Scanner;
public class Percentage
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter physics marks");
int phy=s.nextInt();
System.out.println("enter chemistry marks");
int che=s.nextInt();
System.out.println("enter biology marks");
int bio=s.nextInt();
System.out.println("enter maths marks");
int math=s.nextInt();
System.out.println("enter computer marks");
int com=s.nextInt();
 int total=phy+che+bio+math+com;
System.out.println("the total marks are "+total);
int per=total/375*100;
if(per>=90)
{
System.out.println("A grade");
}
else if(per<=80)
{
System.out.println("B grade");
}
else if(per<=70)
{
System.out.println("c grade");
}
else if(per>=60)
{
System.out.println("d grade");
}
else
{
System.out.println("e grade");
}
}
}




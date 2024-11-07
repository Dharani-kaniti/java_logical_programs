import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sno;
String sname;
int phy_marks;
float che_marks;
float math_marks;
float average;
float total;
System.out.println("enter the Student number:");
sno=s.nextInt();
System.out.println("enter the Student name:");
sname=s.next();
System.out.println("enter the Student physics marks:");
phy_marks=s.nextInt();
System.out.println("enter the Student chemistry marks:");
che_marks=s.nextFloat();
System.out.println("enter the Student maths marks:");
math_marks=s.nextInt();
total=phy_marks+che_marks+math_marks;
System.out.println(" the Student total marks:"+total);
average=phy_marks+che_marks+math_marks/3;
System.out.println(" the Student average marks:"+average);
System.out.println(" the Student total marks:"+total);
System.out.println(" the report of the student is"+phy_marks+","+che_marks+","+math_marks+","+"and total is"+total+"the average is"+average);
}
}





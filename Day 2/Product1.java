import java.util.Scanner;
class Product1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost;
float pquantity;
float Bill;
System.out.println("Enter the product number:");
pno=sc.nextInt();
System.out.println("Enter the product name:");
pname=sc.next();
System.out.println("Enter the product cost:");
pcost=sc.nextFloat();
System.out.println("Enter the product quantity:");
pquantity=sc.nextFloat();
Bill=pcost*pquantity;
System.out.println(" the product number is:"+pno);
System.out.println("the product name:"+pname);
System.out.println(" the product cost:"+pcost);
System.out.println(" the product cost:"+pcost);
System.out.println(" the product quantity:"+pquantity);
System.out.println(" the product Bill:"+Bill);
System.out.println(" the product report is"+pno+","+pname+","+pcost+","+pquantity+", and the final bill is"+Bill);
}
}




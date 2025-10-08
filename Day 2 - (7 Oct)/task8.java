import java.util.*;
import java.io.*;

public class task8
{
    
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter the length of the rectangle : ");
double length=sc.nextDouble();
System.out.print("Enter the width of the rectangle : ");
double width=sc.nextDouble();

System.out.println("Area of the rectangle: "+(length*width));
System.out.println("Perimeter of the rectangle: "+(2*(length*width)));
}
}





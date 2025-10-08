import java.util.*;
import java.io.*;

public class task4
{
    
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter the radius: ");
double radius=sc.nextInt();

double Area=Math.PI*(radius*radius);
System.out.printf("The area of the circle is: %.2f ",Area);
}
}
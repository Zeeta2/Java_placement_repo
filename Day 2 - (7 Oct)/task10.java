import java.util.*;
import java.io.*;

public class task10
{
    
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter a year: ");
int year=sc.nextInt();

if((year%4==0&&year%100!=0)||year%400==0){
    System.out.println("Yes, "+year+" is a leap year.");
}
else{
    System.out.println("No, "+year+" is not a leap year.");
}
}
}
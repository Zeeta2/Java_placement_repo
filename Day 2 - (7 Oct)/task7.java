import java.util.*;
import java.io.*;

public class task7
{
    
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter number 1: ");
int num1=sc.nextInt();
System.out.print("Enter number 2: ");
int num2=sc.nextInt();

System.out.print("Enter an option (+,-,*,/,%) : ");
String operation=sc.next();
int sum=0;

switch(operation){
case "+": sum=num1+num2; break;
case "-": sum=num1-num2; break;
case "*": sum=num1*num2; break;
case "/": sum=num1/num2; break;
case "%": sum=num1%num2; break;
default : System.out.print("Invalid operator");
}
    System.out.print("Result : "+sum);
}}
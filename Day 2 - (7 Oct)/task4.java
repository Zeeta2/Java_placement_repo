import java.util.*;
import java.io.*;

public class task4
{
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
System.out.print("Enter your account balance: ");
double balance=sc.nextDouble();
System.out.print("Enter your withdrawal amount: ");
double withdrawal=sc.nextDouble();

if(balance>=withdrawal){
System.out.println("Amount deducted : "+withdrawal);
}
else{
System.out.println("Insufficient balance");
}
}
}
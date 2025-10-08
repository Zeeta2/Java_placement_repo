import java.util.*;
import java.io.*;
public class task5
{
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter total purchase amount: ");
double Total_purchase_amount=sc.nextDouble();

if(Total_purchase_amount>5000){
System.out.println("Discounted price is : "+(Total_purchase_amount-(Total_purchase_amount*0.20)));
}
else if(Total_purchase_amount>2000){
System.out.println("Discounted price is : "+(Total_purchase_amount-(Total_purchase_amount*0.10)));
}
else{
System.out.println("Discounted price is : "+Total_purchase_amount);
}
}
}
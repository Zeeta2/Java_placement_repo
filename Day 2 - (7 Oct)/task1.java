import java.util.*;
import java.io.*;
public class task1
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the units consumed : ");
int units=sc.nextInt();
double bill=0;

if(units<=100){
    bill=units*5;
} 
else if(units<=300){ 
    bill=(100*5)+((units-100)*7); 
    
}else{ 
    bill=(100*5)+(200*7)+((units-300)*10);
}
    
double surcharge=bill*0.1; 
if(bill>2000){
    System.out.print("The Total bill = "+(bill+surcharge));
} 
else{ 
    System.out.print("The Total bill = "+bill);
}
}
}
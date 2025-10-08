import java.util.*;
import java.io.*;

public class task2
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of 5 subject : ");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();

int avg=(m1+m2+m3+m4+m5)/5;

if(avg>=90){
System.out.println("Grade:A+");
}else if(80<=avg&&avg<=89){
System.out.println("Grade:A");
}else if(70<=avg&&avg<=79){
System.out.println("Grade:B");
}else if(60<=avg&&avg<=69){
System.out.println("Grade:C");
}else{
System.out.println("Fail");
}
}
}
// Password retry system (Using while loop + condition)

import java.util.*;
import java.io.*;

public class task3
{
    	public static void main(String[] args) {
    	   Scanner sc= new Scanner(System.in);
    	   
    	   String  c_pw="zazaza";
    	   int Attempts=3;
    	   System.out.print("Enter Username: ");
    	   String username=sc.next();
    	   
    	   while(Attempts!=0){
    	       
    	   System.out.print("Enter password: ");
    	   String pw=sc.next();
    	   Attempts--;
    	       if(pw.equals(c_pw)){
    	           System.out.println("Login successfully.");
    	           break;
    	       }else{
    	           
    	           System.out.println("Wrong password "+Attempts+(" Attempts left."));
    	           
    	           if(Attempts==0){
    	               System.out.println("Invalid password");
    	           }
    	       }
    	       
    	   }
    	    
    	}}
    	       
	        
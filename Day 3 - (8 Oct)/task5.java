//Print all prime numbers between 1 and 10

import java.util.*;
import java.io.*;

public class task5
{
    	public static void main(String[] args) {
    	   System.out.println("The prime numbers are: ");
    	   for(int i=1;i<=10;i++){
    	        int count=0;
    	        
    	       for(int n=1;n<=i;n++){
    	           if(i%n==0)
    	               count++;
    	       }
    	           if(count==2)
    	           
    	           System.out.println(i);
    	}}}
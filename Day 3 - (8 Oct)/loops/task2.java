//Multiplication table from 1 to 20(for user-entered numbers)

import java.util.*;
import java.io.*;

public class task2
{
    	public static void main(String[] args) {
    	    Scanner sc= new Scanner(System.in);
    	    System.out.print("Enter a number: ");
    	    int num=sc.nextInt();
    	    for(int i=1;i<=20;i++){
	        System.out.println(num+ " x " + i + " = " +(num*i));
	    }}}
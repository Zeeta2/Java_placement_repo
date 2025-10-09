//Print Even Numbers from 5 to 55

import java.util.*;
import java.io.*;

public class task1
{
	public static void main(String[] args) {
	    System.out.println("The even numbers are: ");
	    for(int i=5;i<=55;i++){
	        if(i%2==0){
	            System.out.print(i+" ");
	        }
	    }
	}
}
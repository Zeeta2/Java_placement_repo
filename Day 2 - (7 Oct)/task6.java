import java.util.*;
import java.io.*;

public class task6
{
    
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 

System.out.print("Enter an option (Red,Yellow,Green) : ");
String colour=sc.next().toLowerCase();

switch(colour){
case "red":System.out.println("Red says Stop!");break;
case "yellow":System.out.println("Yellow says Get Ready!");break;
case "green":System.out.println("Green says Go!");break;
default : System.out.print("Enter the right colour");
}}}
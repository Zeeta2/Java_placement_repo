import java.util.*;
import java.io.*;

public class task3{
public static void main(String[] args) { Scanner sc=new Scanner(System.in); 
double salary=sc.nextInt();
int exp=sc.nextInt(); 

if(exp>5){
System.out.println("bonus:"+(salary*0.15));
}
else if(exp>=3&&exp<5){ 
System.out.println("bonus:"+(salary*0.10)); 
}else{
System.out.println("bonus:"+(salary*0.05));
} 
}
}
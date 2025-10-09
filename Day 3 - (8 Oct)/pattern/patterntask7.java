//7.Diamond Shapes
public class patterntask7
{
	public static void main(String[] args) {
	   int i,j;
		for(i=1;i<=5;i++){ 
		    for(j=1;j<=i;j++){ 
		        System.out.print("  ");
		        if(j==1||j==i||i==5){
		         System.out.print("*");
		        }
		    else{
		        System.out.print(" ");
		    }}
		     System.out.println();
		   }}}
		
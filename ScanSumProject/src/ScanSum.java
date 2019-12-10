import java.util.Scanner;


public class ScanSum{
   public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//sc.useDelimiter("\t");
	System.out.println("Enter sum digits and press enter at the end: \n");
	String s = sc.nextLine();
	String[] s2 = s.split(" ");
	double sum = 0;
	for(String ss : s2){
	sum+=Double.parseDouble(ss);
	}
	
	//while(sc.hasNextInt()){
	  // sum+=sc.nextInt();
//	}
	System.out.println(sum);
   }

}

import java.io.*;

public class InputStreamReaderReadMethod{
   public static void main(String[] args){
	File file = new File("/home/pro/PROGRAMMING-PROJECTS/Java-Workspace/Resources/fulltext.txt");
	try(InputStreamReader isr = new InputStreamReader(new FileInputStream(file))){
	   char[] chars = new char[80];
	   isr.read(chars);
	   System.out.println(new String(chars));
	System.out.println("*****************************");
	   isr.read(chars);
	   System.out.println(new String(chars));
/*	   while((isr.read(chars))!=-1){
		System.out.println(new String(chars));
	   }
*/
	}catch(Exception e){
	   e.printStackTrace();
	}
   }

}

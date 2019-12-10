import java.io.*;

public class FileReaderReadMethod{
   public static void main(String[] args){
	File file = new File("/home/pro/PROGRAMMING-PROJECTS/Java-Workspace/Resources/fulltext.txt");
	try(BufferedReader isr = new BufferedReader(new FileReader(file))){
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

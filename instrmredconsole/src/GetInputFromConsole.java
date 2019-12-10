import java.io.*;
import java.util.Arrays;

public class GetInputFromConsole{
   public static void main(String[] args){
	
	char[] chars = new char[100];
	System.out.println("Enter some text: ");
	try(InputStreamReader isr = new InputStreamReader(System.in);
	    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("./file")))){

		osw.write(isr.read());

		isr.read(chars);
		osw.write(chars);
System.out.println(chars);
System.out.println(Arrays.toString(chars));
System.out.println(new String(chars));
	}catch(Exception e){
	   e.printStackTrace();
	}
   }

}

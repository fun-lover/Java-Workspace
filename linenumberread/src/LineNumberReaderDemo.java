import java.io.*;

public class LineNumberReaderDemo{

   public static void main(String[] args) throws IOException{
	LineNumberReader lnr = new LineNumberReader(new FileReader("./file.txt"));

	if (lnr.markSupported()){
	   System.out.println("mark supported");
	   
	}
	lnr.skip(10);
	System.out.print(lnr.getLineNumber() + " : ");
	System.out.println(lnr.readLine());
	lnr.mark(100);
	System.out.print(lnr.getLineNumber() + " : ");
	System.out.println(lnr.readLine());

	
	lnr.reset();

	System.out.print(lnr.getLineNumber() + " : ");
	System.out.println(lnr.readLine());

	lnr.close();
   }

}

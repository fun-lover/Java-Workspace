import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;


public class ScanXan{
   public static void main(String[] args){
	JFileChooser fch = new JFileChooser();
	if (fch.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
	   File file = fch.getSelectedFile();
	   if (file.isDirectory() || !(file.exists())){
		JOptionPane.showMessageDialog(null, "Bad Choise!");
		System.exit(0);
	   }
	   Scanner sc = null;
	   try(BufferedReader br = new BufferedReader(new FileReader(file));){
		String s;
		sc = new Scanner(br);
		sc.useLocale(Locale.)
		while (sc.hasNext()){
		   System.out.println(sc.next());
		}	
	   }catch(Exception e){
		e.printStackTrace();
	   }finally{
		if(sc!=null) sc.close();
	   }
	}

   }

}

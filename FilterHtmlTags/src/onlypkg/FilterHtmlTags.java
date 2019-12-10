package onlypkg;

import java.io.*;
import javax.swing.JFileChooser;



public class FilterHtmlTags{
   
   public static void main(String[] args){
	JFileChooser fch = new JFileChooser();
	if((fch.showOpenDialog(null))==JFileChooser.APPROVE_OPTION){
	   File file = fch.getSelectedFile();
	   try(BufferedReader fr = new BufferedReader(new HtmlFilter(new FileReader(file)))){
		String s;
		while((s=fr.readLine())!=null){		
		   System.out.println(s);
		}

	   }catch(Exception e){
		e.printStackTrace();
	   }
	}	

   }

}




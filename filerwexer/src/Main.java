import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class Main{

	public static void main(String[] args){
	   JFileChooser fileChooser = new JFileChooser();
	   if (fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
	      File file = fileChooser.getSelectedFile();
	      if (file.isDirectory() || !(file.exists())){
		JOptionPane.showMessageDialog(null, "Bad Choise!");
		System.exit(0);
	      }
	      try(FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(FileDescriptor.out);
		BufferedWriter bw = new BufferedWriter(fw);){
		   String c;
		   while ((c =br.readLine())!=null){
			bw.write(c);
			bw.newLine();
		   }
	      }catch (Exception ex) {
        	ex.printStackTrace();
	      }
	      
	   }
	}
}

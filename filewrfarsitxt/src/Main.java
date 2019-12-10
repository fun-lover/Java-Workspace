import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Main{
	public static void main(String[] args){
		JFileChooser fch = new JFileChooser();
		int i = fch.showOpenDialog(null);
		if (i==JFileChooser.APPROVE_OPTION){
		   File file = fch.getSelectedFile();
		   if (file.isDirectory() || !(file.exists())){
			JOptionPane.showMessageDialog(null,"Bad Selection!!");
			System.exit(0);
		   }			
		   try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/pro/testfile"))){
			int s;
			while((s=bis.read())!=-1){
			bos.write(s);
						
			}
		   }catch(Exception e){
			e.printStackTrace();
		   }
		}
	}

}

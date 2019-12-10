import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class CountLetter {

	public static void main(String[] args) {
		char cha;
		if (args.length!=1 || args[0].length()!=1){
			System.out.println("hoshhhhhhh..!");
			System.out.println("Default char:e");
			cha = 'e';
		}else{
			
			cha = args[0].charAt(0);
		}
		int count = 0;
		JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int retVal = fc.showOpenDialog(null);
		if (retVal == fc.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			if (!file.exists()) {
				JOptionPane.showMessageDialog(null, "File dont exist");
				System.exit(0);
			}
			try(BufferedReader br = new BufferedReader(new FileReader(file));) {
				
				while(br.ready() ) {
					if (br.read() == cha) {
						count++;
					}
					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(count);

	}

}

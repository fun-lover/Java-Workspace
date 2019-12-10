import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class CountWords{

   public static void main(String[] args){
	JFileChooser fch = new JFileChooser();
	if((fch.showOpenDialog(null))==JFileChooser.APPROVE_OPTION){
	   File file = fch.getSelectedFile();
	   if (file.isDirectory() || !(file.exists())) {
		System.err.println("Bad Choise!!");
		System.exit(0);
	   }
	   StringBuilder strBld = new StringBuilder();
	   String str;
	   int count=0;
	   Map<String, Integer> wordMap = new HashMap<>();
	   try(BufferedReader br = new BufferedReader(new FileReader(file))){
		while ((str = br.readLine())!=null){
		   strBld.append(str);
		   strBld.append(" ");
		}
		System.out.println(strBld.toString());
		System.out.println("*****************");
		StreamTokenizer stToken = new StreamTokenizer(new StringReader(strBld.toString()));
	        stToken.eolIsSignificant(false);
		String wordred;
		int currentCount;
		while(stToken.nextToken()!=StreamTokenizer.TT_EOF){
		   if(stToken.ttype == StreamTokenizer.TT_WORD){
			count++;
			String key = stToken.sval;
			
			if (wordMap.containsKey(key)){
			   currentCount = wordMap.get(key);
			   currentCount++;
			   wordMap.replace(key, currentCount);
			}else{
			   wordMap.put(key,1);
			}
		   }
		}
int total=0;
	   JOptionPane.showMessageDialog(null,"Number of Words is: " + count);
for (String key:wordMap.keySet()){
	   System.out.println(key + ":" + wordMap.get(key));
	   total+=wordMap.get(key);
}
	   System.out.println(total);		
	   }catch(IOException e){
		e.printStackTrace();
	   }
	}
   }

}

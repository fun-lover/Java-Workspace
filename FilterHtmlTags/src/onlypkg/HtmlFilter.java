package onlypkg;

import java.io.FilterReader;
import java.io.Reader;
import java.io.IOException;

public class HtmlFilter extends FilterReader{
   private boolean inTagFlag=false;
   public HtmlFilter(Reader r){
	super(r);
   }

   @Override
   public int read() throws IOException{
	int i = super.read();
	char c = (char)i;
	System.out.println(c+"....");
	if (c=='<'){
	   inTagFlag = true;
	   c = ' ';
	}else if (c=='>'){
	   inTagFlag = false;
	   c = ' ';
	}
	if (inTagFlag){
	   c = ' ';
	}
	
	return (int)c;
   }

   @Override
   public int read(char[] cbuff, int offset, int len) throws IOException{
	char[] c = new char[cbuff.length];
	int index = offset;
	int nums;
	if( (nums = super.read(cbuff, offset, len))==-1) 
	   return nums;

	for (int i=0; i<len; i++){   
 	   if (!inTagFlag){
		if (cbuff[i]=='<')
	 	   inTagFlag=true;
	   }else{
		nums--;
		if(cbuff[i-1]=='>' && cbuff[i]!='<'){
		   inTagFlag = false;
		   nums--;
		}
	   }
	   if (!inTagFlag){
		c[index] = cbuff[i];
		index++;
	   }

	}
	//for (int i=0; i<c.length; i++)
	//   cbuff[i] = c[i];
	// cbuff = c.clone();   --> WRONG!!!
	System.arraycopy(c,0,cbuff,0,c.length);
	return nums;
   }
}


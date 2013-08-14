import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Vector;

class ReadFile{
	
	int count=0;
	int originalLine=0;
	int newLine=0;
	Vector<String> importThing = new Vector<String>();
	String className = "";
	String newFileName="";
	int fileNo=0;

	
	BufferedWriter ccff;
    BufferedWriter ddd;
	
	
	public ReadFile(){
	
	}
	
	public Vector<String> getImport(){
		return importThing;
	}
	
	public String getNewName(){
		return newFileName;
	}
	
	public int getFileNo(){
		return fileNo;
	}
	
	public void readFile(String filepath, File temp, File finalFile, BufferedWriter outputFinal,
			BufferedWriter output) throws IOException{
		File file = new File(filepath);
		if (!file.isDirectory()) {
            System.out.println("You already have single source file");                         
		}
		else if (file.isDirectory()) {
           // System.out.println("directory");
            String[] filelist = file.list();

            for (int i = 0; i < filelist.length; i++) {
      
                    File readfile = new File(filepath + "/" + filelist[i]);
                    //System.out.println("name is: "+readfile.getName());
                    if (!readfile.isDirectory()&&readfile.getName().endsWith(".java")) {
                    	fileNo++;
//                    	System.out.println("come in");
                    	BufferedReader reader = null;  
                    	try {  
//                    		System.out.println("read by line");  
                    		reader = new BufferedReader(new FileReader(readfile));  
                    		String tempString = null;  
                    		
                    		//every time read a line, until no more lines. 
                    		while ((tempString = reader.readLine()) != null){
                    			originalLine++;
                    			if(tempString.contains("public static void main(String[] args)")){
                    				newFileName=className;
                    			}
                    			if(tempString.startsWith("package")){
                    				
                    			}
                    			else if(tempString.startsWith("import")){
                    				// dealing with the star in import
                    				if(tempString.contains("*")){
                    					String usefulString = tempString.substring(0, tempString.length()-2);
                    				
                    					for (int m=0;m<importThing.size(); m++){
                    						if(importThing.elementAt(m).startsWith(usefulString)&&
                    								usefulString.split("\\.").length==
                    								importThing.elementAt(m).split("\\.").length){
                    							importThing.removeElementAt(m);
                    							m--;
                    						}
                    					}
                    				}
                    				if(!importThing.isEmpty()){
                    					for(int j=0; j<importThing.size(); j++){
                    						if(!tempString.startsWith("import java")){
                    							count++;
                    						}
                    						else if(tempString.equals(importThing.elementAt(j))){
                    							// to count whether there is same import
                    							count++;
                    						}
                    						else if (importThing.elementAt(j).contains("*")){
                    							String temp1[] = tempString.split("\\.");
//                    							System.out.println("fdsafasfas "+ tempString+"//"+temp1.length);
                    							String temp2[] = importThing.elementAt(j).split("\\.");
                    							if(tempString.startsWith(importThing.elementAt(j).
                    									substring(0, importThing.elementAt(j).length()-2))&&
                    									temp1.length==temp2.length){
                    								count++;
                    							}
                    							
                    						}
                    						
                    				
                    					}
                    					if(count==0){
                    						importThing.add(tempString);
                    					}
                    					count=0;
                    				}else{
                    					if(tempString.startsWith("import java"))
                    					importThing.add(tempString);
                    				}
                    				
                    			}
                    			else if(tempString.startsWith("public class")||
                    					tempString.startsWith("public interface")||
                    					tempString.startsWith("public enum")||
                    					tempString.startsWith("public abstract class")||
                    					tempString.startsWith("public final class")){
                    				// change public class to class
                    				tempString=tempString.substring(7, tempString.length());
                    				//System.out.println(tempString);
                    				// get the class name
                    				className=tempString.substring(6,tempString.length());
                    				if(className.endsWith("{")){
                    					className=className.substring(0, className.length()-1);
                    				}
                    				if(className.endsWith(" ")){
                    					className=className.substring(0,className.length()-1);
                    				}
                    				//System.out.println(className);
                    				output.write(tempString+"\n");
                    				newLine++;
                    			}
                    			else{
                    				output.write(tempString+"\n");
                    				newLine++;
                    			}     			 
                    		}  
                    		reader.close();  
                    	} catch (IOException e) {  
                    		e.printStackTrace();  
                    	} finally {  
                    		if (reader != null){  
                    			try {  
                    				//output.close();
                    				reader.close();  
                    			} catch (IOException e1) {  
                    			}  
                    		}  
                    	} 
                    	

                    } else if (readfile.isDirectory()) {
//                    		System.out.println(filepath + "/" + filelist[i]);
                            readFile(filepath + "/" + filelist[i], temp, finalFile, outputFinal, output);
                    }
            }
            
            
    }
		//System.out.println(fileNo+" files were read in total");
		
	}
	 
	
}


public class CovertTool {
	
	 public static void main(String[] args) throws IOException {
		 long startTime=System.currentTimeMillis();
		 String Path="";
		 String[] tempPath = args[0].split("\\/");
		 for(int i =0; i< tempPath.length-1; i++){
			Path+="/"+tempPath[i];
		 }
		 
		 System.out.println("Read Multiple source files program from: "+ Path);
		 //System.out.println(args[1]);
		 
		 String savePath="";
		 String [] sPath = args[1].split("\\/");
		 for(int i =0; i< sPath.length; i++){
				savePath+="/"+sPath[i];
		 }
		 
		 //System.out.println("save path is: "+ savePath);
		 File temp = new File(Path +"/temp.java");
         File finalFile= new File(Path+"/final.java");
         
         if(finalFile.exists()){
         	finalFile.delete();
         }
         if(temp.exists()){
         	temp.delete();
         }
//         System.out.println("ok1");
         
         try {
        	temp.createNewFile();
			finalFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
//         System.out.println("ok2");
         BufferedWriter outputFinal;
	     BufferedWriter output;
		
		 outputFinal = new BufferedWriter(new FileWriter(finalFile));
		 output = new BufferedWriter(new FileWriter(temp));
		 
//		 System.out.println("ok3");
     	 ReadFile rf = new ReadFile();
//     	 System.out.println("ok4");
         rf.readFile(args[0], temp, finalFile, outputFinal, output);
//         System.out.println("ok5");
         Vector<String> importThing = rf.getImport();
         
         output.close();
         for(int i=0;i<importThing.size();i++){
         	outputFinal.write(importThing.elementAt(i)+"\n");
         }
         BufferedReader readerFinal= new BufferedReader(new FileReader(temp));
         String tempString1 = null;
         while((tempString1=readerFinal.readLine())!=null){
         	outputFinal.write(tempString1+"\n");
         }
        readerFinal.close();
        outputFinal.close();
        
        File runFile = new File(savePath + "/"+"main.java");
        System.out.println(rf.getFileNo()+" files were read");
        System.out.println("The single file program saved to: "+ savePath + "/"+"main.java");
        finalFile.renameTo(runFile);
        long endTime=System.currentTimeMillis();
        System.out.println("Total Time: "+(endTime-startTime)+"ms");
         
//         outputFinal.close();
//         output.close();
      
         
 }
}

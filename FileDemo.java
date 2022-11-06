import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		System.out.println();
		File file = null;
		file = new File("Some-Directory");
		
		System.out.println(file.length());
		file.setReadOnly();
		
		File file2 = new File(file,"homework.txt");
		try {
			System.out.println("File created");
			file2.createNewFile();
			
		}
		catch(IOException i){
			i.printStackTrace();
			
		}
		File[] files = file.listFiles();
		file.isDirectory();
		file.isFile();
	}

}

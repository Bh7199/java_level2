import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
    //
		File file1 = new File("C:\\Users\\bhatt\\OneDrive\\Desktop\\assign7.txt");
		try {
			if(file1.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("file Already exist.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception handled");
		}
		
		
	}
}

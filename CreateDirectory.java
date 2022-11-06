import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {

		// Create directory
		File file = new File("C:\\Users\\bhatt\\OneDrive\\Desktop\\javaAssignment7");
		if (file.mkdir()) {
			System.out.println("Folder Created.....");
		} else {
			System.out.println("cannot create folder");
		}
		// create file inside directory
		File file1 = new File(file, "Homework.txt");

		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Create more files
		File file2 = new File(file, "Something.txt");
		file2.createNewFile();

		File file3 = new File(file, "Welcome.txt");
		file3.createNewFile();

		// write inside file

		FileWriter filewriter = new FileWriter("C:\\Users\\bhatt\\OneDrive\\Desktop\\javaAssignment7\\Homework.txt");
		filewriter.write("This is an assignment for java level2 learning class");
		filewriter.close();

		FileWriter fw1 = new FileWriter("C:\\Users\\bhatt\\OneDrive\\Desktop\\javaAssignment7\\Something.txt");
		fw1.write("Something is written here.Please, have look into this file ");
		fw1.close();

		// FileWriter fw2 = new FileWriter("Welcome.txt");
		// fw2.write("Welcome to java Level 2 ");
		// fw2.close();

		// number of files
		String[] filenames = file.list();
		for (String s : filenames) {
			System.out.println(s);

			// File[]files = file.listFiles();
			// file.isDirectory();
			// file.isFile();

			// Delete file

			// System.out.println(file2.exists());
			if (file3.delete()) {
				System.out.println(file3.getName() + " file deleted");
			} else {
				System.out.println(" ");
			}

		}

	}
}

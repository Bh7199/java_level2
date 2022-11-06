package level2;

public class StudentNotFoundException extends Exception {
		
	int id;
	String message;

	public StudentNotFoundException(String message) {
		super(message);
	}

}

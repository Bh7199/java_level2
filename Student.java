package level2;

public class Student {
	static void SearchStudent(int id)throws StudentNotFoundException{
		if(id<12) {
			System.out.println("Student is present");
		}
		else {
			throw new StudentNotFoundException("Student not found");
		}
	}

	public static void main(String[] args) {
		try {
			SearchStudent(10);
		}
		catch(StudentNotFoundException snf) {
			
			
			System.out.println("Exception occured "+snf);
			//snf.printStackTrace();
			snf.getMessage();
			//System.out.println(snf.getMessage());
			
			
		}
		finally {
			System.out.println("exit");
		}

	}

}

import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
			return students;
		
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(Student.length==0)
			{
				throw new IllegalArgumentException("Illegal Argument.");
			}		



	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
       				


		if(index<0 || index>=students.lenght )
			{
				throw new IllegalArgumentException("Illegal Argument.");
			}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
		if(student==null)
			throw new IllegalArgumentException("Illegal Argument.");
		

		
		students[index]=student;
		if(index<0 || index>=students.lenght )
			{
				throw new IllegalArgumentException("Illegal Argument.");
			}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
			
		if(student==null)
			throw new IllegalArgumentException("Illegal Argument.");
		
		students[0]=student;
	
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		
		if(student==null)
			throw new IllegalArgumentException("Illegal Argument.");
		int l= students.lenght;
		students[l]=student;
	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
		if(student==null)
			throw new IllegalArgumentException("Illegal Argument.");

		students[index]=student;
		if(index<0 || index>=students.lenght )
			{
				throw new IllegalArgumentException("Illegal Argument.");
			}	
	
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		
		
		if(student==null)
			throw new IllegalArgumentException("Illegal Argument.");
		
		if(index<0 || index>=students.lenght )
			{
				throw new IllegalArgumentException("Illegal Argument.");
			}
		int i;
		for(i=index;i<= students.length ;i++)
		{
			students[i]=students[i+1];	
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i,j;
		for(i=0; i< students.length; i++)
		{
			if(students[i]==student)
			 j=i;
			
		}
		for(i=j;i<= students.length ;j++)
			{
				students[i]=students[i+1];	
			}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}

public class Student
{
	public String fName;
	public String sName;
	public byte age;
	public String className;
	public float gradeAverage = 0;
	public String address;
	
	//Static/Class variables
	public static int noOfStudents;
	public static float sumOfGrades;
	
	public String toString()
	{
		return "First Name: " + fName + "\n" + "Last Name: " + sName + "\n" + "Age: " + age + "\n" +
			   "Class Name: " + className + "\n" +
			   "Grade Average: " + gradeAverage + "\n" +
			   "Address: " + address;
	}
	
	public static float averageStudentGrade()
	{
		return Student.sumOfGrades / Student.noOfStudents;
	}
}
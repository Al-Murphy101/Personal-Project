public class Test
{
	public static void main (String[] args)
	{
		Student s1 = new Student();
		s1.fName = "Billy";
		s1.sName = "Davis";
		s1.age = 17;
		s1.className = "Leaving Cert 1";
		s1.gradeAverage = 70.50f;
		s1.address = "123 High Street";
		
		//update static variables
		Student.noOfStudents++;
		Student.sumOfGrades += s1.gradeAverage;
		
		
		Student s2 = new Student();
		s2.fName = "Anna";
		s2.sName = "Smith";
		s2.age = 18;
		s2.className = "Leaving Cert 1";
		s2.gradeAverage = 80.00f;
		s2.address = "123 Medium Street";
		
		//update static variables
		Student.noOfStudents++;
		Student.sumOfGrades += s2.gradeAverage;
		
		Student s3 = new Student();
		s3.fName = "Georgina";
		s3.sName = "Moriarty";
		s3.age = 17;
		s3.className = "Leaving Cert 1";
		s3.gradeAverage = 90.00f;
		s3.address = "123 Lower Street";
		
		//update static variables
		Student.noOfStudents++;
		Student.sumOfGrades += s3.gradeAverage;
		
		System.out.println(s1.toString());
		System.out.println();
		System.out.println(s2.toString());
		System.out.println();
		System.out.println(s3.toString());
		System.out.println();
		
		//generate report for the class
		System.out.println("There are: " +Student.noOfStudents+ " students");
		System.out.println("The grade average is: " +Student.averageStudentGrade());
	}
}
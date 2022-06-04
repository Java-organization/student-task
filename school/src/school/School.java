package school;

public class School {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.studentName = "Togrul";
		student.className = "8a";
		student.price = 9;
		student.subject = "Fizika";
		student.teacherName = "Tunzale";
		
	   student.classOfStudent(student.studentName, student. className);
	student.priceOfStudent(student.price);
    student.subjectOfStudent(student.subject,student.teacherName);
	}

}

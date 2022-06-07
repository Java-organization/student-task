package school;

public class School {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setStudentName("Togrul");
		student.setClassName("8a");;
		student.setPrice(9); 
		student.setSubject("Fizika");
		student.setTeacherName("Tunzale");
		
	   student.classOfStudent(student.getStudentName(), student.getClassName());
	student.priceOfStudent(student.getPrice());
    student.subjectOfStudent(student.getSubject(),student.getTeacherName());
	}

}

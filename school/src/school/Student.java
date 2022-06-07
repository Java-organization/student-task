package school;

public class Student implements StudentInterface {
	 private String studentName;
	 private String className;
	 private	int price;
	 private	String subject;
	 private	String teacherName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public void classOfStudent(String studentName, String className) {
		System.out.println("studentName " + studentName + "className " + className);
	}

	@Override
	public void priceOfStudent(int price) {
		System.out.println("student price " + price);
	}

	@Override
	public void subjectOfStudent(String subject, String teacherName) {
		System.out.println("student subject " + subject + " student teacherName " + teacherName);
	}

}

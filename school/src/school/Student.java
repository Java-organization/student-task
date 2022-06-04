package school;

public class Student implements StudentInterface {
	String studentName;
	String className;
	int price;
	String subject;
	String teacherName;

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

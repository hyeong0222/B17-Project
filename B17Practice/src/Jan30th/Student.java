package Jan30th;

public class Student {
	
	public static String COLLEGE_NAME = "IU";
	
	private String name;
	private int age;
	private int id;
	private int marks;
	
	public Student(){
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String sName, int age ) {
		this("Sang");
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static int getAverage(int a, int b) {
		return (a+b)/2;
	}
	

}

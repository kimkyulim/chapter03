package person;

//Person을 상속받음.
public class Student extends Person {
	public Student() {
		System.out.println("Student()생성자 called");
	}
	
	public Student( String name ) {
		
		//default로 삽입되는 부모생선자 
		//super();이 생략되어있어서 부모생성자가 불리는 거임. 
		super(35); //내가 이렇게 지정하면 내가 지정한게 들어감.
		System.out.println( "Student( String ) called" );
	}

	public void set() {
		//public 필드 접근 
		name = "둘리";
		//protected 필드 접근
		height=165;
		//default 필드 접근 
		age = 23;
		
		//private 필드 접근은 안되니까.. 
		
		
	}
}

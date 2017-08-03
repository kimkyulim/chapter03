package person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Student("둘리");
		
		p.setName("둘리");
	
		//다운캐스팅
		//explicity Casting
		//Student s1 =p;
		Student s1 =(Student)p;
		s1.set();
		
	//이렇게 써도 됨.	((Student)p).set();
		
		//업캐스팅 - 자식에서 부모로 가는것.
		//Implicity Casting
		Person p2 = s1;
		p2.setName("마이콜");
	}

}

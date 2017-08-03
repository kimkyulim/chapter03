package person;

public class Person {
	
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected int height;
    int age;
    private int weight;

    public Person()
    {
    	System.out.println("Person()생성자 called");
    }
    public Person( int height ) {
    	System.out.println( "Person( int ) called" );
    }    
}

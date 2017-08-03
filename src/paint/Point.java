package paint;

//클래스 메서드 
public class Point implements Drawable{
	private int x;
	private int y;
	
	//기본 생성자 
/*	public Paint() {
		
	}
	*/
	//생성자
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	//getter 일기 
	public int getX() {
		return x;
	}
	//setter 쓰기
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//show 메서드 
	public void show() {
		System.out.println(
			"점[x=" + x + 
			",y=" + y + 
			"]을 그렸습니다.");
	}
	
	public void show( boolean visible ) {
		if( visible ) {
			show();
		} else {
			System.out.println(
					"점[x=" + x + 
					",y=" + y + 
					"]을 지웠습니다.");
		}
	}
	@Override
	public void draw() {
		show();
	}
	/*@Override
	public int calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
}

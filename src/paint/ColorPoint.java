package paint;

public class ColorPoint extends Point {
	private String Color;
	
	//생성자 
	public ColorPoint(int x, int y, String color) {
		//super();
		/*setX(x);
		setY(y);*/
		super(x,y);
		this.Color=color;
		
	}
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	//오버라이드 하는법
	//source -> override method클릭 
	@Override
	public void show() {
		// 완전 재구현을 위해 부모꺼를 지운다. 
		//super.show();//부모의 show를 보여준다. 
		System.out.println(
				"점[x=" + getX() + 
				",y=" + getY() + 
				",color=" + Color + "]을 그렸습니다.");		
	}
	
	}


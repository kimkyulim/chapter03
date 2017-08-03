package paint;

public abstract class Shape implements Drawable{
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
/*	public abstract void draw();*/
	public abstract int calcArea();//모든 도형은 넓이를 구할수있으니까, 넓이구하는걸 추상메소드로 올려볼까.
	
}

	
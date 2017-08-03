package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point( 100, 50 );
		point1.show();
		point1.show( false );
		
		draw( new Point( 200, 200 ) );
		draw( new ColorPoint(300, 100, "red" ));
		draw( new ColorPoint(200, 200, "yellow" ) );

		//Shape
		draw( new Triangle() );
		draw( new Rectangle() );
		draw( new Circle(10, 20, 5) );
		
	}
	
//	private static void drawPoint( Point point ) {
//		point.show();
//	}
//	private static void drawShape( Shape shape ) {
//		shape.draw();
//	}

	private static void draw( Drawable drawable ) {
		drawable.draw();
	}
}

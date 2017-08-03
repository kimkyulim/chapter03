package chapter03;

//public final class Goods { //final의 의미는 여기가 끝 
							//클래스 정의는 여기가끝!
							//상속을 해주지마라! 
public class Goods {
	private static int countofGoods; //static변수는 부를때 클래스이름.변수 
	public static double discount_rate=0.3; //이걸 상수로 만들어주고 싶으면 final 붙이면됨.그리고 대문자로 바꿔주고! 
	//public static final double DISCOUNT_RATE=0.3;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	//생성자를 만들겠다.
	//생성자는 함수랑 비슷하게 만들면됨. 
	//생성자는 클래스이름과 똑같이 
	//파라미터 없는것을 기본생성자라고한다. 
	public Goods() {
		Goods.countofGoods++;
		//같은클래스 안에서는 클래스이름 생략가능하다
		// 이렇게 countofGoods++;
		
	}
	
	public static int getCountofGoods() {
		return countofGoods;
	}
	
	//public String final GETNAME() { //메서드는 이게 끝이다.
										//오버라이드 금지 
	public String  getName() {
		return name;
	}

	//return 값이 없고 매개변수가 있는 메서드 
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		/*if( price <0 ) {
			price =0;
		}*/ //만약에 네트워크상이나 문제가 생겨서 값이 잘못드러올때 값을 보호하기 위해서 이렇게 사용하면됨. 
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() { //반환값과 파라미터가 없는 메소드 
						//그냥 입력값을 출력하기만 함 
		System.out.println("Goods 이름 = "+name+"price = "+price+"countStock = "+countStock+"countSold = "+countSold);//private접근자는 내부에서만 접근이 가능하다.
	}
	
	public int calcDiscountPrice(int percenttage) {
		int discountPrice = price * percenttage / 100;
		return discountPrice;
	}

}

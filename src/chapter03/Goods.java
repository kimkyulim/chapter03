package chapter03;

public class Goods {
	private static int countofGoods; //static변수는 부를때 클래스이름.변수 
	
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	
	public String getName() {
		return name;
	}

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

	void showInfo() {
		System.out.println(name);//private접근자는 내부에서만 접근이 가능하다.\
	
	}

}

package chapter03;

import mypackge.Goods2;

public class GoodsApp {

	public static void main(String[] args) {
		System.out.println("Dddd");
			Goods goods = new Goods();//생성자 호출 
		/*	goods.name = "nikon";
			goods.price= 20000;
			goods.countSold= 10;
			goods.countStock=10;*/
			
			goods.setCountSold(100000);
			goods.setName("nickon");
			goods.setPrice(10000);
			goods.setCountStock(10);
			
			
		/*	System.out.println("name : "+ goods.name);
			System.out.println("price : "+goods.price);
			System.out.println("countSold : "+goods.countSold);
			System.out.println("countStock : "+goods.countStock);*/
			
			Goods2 goods2 = new Goods2();
			/*goods2.name="coke";	*/
			/*goods2.price=201532; *///proteced는 내부에서만 사용가능! 
			goods2.countSold=12; //얘는 public 
			goods2.countStock=12;
			
	}
}

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
			
			
			//0802(수)
			//static 변수 테스트
			Goods g = new Goods();
			System.out.println(Goods.getCountofGoods());
			
			g = new Goods();
			System.out.println(Goods.getCountofGoods());
			
			g = new Goods();
			System.out.println(Goods.getCountofGoods());
			
			final int value=10;//final은 값이 이게 끝이야. 이건이제 상수야. 라는 의미인데 밑이 value =20;으로 수를 바꾸려고하면 에러 
			//value =20;
			//그래서 상수는 대분자로 만들어야함.
			//final int VALUE=10;
			
			
			goods.showInfo();
			int discountPrice =  goods.calcDiscountPrice(20);
			
	}
}

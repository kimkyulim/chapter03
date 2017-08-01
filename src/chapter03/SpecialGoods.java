package chapter03;

import mypackge.Goods2;

public class SpecialGoods extends Goods2 {//Goods2를 상속받는 SpecialGoods
	void showInfo() {
		/*name ="nickon";*/
		price =10000;//protected는 자식에서 접근이 가능하다!!! 
	}

}

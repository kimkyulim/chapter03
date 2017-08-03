package chapter03;

public class ArrayUtilTest {
public void main(String args[]) {
	
	int[] a= {10, 20, 30, 40, 50};
	
	double[] d =ArrayUtil.intToDouble(a);
	
	//배열이나 for문은 for each문
	for(double val: d) {
		System.out.println(val);
		
	}
}
}

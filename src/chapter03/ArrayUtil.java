package chapter03;

public class ArrayUtil {
	
	public static double[] intToDouble(int[] source) {
		if(source ==null) {
			return null;
		}
		double[] dest = new double [source.length];
		for(int i=0; i<source.length; i++) {
			dest[i] = source[i];
			}
		return dest;
	}
	
	//public static int[] doubleToInt(double[] source)
}

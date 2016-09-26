package day8;

public class UtitlityFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myRandomNo();
	}
	
	public static void myRandomNo()
	{
		double d=Math.random()*100;
		int a=(int)d;
		System.out.println(a);
	}

}

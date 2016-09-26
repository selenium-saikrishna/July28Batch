package day4;

public class MaximumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a={20,80,90,145,60};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}

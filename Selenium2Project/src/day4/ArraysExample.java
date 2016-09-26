package day4;

public class ArraysExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={34,52,34,51,41,87,90};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("#######");
		int[] b=new int[4];
		b[0]=10;
		b[1]=9;
		b[2]=8;
		b[3]=7;
		/*for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}*/
		for(int i:b)
		{
			System.out.println(i);
		}
		

	}

}

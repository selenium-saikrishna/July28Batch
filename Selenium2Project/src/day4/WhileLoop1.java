package day4;

public class WhileLoop1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		while(i<=4)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

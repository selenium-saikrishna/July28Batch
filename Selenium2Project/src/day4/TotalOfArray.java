package day4;

public class TotalOfArray {

	
	public static void main(String[] args) {
		int[] a={10,45,80,90};
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
		}
		System.out.println(total);

	}

}

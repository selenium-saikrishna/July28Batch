package day3;

public class StringComparisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="Selenium";
		String b="Selenium";
		if(a.equals(b))
		{
			System.out.println("String are identical");
		}
		else
		{
			System.out.println("String are different");
		}
		System.out.println("#################################");
		String c="SELENIUM";
		String d="selenium";
		if(c.equalsIgnoreCase(d))
		{
			System.out.println("String are identical");
		}
		else
		{
			System.out.println("String are different");
		}
		System.out.println("#################################");
		String e="Software Testing";
		String f="Testing";
		if(e.contains(f))
		{
			System.out.println("String is present");
		}
		else
		{
			System.out.println("String is not present");
		}
		

	}

}

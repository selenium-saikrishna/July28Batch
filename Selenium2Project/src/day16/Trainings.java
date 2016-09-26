package day16;

public class Trainings {

	int fee;
	String course;
	public void courseDetails(int fee,String course)
	{
		this.fee=fee;
		this.course=course;
	}
	public static void main(String[] args) {
		Trainings t=new Trainings();
		t.courseDetails(10000,"Selenium" );
		System.out.println(t.fee+"   "+t.course);
		

	}

}

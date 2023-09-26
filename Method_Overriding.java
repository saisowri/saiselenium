package day1.sample;

public class Method_Overriding extends Child_overriding {
	@Override
	public void cardio_treatment1() {
		System.out.println("this come from parents overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_overriding co=new Method_Overriding();
	System.out.println(co.cardio_treatment("monday"));
	co.cardio_treatment1();

	}

}

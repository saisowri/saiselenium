 package day1.sample;

public class Constractor {
	//default and non parameters constructor;
	int admis_no;
	String name;
	float date;
	Constractor(){
		System.out.println("DEFAULT AND NON PARAMETERS CONSTRUCTOR:");
		admis_no=20231;
		name="kumar";
		date=27.09f;
		System.out.println("admis_no:"+admis_no+"\nname:"+name+"\ndate:"+date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constractor();
		//Constractor con=new Constractor();
		

	}

}

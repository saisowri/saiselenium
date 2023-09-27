package day1.sample;

public class Parameter_Constructor {
	//PARAMETERS CONSTRUCTOR:
	int admis_no;
	String name;
	float date;
	
	Parameter_Constructor(int admis_no,String name, float date)
	{
		System.out.println("PARAMETERS CONSTRUCTOR:");
		System.out.println("admis_no:"+admis_no+"\nname:"+name+"\ndate:"+date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parameter_Constructor(20231,"kumar",27.09f);

	}

}

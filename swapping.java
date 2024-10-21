package JavaPrograms;

public class swapping {
	int a=10;
	int b=20;
	int c=0;
	void swp() {
		c=a;
		a=b;
		b=c;
		System.out.println("a is:"+a+"\nb is:"+b+"\nc is:"+c);
		
	}
	void twonum_swp() {
		a=a+b;
		b=a-b;//b=10
		a=a-b;//a=20
		System.out.println("a is:"+a+"\nb is:"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapping swp=new swapping();
		//swp.swp();
		swp.twonum_swp();

	}

}

package friday_task;

public class Firefox {
	public float version() {
		return (float) 100.2;
		
	}
	public String name() {
		return "firefox";
			}
	public boolean visible() {
		return true;
	}
	public int year() {
		return 1998;
	}
	public char logo() {
		return 'm';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firefox ff=new Firefox();
		System.out.println(ff.version());
		System.out.println(ff.name());
		System.out.println(ff.visible());
		System.out.println(ff.year());
		System.out.println(ff.logo());
		

	}

}

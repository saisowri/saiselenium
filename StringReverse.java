package stringReverse_Switch;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Liberty in Reverse order:");
		String name="Liberty";
		char[] array=name.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		System.out.println("\nCardiology FLOOR NAME: ");
		String Dep="Cardiology";
		switch (Dep) {
		case "Orthopedic":System.out.println("Ground Floor");break;
		case "Nephrology":System.out.println("1nd Floor");break;
		case "Cardiology":System.out.println("2nd Floor");break;
		case "Opthalmology":System.out.println("3rd Floor");break;
		}
			

	}

}

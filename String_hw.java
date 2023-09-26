package day1.sample;

public class String_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Liberty";
		char[] array=name.toCharArray();
		for (int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat("_selinium"));
		System.out.println(name.contains("y"));
		
 
	}

}

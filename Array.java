package day1.sample;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] number= {3,4,5,6,7,3,2,1,4,6,4,3,3};
				//System.out.println(number.length);
				int lengthtot=number.length;
				System.out.println(lengthtot);//get total length
				System.out.println(number[lengthtot-1]);//get last value
				System.out.println("--------");
				Arrays.sort(number);
				for (int i=0;i<number.length;i++) {
					System.out.println(number[i]);//ascending values
				}
				System.out.println("++++++++++++++++++");
				for(int i=number.length-1;i>0;i--) {
					System.out.println(number[i]);//decending values
				}
		
		System.out.println("FIND DUPLICATE VALUE:");
		int[] count= {2, 5, 7, 7, 5, 9, 2, 3};
		//int[] count= {3,4,5,6,7,3,2,1,4,6,4,3,3};//more then two integer values is not allowed in array index
		for (int i=0;i<count.length;i++) {
			for(int j=i+1;j<count.length;j++) {
				if(count[i]==count[j]) {
				 System.out.println(count[i]);
				}
			}
		}
		
    }
}

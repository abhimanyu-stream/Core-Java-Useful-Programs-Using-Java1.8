package com.ingenico.interviews;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407};
		
		// 0- 99
		//153
		
		String x = "151";
		System.out.println(checkForArmstrongNumber(x));
		if(x.equals(checkForArmstrongNumber(x))){
			System.out.println(" " + x + "is Armstrong");
		}else {
			System.out.println(" " + x + "is not Armstrong");
		}
		

	}

	private static String checkForArmstrongNumber(String x) {
		
		
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = x.length()-1; i>= 0; i--) {
			builder.append(x.charAt(i));// = x.charAt(i);
			
		}
		return builder.toString();
	}

}

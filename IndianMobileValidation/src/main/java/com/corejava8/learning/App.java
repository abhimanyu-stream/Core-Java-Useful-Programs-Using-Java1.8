package com.corejava8.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println(App.isValid("6201265914"));

	}

	public static boolean isValid(String s) {

		// 1) Begins with optional 0 or +91
		// 2) Then contains 7 or 8 or 9.
		// 3) Then contains 9 digits between 0-9
		// 4) If there phone number do not starts with 0 or +91 then there after there
		// should be 10 digits , starts with 7 or 8 or 9
		// Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");// + sign not accepting
		Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}$");// + sign accepting

		// Pattern class contains matcher() method
		// to find matching between given number
		// and regular expression

		Matcher matcher = p.matcher(s);// Long.toString(l)
		return (matcher.find() && matcher.group().equals(s));
	}
}

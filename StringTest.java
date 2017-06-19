package com.epam.quiz;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringTest {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String str = new String();

		for (int i = 0; i <= 1000; i++) {
			str += i;
		}
		System.out.println(str);

		String firstNumberStr = args[0];
		String lastNumberStr = args[1];

		getNumbersInRange(str, firstNumberStr, lastNumberStr);
	}

	public static void getNumbersInRange(String refStr, String from, String to) {

		int startDigitLen = from.length();
		int endDigitLen = to.length();
		String outputStr = null;
		if (startDigitLen < 2 && endDigitLen < 2) {
			outputStr = refStr.substring(Integer.parseInt(from),
					(Integer.parseInt(to) + endDigitLen));
		} else if (startDigitLen >= 2 && endDigitLen <= 2) {
			int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;
			int endAt = 10 + (Integer.parseInt(to) - 10) * 2;
			outputStr = refStr.substring(beginFrom, (endAt + endDigitLen));

		} else if (startDigitLen == 1 && endDigitLen == 2) {
			// int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;
			int endAt = 10 + (Integer.parseInt(to) - 10) * 2;
			outputStr = refStr.substring(Integer.parseInt(from),
					(endAt + endDigitLen));
		} else if (startDigitLen == 1 && endDigitLen == 3) {
			// int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;

			int endAt = ((10 + (90) * 2) + (Integer.parseInt(to) - (100)) * 3);
			outputStr = refStr.substring(Integer.parseInt(from),
					(endAt + endDigitLen));

		} else if (startDigitLen == 2 && endDigitLen == 3) {
			int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;

			int endAt = ((10 + (90) * 2) + (Integer.parseInt(to) - (100)) * 3);
			outputStr = refStr.substring(beginFrom, (endAt + endDigitLen));
		} else if (startDigitLen == 3 && endDigitLen == 3) {
			int beginFrom = ((10 + (90) * 2) + (Integer.parseInt(from) - (100)) * 3);

			int endAt = ((10 + (90) * 2) + (Integer.parseInt(to) - (100)) * 3);
			outputStr = refStr.substring(beginFrom, (endAt + endDigitLen));
		} else if (startDigitLen == 2 && endDigitLen == 4) {
			int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;

			int endAt = ((10 + (90) * 2) + (900 * 3));
			outputStr = refStr.substring(beginFrom, (endAt + endDigitLen));
		} else if (startDigitLen == 1 && endDigitLen == 4) {
			int beginFrom = 10 + (Integer.parseInt(from) - 10) * 2;

			int endAt = ((10 + (90) * 2) + (900 * 3));
			outputStr = refStr.substring(Integer.parseInt(from),
					(endAt + endDigitLen));
		}
		System.out.println(outputStr);
	}

}

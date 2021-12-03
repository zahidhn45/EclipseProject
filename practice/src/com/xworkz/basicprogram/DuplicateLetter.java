package com.xworkz.basicprogram;

import java.util.Arrays;

public class DuplicateLetter {

	public static void main(String[] args) {
		char[] ch = "zahidhussain".toCharArray();
		int index = 0, i, j;

		for (i = 0; i < ch.length; i++) {
			for (j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					break;
				}
			}
			if (i == j) {
				ch[index++] = ch[i];
			}
		}
		System.out.println(Arrays.copyOf(ch, index));
	}
}

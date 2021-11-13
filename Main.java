package com.gmail.kutepov89.sergey;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		String one = FileOperation.getTextFromFileToString("one.txt");
		String two = FileOperation.getTextFromFileToString("two.txt");

		String[] t1 = one.split(" ");
		String[] t2 = two.split(" ");

		try (PrintWriter a = new PrintWriter("result.txt")) {
			for (int i = 0; i < t1.length; i++) {
				for (int j = 0; j < t2.length; j++) {
					if (t1[i].equals(t2[j])) {
						a.println(t2[j]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

	}

}
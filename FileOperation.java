package com.gmail.kutepov89.sergey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
	
	public static String getTextFromFileToString(String s) {
		try (BufferedReader f = new BufferedReader(new FileReader(s))) {
			String str = "";
			String res = "";
			for (; (str = f.readLine()) != null;)
				res += str + " ";
			return res;
		} catch (IOException e) {
			return "ERROR";
		}
	}
	
}
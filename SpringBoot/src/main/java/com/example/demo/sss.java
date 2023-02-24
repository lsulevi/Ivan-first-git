package com.example.demo;

import java.awt.Button;
import java.util.HashMap;
import java.util.Hashtable;

public class sss{
	private String sThreadName;
	public static void main(String[] args) throws Exception{
		String a = " ";
		String b = "*";
		String str = "";
		int nu = 5;
		int x = 1;
		for(int f = 1 ; f<= 5 ; f++) {
			for(int i = 1 ; i<= nu ; i++) {
				str += a;
			}

			for(int k = 1 ; k<= x ; k++) {
				str += b;
			}
			nu--;
			x ++;
			System.out.println(str);
			str = "";
		}

	}
}


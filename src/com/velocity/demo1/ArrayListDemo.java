package com.velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Shayam");
		list.add("Mohan");
		list.add("Vinod");

		for (String s : list) {
			System.out.println(s);
		}
		list.add("ram");
		list.add("sita");
		System.out.println(list);
	}

}

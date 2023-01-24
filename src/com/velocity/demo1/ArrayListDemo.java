package com.velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Shayam");
		list.add("Mohan");
		list.add("Vinod");
		
		list.stream().forEach(x->System.out.println(x));
		for (String s :list) {
			System.out.println("hello");
			System.out.println("all");
		}
	}

}

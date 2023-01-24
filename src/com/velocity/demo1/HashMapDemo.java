package com.velocity.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(101, 45612378);
		map.put(102, 14568956);
		map.put(103, 85241637);
		
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, Integer> next = itr.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		}
		
		System.out.println("hello i made change : Dev2");
	}

}

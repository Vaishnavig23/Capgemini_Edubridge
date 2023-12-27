package com.vaish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) {
		List<Integer>i=new ArrayList<>();
		i.add(12);
		i.add(122);
		i.add(121);
		i.add(1212);
		System.out.println(i);
		for(int j:i) {
			System.out.println(j);
		}
		Iterator<Integer> m=i.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

}

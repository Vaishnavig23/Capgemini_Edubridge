package com.vaish;

import java.util.Iterator;
import java.util.Vector;

public class IteratorVector {

	public static void main(String[] args) {
		   Vector<String> vct = new Vector<String>();
	        //adding elements to the end
	        vct.add("First");
	        vct.add("Second");
	        vct.add("Third");
	        vct.add("Random");
	        Iterator<String> itr = vct.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }
	}
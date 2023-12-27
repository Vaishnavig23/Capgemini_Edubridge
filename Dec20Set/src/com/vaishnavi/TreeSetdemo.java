package com.vaishnavi;

import java.util.Iterator;
//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//import com.project.Students1;

//import com.project.Students1;

//import com.project.SortStudentId;



public class TreeSetdemo {

	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>( new Sidsort());
		
		Student s1=new Student(11,"Vaish",561.23f);
		Student s2=new Student(61,"Kiran",431.23f);
		Student s3=new Student(12,"Sakshi",461.283f);
		Student s4=new Student(10,"Pranoti",61.243f);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		System.out.println("For Id");
		System.out.println(s);
		
		System.out.println("ID\tName\tFees");
		Iterator<Student> i= s.iterator();
	    while(i.hasNext()){
	    	Student st=i.next();
	    			System.out.println(st.getStudentId()+"\t"+st.getStudentName()+"\t"+st.getFees());
	        
	    }
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("For Fees");
		
		Set<Student> se = new TreeSet<Student>( new Sfee());
		se.add(s1);
		se.add(s2);
		se.add(s3);
		se.add(s4);
		System.out.println(se);
		System.out.println("ID\tName\tFees");
		
		//Using Iterator. It is used for collections
		
	    
	    Iterator<Student> i1= se.iterator();
	    while(i1.hasNext()){
	    	Student set=i1.next();
	    			System.out.println(set.getStudentId()+"\t"+set.getStudentName()+"\t"+set.getFees());
	        
	    }

	   
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("For Names");
		
		Set<Student> name = new TreeSet<Student>( new studname());
		name.add(s1);
		name.add(s2);
		name.add(s3);
		name.add(s4);
		System.out.println(name);
		System.out.println("ID\tName\tFees");
		
		
		 Iterator<Student> i2= name.iterator();
		    while(i2.hasNext()){
		    	Student n=i2.next();
		    		System.out.println(n.getStudentId()+"\t"+n.getStudentName()+"\t"+n.getFees());
		        
		    }

		
	}

}


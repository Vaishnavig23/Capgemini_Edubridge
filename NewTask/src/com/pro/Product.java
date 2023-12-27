package com.pro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.project.SortStudentId;

public class Product {

	public static void main(String[] args) {
		List<Subproduct> s=new ArrayList<>();
		
		Subproduct sc=new Subproduct("Riya",1,20);
		Subproduct sc1=new Subproduct("Boby",12,120);
		Subproduct sc2=new Subproduct("Cat",11,21);
		Subproduct sc3=new Subproduct("Adi",10,320);
		Subproduct sc4=new Subproduct("Bebo",18,230);
		
		s.add(sc);
		s.add(sc1);
		s.add(sc2);
		s.add(sc3);
		s.add(sc4);
		System.out.println(s);
		
		System.out.println("Name\tId\tPrice");
		for(Subproduct p: s) {
			System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.getPrice());
		}
		  System.out.println();
		  System.out.println();
		  System.out.println("After Id Sort");
		Psort sobj= new Psort();
	    Collections.sort(s,sobj);
	    System.out.println("Name\tId\tPrice");
	    for(Subproduct p: s) {
			System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.getPrice());
		}
	   
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("After Price Sort");
	    Pprice obj=new Pprice();
	    Collections.sort(s,obj);
	    
	    System.out.println("Name\tId\tPrice");
	    for(Subproduct p: s) {
			System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.getPrice());
		}
	    System.out.println();
	    System.out.println();
	    
	    
	    System.out.println("After Name Sort");
	    Pname n=new Pname();
	    Collections.sort(s,n);
	  
	    System.out.println("Name\tId\tPrice");
	    for(Subproduct p: s) {
			System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.getPrice());		}
	
	}

}

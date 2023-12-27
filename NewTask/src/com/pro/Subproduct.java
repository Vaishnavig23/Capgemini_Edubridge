package com.pro;

import java.util.Comparator;

public class Subproduct {
	private String name;
	private int id;
	private int price;
	public Subproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subproduct(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Subproduct [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	

}


class Psort implements Comparator<Subproduct>{

	@Override
	public int compare(Subproduct o1, Subproduct o2) {
		if(o1.getId()>o2.getId())
		return 1;
		else if(o1.getId()<o2.getId())
		return -1;
		else
			return 0;
			
	}
	
}

class Pprice implements Comparator<Subproduct>{

	@Override
	public int compare(Subproduct o1, Subproduct o2) {
		
		if(o1.getPrice()>o2.getPrice())
			return 1;
			else if(o1.getPrice()<o2.getPrice())
			return -1;
			else
				return 0;
	}
	
}

class Pname implements Comparator<Subproduct>{

	@Override
	public int compare(Subproduct o1, Subproduct o2) {
		 return o1.getName().compareToIgnoreCase(o2.getName());
		
		 
	}
	
}

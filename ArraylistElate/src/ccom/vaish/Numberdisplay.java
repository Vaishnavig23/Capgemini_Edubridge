package ccom.vaish;
import java.util.ArrayList;
import java.util.Iterator;

public class Numberdisplay {

	public static void main(String[] args) {
		
ArrayList<Integer>agb=new ArrayList<Integer>();
agb.add(12);
agb.add(13);
agb.add(14);
agb.add(15);
System.out.println(agb);

Iterator<Integer> i1=agb.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}

}

}

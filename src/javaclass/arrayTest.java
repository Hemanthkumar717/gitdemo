package javaclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ArrayList a = new ArrayList();		
		ArrayList<String> d = new ArrayList<String>();
	    d.add("selen");
	    d.add("dev");
	    d.add("qwer");
	    
	    ArrayList<Integer> asd= new ArrayList<Integer>();
	    asd.add(22);
	    asd.add(34);
	    asd.add(43);
	    {   
	 	//System.out.println(asd.get(1));
	 	}
//Forloop	    
	    for (int r=0; r<asd.size(); r++)
	    {
	    System.out.println(asd.get(r));
	    }
//forenanced loop
	    for (int h : asd)
	    {
	    System.out.println(h);
	    }
//converting array and arraylist	    
	    
	    int[] time = new int[4]; //array use all way this symbol []
		time[0]= 3;
		time[1]= 1;
		time[2]= 2;
		time[3]=6;
		
		String[] value= {"selenium","qwer","phone","lap"};
	    
	    List<String>  arr = Arrays.asList(value);
	    {
	    System.out.println(arr.contains("qwer"));
	    
		System.out.println(asd.contains(22));
		    
		System.out.println(d.contains("selen"));
	    }
	    

	    
	}

}






package javaclass;

public class java1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//VARIABLES
		
		//int num = 1;            //only numbers
		//String alp = "abcd";   // only letters 
		//char character = 'q';  //we can give both letter and numbers
		//double dec = 4.1;        //double used for decimal points
		//float fin= 11.1f;    //float is one part of decimal we should add "f" at the end of decimal
		//boolean mycard = true;   // boolean  True or false statement 
		
		//System.out.println(num/fin/dec/num);
		
//ARRAY
		//step1	
		
		
		int[] time = new int[4]; //array use all way this symbol []
		time[0]= 3;
		time[1]= 1;
		time[2]= 2;
		time[3]=6;
		
		//System.out.println(value[1]/time[0]);
		
		//setp2
		//int[] value= {1,2,3,4};
		
		//System.out.println(value[0]/time[0]);
		
//for loop
		
		int[] value= {8,9,3,9,3};
		
		for (int b=0; b<value.length; b++)
		{
		
			System.out.println(value[b]);
		}		
				
		String[] let = {"sir","dev","na"};
		
		for (int a=0; a<let.length; a++)
		{
			System.out.println(let[a]);
		}
		
		String[] loo = {"si","de","na"};
		
		for (int a=0; a<loo.length; a++)
		{
			System.out.println(loo[a]);
		}
		
		
//enhanced for loop & declaration
		
		for(int d: value)
		{
			System.out.println(d);
			
		}
		
	
	}

}

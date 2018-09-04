package com.rg;

public class HelloWorld {
	
	String classlevelVariable;

	public HelloWorld(){
		
	}
	
	public void HelloWorld() {}
	
	public static void main(String args[]){
		// variable creation
		// DataType variableName = (assignment operator) VariableValue ;
		int salary = 1000;
		double height = 5.7d;
		char c = 'c';
		
		// Object type
		
		String name1 = "Vineeth";
		String name2 = new String("Vipanchi");
		
		
		HelloWorld objectHW = new HelloWorld(); 
		objectHW.classlevelVariable = "Vipanchi";
		
		String name = getName();
		System.out.print("Hello "+name);
		
		String test= "Vineeth";
	}
	
	private static String getName(){
		return "Vineeth";
	}
	
	int getSalary() {
		return 10;
	}

}

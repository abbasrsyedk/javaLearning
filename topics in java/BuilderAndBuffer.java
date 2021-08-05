package coreJava;

public class BuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string buildeer is more efficceient thatn string
		StringBuilder sb = new StringBuilder();
		sb.append("my name ");
		sb.append("is Abbas");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hi ").append("my name is ").append("Abbas");
		System.out.println(sb2);
		
		//string buffer is just a threadsafe version of string builder
		
		//--------------FORMATTING------------------------
		System.out.print("Here is some text.\t That was a tab.\n That is a new Line.");
		System.out.println("more text.");
		
		System.out.printf("My age is %d \n",2); 
		System.out.printf("Total value: %.2f\n",5.68965); //to print certain number of deciaml values
		System.out.printf("Total value: %-6.1f\n",234.5235235);
	}

}

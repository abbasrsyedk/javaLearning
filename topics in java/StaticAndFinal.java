package coreJava;

class Thing{
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	
	public static int count =0;
	public Thing() {
		count++;
	}
}

public class StaticAndFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thing.description = "I am thingking";
		System.out.println(Thing.description);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Abbas";
		thing2.name = "Syed";
		
		System.out.println(Thing.count);
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		

	}

}

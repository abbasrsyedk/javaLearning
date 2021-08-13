package polymorphism;

public class Tree extends Plant {

	@Override
	public void grow() {
		super.grow();
	}
	
	public void shed() {
		System.out.println("leavevs shedding");
	}
	
}

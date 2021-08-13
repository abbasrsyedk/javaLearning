package polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = plant1;
		
		Plant plant3 = tree;
		
		Tree plant4 = tree;
		tree.shed();
		plant2.grow();
		plant3.grow();
		
		plant4.shed();
		
//		plant2.shed();
//		plant3.shed();

	}

}

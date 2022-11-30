package cz.feec.vutbr.cviko4.Strom;

public class Run {
	public static void main(String[] args) {
		Tree tree = new Tree();
		for (int i = 0; i < 10; i++) {
			tree.insert(i);
		}
		tree.traverse();
		System.out.println("according to this max depth is:" + tree.maxDepth(tree.Root));
		
		
	}
}

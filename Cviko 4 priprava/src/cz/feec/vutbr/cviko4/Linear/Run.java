package cz.feec.vutbr.cviko4.Linear;

public class Run {

	public static void main(String[] args) {
	/*	LinearList linList = new LinearList();
		for (int i = 6; i > 0; i--) {
			linList.insert(i);
		}
		linList.exists(4);
		linList.maxValue();
		linList.printList();
		linList.deleteLast();
		//linList.deleteFirst();
		linList.printList();
		*/
		LinearListCyclic CyclicList = new LinearListCyclic();
		for (int i = 0; i < 6; i++) {
			CyclicList.addNodde(i);
		}
		//CyclicList.traveseList();
		CyclicList.printMiddle();
	}
	

}

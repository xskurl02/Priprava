package cz.feec.vutbr.cviko4.Strom;

public class Tree {
	Node Root;

	void insert(int inserted_data) {
		Node new_node = new Node();
		new_node.setData(inserted_data);
		Node tmp = Root;
		if (Root == null) {
			Root = new_node;
			return;
		}
		for (;;) {
			if (tmp.getData() == inserted_data) {
				return;
			} else if (tmp.getData() < inserted_data) {
				if (tmp.getRight() == null) {
					tmp.setRight(new_node);
					return;
				} else {
					tmp = tmp.getRight();
				}
			} else {
				if (tmp.getLeft() == null) {
					tmp.setLeft(new_node);
					return;
				} else {
					tmp = tmp.getLeft();
				}
			}
		}
	
		
		
	}
	
    int maxDepth(Node root)
    {
        if (root == null) {
            return 0;
        }
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(root.getLeft());
            int rDepth = maxDepth(root.getRight());
  
            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            }
            else 
            {
                return (rDepth + 1);
            }
        }
    }
	
	public void traverse() {
		traverse(Root);
	}
	private int traverse(Node root) {
		if (root != null) {
			traverse(root.getLeft());
			System.out.println(root.getData());
			traverse(root.getRight());
		}
		return 0;
	}
}

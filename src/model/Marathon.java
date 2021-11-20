package model;

public class Marathon {

	private Programmer root;
	
	public Marathon() {
		
	}
	
	public void addProgrammer(String n) {
		Programmer p = new Programmer(n);
		
		if(root == null) {
			root = p;
		} else {
			addProgrammer(p, root);
		}
	}
	
	private void addProgrammer(Programmer p, Programmer c) {
		boolean sentinel = false;
		
		while(sentinel != true) {
			if(p.compareTo(c) < 0) {
				if(c.getLeft() == null) {
					c.setLeft(p);
					sentinel = true;
				} else {
					c = c.getLeft();
				}
			} else {
				if(c.getRight() == null) {
					c.setRight(p);
					sentinel = true;
				} else {
					c = c.getRight();
				}
			}
		}
	}
	
	public int getHeight() {
		if(root == null) {
			return 0;
		} else {
			return getHeight(root);
		}
	}
	
	//Return the Binary Tree Height
	private int getHeight(Programmer c) {	
		if(c.getLeft() != null || c.getRight() != null) {
			if(c.getLeft() != null && c.getRight() != null) {
				int left = getHeight(c.getLeft()) + 1; //This 1 is for the root
				int right = getHeight(c.getRight()) + 1; //This 1 is for the root
				
				return returnMax(left, right);
			} else if(c.getLeft() != null) {
				return getHeight(c.getLeft()) + 1;
			} else {
				return getHeight(c.getRight()) + 1;
			}
		} else {
			return 1;
		}
	}
	
	
	private int returnMax(int numb1, int numb2) {
		if(numb1 > numb2) {
			return numb1;
		} else {
			return numb2;
		}
	}
	
	public String print() {
		if(root == null) {
			return "There are not registered programmers";
		} else {
			return print(root);
		}
	}
	
	private String print(Programmer c) {
		String s = "";
		
		if(c != null) {
			if(c.getLeft() != null) {
				s += print(c.getLeft());
			}
			
			s += c.getName() + "\n";
			
			if(c.getRight() != null){
				s += print(c.getRight());
			}
		}

		return s;
	}
	
}

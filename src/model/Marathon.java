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
			boolean sentinel = false;
			Programmer c = root;
			
			while(sentinel == true) {
				
				if(c.compareTo(p) < 0) {
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
	}

	
	public String print() {
		return "Holi";
	}
	
}

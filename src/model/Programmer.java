package model;

public class Programmer {

	private String name;
	
	//BST
	private Programmer left;
	private Programmer right;
	
	public Programmer(String n) {
		name = n;
	}
	
	//Return negative if name is less than p.getName()
	//Return positive if name is greater than p.getName()
	//Return zero if name is equal than p.getName()
	public int compareTo(Programmer p) {
		return name.compareTo(p.getName());
	}

	//Getters & Setters
	public Programmer getLeft() {
		return left;
	}

	public void setLeft(Programmer left) {
		this.left = left;
	}

	public Programmer getRight() {
		return right;
	}

	public void setRight(Programmer right) {
		this.right = right;
	}
	
	public String getName() {
		return name;
	}
	
}

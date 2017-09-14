package cmd.child;
import cmd.Parent;

public class Child extends Parent{
	Child(){
		super();
		System.out.println("child");
	}
	public static void main(String args[]){
		System.out.println("child in jre");
		Child ch = new Child();
	}
}
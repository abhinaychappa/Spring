package springOne;

//import java.beans.ConstructorProperties;

public class Alien {
	private int age;
	private Computer com;
	Alien(){
		System.out.println("Object created");	
		}
	
	//@ConstructorProperties({"age","lap"})
	public Alien(int age,Computer com) {
		this.age=age;
		this.com=com;
	}
	//Write getter and setter methods for
	
	public Computer getCom() {
		return com;
	}
	public void setCom( Computer com) {
		this.com=com;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void code() {
		System.out.println("Coding");
		com.compile();
	}
	

}


public class Animal {

	int age;
	String gender;
	int weightInlbs;
	

	public Animal(int age, String gender, int weightInlbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInlbs = weightInlbs;
	}
	
	public void eat() {
		System.out.println("eating..");
	}
	
	public void sleep() {
		System.out.println("Sleeping..");
	}
	
	
}

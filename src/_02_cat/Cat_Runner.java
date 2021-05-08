package _02_cat;

public class Cat_Runner {

	
	public static void main(String[] args) {
		Cat Cat = new Cat("Kitty");
		Cat.meow();
		Cat.printName();
		
			
		for (int i = 1; i <= 9; i++) {
			Cat.kill();
		}
	}
	
}

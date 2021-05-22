package _06_duck;

public class Duck {
	String favoriteFood = "";
	int numberOfFriends = 0;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	       
	}
	public void quack() {
		System.out.println("quack");
	}
	public void waddle() {
		System.out.println("waddle");
	}
}


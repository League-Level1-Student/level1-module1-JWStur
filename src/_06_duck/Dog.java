package _06_duck;

public class Dog {

	String favoriteToy = "";
	String bestFriend = "";

	Dog(String favoriteToy, String bestFriend) {
		this.favoriteToy = favoriteToy;
		this.bestFriend = bestFriend;
	}
	public void play() {
		System.out.println("play");
	}
	public void eat() {
		System.out.println("eat");
	}

}

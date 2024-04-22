package jtm.activity03;

import java.util.Random;

public class RandomPerson {
	// TODO Create _private_ structure of random person to store values:
	// name as String,
	// age as int,
	// weight as float,
	// isFemale as boolean;
	// smile as char

	private String name;
	private int age;
	private float weight;
	private boolean isFemale;
	private char smile;
 
	public void setName(String name) {
		this.name = name1;

	}

	public void setSmile(char smile) {
		this.smile = smile;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setFemale(boolean female) {
		isFemale = female;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public char getSmile() {
		return smile;
	}

//	public static void main(String[] args) {
//		RandomPerson person;
//		person = new RandomPerson();
//		person.setName("Anna");
//		person.setAge(1);
//		person.setFemale(true);
//	}
// TODO Select menu "Source — Generate Getters and Setters..." then select
	// all properties and generate _public_ getters and setters for all of them
}

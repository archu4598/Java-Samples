package com.exercise.inheritance;

public class Games {
	
	public void Athlete() {
		System.out.println("I run");
	}
	public void Relay() {
		System.out.println("I run s a team");
		Athlete();
	}
	public void relayRace() {
		
	}

	public static void main(String[] args) {
		Games std = new relay();
		std.relayRace();
		std.Athlete();
		//std.Relay();
	}

}

class relay extends Games{
	
	public void relayRace() {
		System.out.println("We run as a team");
	}
	public void Athlete() {
		System.out.println("I run subclass");
		super.Athlete();
	}
	
}

// does inheritance doesnt allow method to inherit, how to call the method of childclass in parent class


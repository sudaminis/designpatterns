package com.designpatterns.creational.prototype;

public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override
	public String toString() {
		return "Swordsman "+state+" @ "+getPosition();
	}
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		Swordsman unit = (Swordsman) super.clone();
		unit.initialize();
		unit.reset();
		return unit;
	}
	@Override
	protected void reset() {
		state = "idle";
	}
}

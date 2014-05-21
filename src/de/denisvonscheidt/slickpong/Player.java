package de.denisvonscheidt.slickpong;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 * Represents the Player(Person)
 * @author D059417
 *
 */
final class Player {
	private Rectangle player;
	private int points;
	private String name;
	
	/**
	 * Constructor to generate a player represented as a rectangle on the screen.
	 * @param x 
	 * @param y
	 * @param width
	 * @param height
	 * @param name the name of the player
	 */
	Player(int x, int y, int width, int height, String name) {
		player = new Rectangle(x, y, width, height);
		this.points = points;
		this.name = name;
	}
	
	boolean intersects(Shape shape) {
		return this.player.intersects(shape);
	}
	
	/**
	 * returns the gemometric figure representing the player.
	 * @return the rectangle of the player
	 */
	Rectangle getShape() {
		return this.player;
	}
	
	int getPoints() {
		return this.points;
	}
	
	String getName() {
		return this.name;
	}
	
	void increasePoints() {
		this.points++;
	}
	
}

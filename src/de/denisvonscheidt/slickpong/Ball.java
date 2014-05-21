package de.denisvonscheidt.slickpong;

import java.util.Random;

import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;

/**
 * represents the ball
 * @author D059417
 *
 */
final class Ball {

	private Circle ball;
	private float speed;
	private float angle;
	
	/**
	 * constructor to create a new ball with a random direction.
	 * @param x
	 * @param y
	 */
	Ball(int x, int y) {
		Random r = new Random();
		this.ball = new Circle(x, y, 5); //TODO: Extract to constant
		this.speed = 0;
		if (r.nextBoolean()) {
			this.angle = r.nextInt(80) + 40; //40°-120°
		} else {
			this.angle = r.nextInt(80) + 230; //230°-310°
		}
	}
	
	/**
	 * returns the ball as a geometric figure
	 * @return
	 */
	Shape getShape() {
		return ball;
	}
	
	float getSpeed() {
		return this.speed;
	}
	
	void setSpeed(float speed) {
		this.speed = speed;
	}
	
	float getAngle() {
		return this.angle;
	}
	
	void setAngle(float angle) {
		this.angle = angle;
	}
	
}

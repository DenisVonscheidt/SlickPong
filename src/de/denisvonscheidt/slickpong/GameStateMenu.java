package de.denisvonscheidt.slickpong;

import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

final class GameStateMenu extends BasicGameState {
	
	public static final int ID = 1;
	
	private static final int MENU1Y = 100;
	private static final int MENU2Y = 120;
	private static final int MENU3Y = 140;
	
	private static final float BALL_SPEED = 1.5f;
	
	private Ball ball;
	
	
	private int selectorPosY = MENU1Y;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		ball = new Ball(SlickPong.WIDTH / 2, SlickPong.HEIGHT / 2);
		Random r = new Random();
		ball.setAngle(r.nextInt(360));
//		ball.setAngle(200f);
		ball.setSpeed(BALL_SPEED);

	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics g)
			throws SlickException {
		
		g.setColor(Color.white);
		g.fill(ball.getShape());
		
		g.drawString("SlickPong", 150, 10);
		
		g.drawString("Select the game mode:", 150, 70);
		g.fillOval(135, selectorPosY + 5, 10, 10);
		
		g.drawString("Player vs. Player (Single Computer)", 150, MENU1Y);
		g.drawString("Player vs. Player (LAN)", 150, MENU2Y);
		g.drawString("Player vs. Computer", 150, MENU3Y);

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
		if (ball.getShape().getY() + 10 >= SlickPong.HEIGHT || ball.getShape().getY() <= 0) { //TODO extract radius constant
			ball.setAngle(180 - (ball.getAngle() % 360));			
		} 
		
		if (ball.getShape().getX() + 10 >= SlickPong.WIDTH || ball.getShape().getX() <= 0) { //TODO extract radius constant
			ball.setAngle(180 + (180-(ball.getAngle() % 360)));			
		} 
		
		float hip = 0.3f * delta + ball.getSpeed();
		ball.getShape().setX((float) (ball.getShape().getX() + hip * Math.sin(Math.toRadians(ball.getAngle()))));
		ball.getShape().setY((float) (ball.getShape().getY() - hip * Math.cos(Math.toRadians(ball.getAngle())))); 
	}
	
	

	@Override
	public void keyReleased(int key, char c) {
		switch (key) {
		case Input.KEY_DOWN:
			switch(selectorPosY) {
			case MENU1Y:
				selectorPosY = MENU2Y;
				break;
			case MENU2Y:
				selectorPosY = MENU3Y;
				break;
			}
			break;
		case Input.KEY_UP:
			switch(selectorPosY) {
			case MENU2Y:
				selectorPosY = MENU1Y;
				break;
			case MENU3Y:
				selectorPosY = MENU2Y;
				break;
			}
			
			break;
		case Input.KEY_ENTER:
			switch(selectorPosY) {
			case MENU1Y:
				//TODO
				break;
			case MENU2Y:
				//TODO
				break;
			case MENU3Y:
				//TODO
				break;
			}
			break;
		}
	}

	@Override
	public int getID() {
		return ID;
	}

}

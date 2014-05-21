package de.denisvonscheidt.slickpong;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

final class GameStateMenu extends BasicGameState {
	
	public static final int ID = 1;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics g)
			throws SlickException {
		
		g.setColor(Color.white);
		g.drawString("SlickPong", 150, 10);
		
		g.drawString("Select the game mode:", 150, 70);
		
		g.drawString("Player vs. Player (Single Computer)", 150, 100);
		g.drawString("Player vs. Player (LAN)", 150, 120);
		g.drawString("Player vs. Computer", 150, 140);

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub

	}
	
	

	@Override
	public void keyReleased(int key, char c) {
		switch (key) {
		case Input.KEY_DOWN:
			//TODO
			break;
		case Input.KEY_UP:
			
			break;
		case Input.KEY_ENTER:
			
			break;
		}
	}

	@Override
	public int getID() {
		return ID;
	}

}

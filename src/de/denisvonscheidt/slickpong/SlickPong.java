package de.denisvonscheidt.slickpong;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public final class SlickPong extends StateBasedGame{

	public SlickPong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		addState(new GameStateMenu());
		
	}
	
	public static void main(String[] args) throws SlickException {
		//TODO
		AppGameContainer app = new AppGameContainer(new SlickPong("SlickPong"));
		app.setDisplayMode(800, 600, false);
		app.setAlwaysRender(true);
		app.setTargetFrameRate(60);
		
		app.start();
	}

}

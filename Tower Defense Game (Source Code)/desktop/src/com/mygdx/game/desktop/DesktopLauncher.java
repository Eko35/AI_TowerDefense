package com.mygdx.game.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PlayGame;
import com.mygdx.game.TowerGame;
import com.mygdx.game.TowerMenu;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config=new LwjglApplicationConfiguration();
		
		
		config.width=1600;
		config.height=1200;
		config.title="Tower Defense";
		TowerGame tg=new TowerGame();
		LwjglApplication launcher=new LwjglApplication(tg);

		
		
	}
}



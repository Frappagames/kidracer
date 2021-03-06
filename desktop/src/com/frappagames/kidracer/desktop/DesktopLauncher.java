package com.frappagames.kidracer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.frappagames.kidracer.KidRacer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Kid racer";
		config.width = KidRacer.WIDTH / 2;
		config.height = KidRacer.HEIGHT / 2;
		new LwjglApplication(new KidRacer(), config);
	}
}

package com.frappagames.kidracer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frappagames.kidracer.Screens.SplashScreen;
import com.frappagames.kidracer.Tools.Assets;
import com.frappagames.kidracer.Tools.Settings;

public class KidRacer extends Game {
	public SpriteBatch batch;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 1280;
	
	@Override
	public void create () {
		this.batch = new SpriteBatch();

		Assets.load();
		Settings.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.dispose();
	}
}

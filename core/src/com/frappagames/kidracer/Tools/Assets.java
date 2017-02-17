package com.frappagames.kidracer.Tools;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

/**
 * Assets management class
 *
 * Created by Jérémy MOREAU on 19/08/15.
 */
public class Assets {
    public static Sound clickSound;
    public static Music music;
    private static TextureAtlas carsAtlas;

    public static Label.LabelStyle fontScore;

    public static void load() {
        //Fonts
//        BitmapFont souses20Font = new BitmapFont(Gdx.files.internal("fontScore.fnt"), false);
//        fontScore = new Label.LabelStyle(souses20Font, Color.WHITE);

        // Load Textures
        carsAtlas = new TextureAtlas(Gdx.files.internal("kidracing_cars.pack"));


        // Load Music and sounds
//        music = Gdx.audio.newMusic(Gdx.files.internal("music.ogg"));
//        music.setLooping(true);
//        music.setVolume(0.5f);
//
//        clickSound = Gdx.audio.newSound(Gdx.files.internal("sound-click.mp3"));

    }

    public static void playSound(Sound sound) {
        if (Settings.soundEnabled) sound.play(1);
    }

    public static void dispose() {
        carsAtlas.dispose();
//        clickSound.dispose();
//        music.dispose();
    }
}

package com.frappagames.kidracer.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.frappagames.kidracer.KidRacer;
import com.frappagames.kidracer.Tools.Assets;
import com.frappagames.kidracer.Tools.Settings;
import com.frappagames.kidracer.Tools.abstractGameScreen;

/**
 * Main menu class for the game
 *
 * Created by Jérémy MOREAU on 14/08/15.
 */
class MenuScreen extends abstractGameScreen {
    MenuScreen(final KidRacer gameApp) {
        super(gameApp);

//        Image title  = new Image(Assets.title);
//        ImageButton btnPlay  = new ImageButton(Assets.btnPlay, Assets.btnPlayOver);
//        ImageButton btnMusic = new ImageButton(Assets.btnMusicOn, Assets.btnMusicOff, Assets.btnMusicOff);
//        ImageButton btnExit  = new ImageButton(Assets.btnExit, Assets.btnExitOver);

//        btnMusic.pad(0, 30, 30, 0);
//        if (!Settings.soundEnabled) btnMusic.setChecked(true);
//
//        btnExit.pad(0, 0, 30, 30);
//
//
//        HorizontalGroup hg = new HorizontalGroup();
//        hg.addActor(btnMusic);
//
//        table.add(title).top().center().padTop(75).colspan(2).row();
//        table.add(btnPlay).colspan(2).expand().padBottom(73).row();
//        table.add(btnMusic).bottom().left();
//        table.add(btnExit).bottom().right();
//
//        btnPlay.addListener(new ChangeListener() {
//            public void changed(ChangeEvent event, Actor actor) {
//                Assets.playSound(Assets.clickSound);
//                game.setScreen(new GameScreen(gameApp));
//            }
//        });
//
//        btnMusic.addListener(new ChangeListener() {
//            public void changed(ChangeEvent event, Actor actor) {
//                Settings.toggleSound();
//                Assets.playSound(Assets.clickSound);
//            }
//        });
//
//        btnExit.addListener(new ChangeListener() {
//            public void changed(ChangeEvent event, Actor actor) {
//                Assets.playSound(Assets.clickSound);
//                Gdx.app.exit();
//            }
//        });
    }
}

package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextoPantalla {

    private static BitmapFont bitmapFont = new BitmapFont();
    private static SpriteBatch spriteBatch;

    public static void SetSpriteBatch(SpriteBatch batch){
        spriteBatch = batch;
    }

    public static void draw (java.lang.CharSequence msg){
        bitmapFont.draw(spriteBatch, msg, 10, 20);
    }
}

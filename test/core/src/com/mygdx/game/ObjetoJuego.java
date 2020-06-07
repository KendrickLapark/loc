package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjetoJuego {

    public float x = 0;
    public float y = 0;

    private Texture textura;
    private SpriteBatch spriteBatch;

    public ObjetoJuego(String ruta, SpriteBatch batch, float posX, float posY){

        textura = new Texture(ruta);
        spriteBatch = batch;

        x = posX;
        y = posY;

    }

    public void updatePosition(){

        int velocidad = 5;

        x += GameInput.vector2.x * velocidad;
        y += GameInput.vector2.y * velocidad;

    }

    public void draw(){
        spriteBatch.draw(textura,x,y);

    }
}

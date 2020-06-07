package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;

public class GameInput {

    public static Vector2 vector2 = new Vector2();

    public static void update(){

        vector2.x = 0;

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            vector2.x -= 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            vector2.x += 1;
        }

        vector2.y = 0;

        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            vector2.y -= 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            vector2.y += 1;
        }
    }
}

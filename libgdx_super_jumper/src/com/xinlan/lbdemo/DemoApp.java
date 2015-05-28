package com.xinlan.lbdemo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class DemoApp implements ApplicationListener {

	@Override
	public void create() {

	}

	@Override
	public void render() {
		float delta = Math.min(0.06f, Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glDisable(GL20.GL_BLEND);
		
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}// end class

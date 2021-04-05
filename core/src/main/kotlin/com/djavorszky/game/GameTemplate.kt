package com.djavorszky.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

/**
 * TODO update main entrypoint
 * TODO update author - it's you :)
 * @author Daniel Javorszky
 */
class GameTemplate : ApplicationAdapter() {
  private lateinit var batch: SpriteBatch
  private lateinit var img: Texture
  private val backgroundColor = Color(.24f, .444f, .67f, 1f)

  override fun create() {
    batch = SpriteBatch()
    img = Texture("badlogic.jpg")
  }

  override fun render() {
    ScreenUtils.clear(backgroundColor)

    batch.let {
      it.begin()
      it.draw(img, 0f, 0f)
      it.end()
    }
  }

  override fun dispose() {
    batch.dispose()
    img.dispose()
  }
}
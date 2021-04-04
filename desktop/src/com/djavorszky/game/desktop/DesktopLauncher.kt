package com.djavorszky.game.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.djavorszky.game.GameTemplate

fun main(arg: Array<String>) {
  val config = LwjglApplicationConfiguration()

  config.let {
    it.title = "Sample Game Template" // TODO update
    it.width = 1280
    it.height = 720
  }
 
  LwjglApplication(GameTemplate(), config)
}

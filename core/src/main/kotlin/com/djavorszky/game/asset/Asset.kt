package com.djavorszky.game.asset

/**
 * Any asset you added should be added as an enum with the path parameter as the relative location of the file
 * within the `assets` folder. [EnsureAssetTest] tests that all the assets you added here are present as files
 * within the `assets` folder.
 *
 * This provides unit-test level guarantee that all referenced assets are present and you won't run into any runtime
 * issues when trying to read a file that has since been moved / deleted.
 *
 * TODO update author - it's you :)
 * @author Daniel Javorszky
 */
enum class Asset(val path: String) {
  BADLOGIC_LOGO("badlogic.jpg"),

  // TODO List your assets here.
}

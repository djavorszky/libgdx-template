package com.djavorszky.game.asset

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import java.nio.file.Paths

internal class EnsureAssetTest {

  /**
   * We're expecting that all assets are in the `assets` folder.
   */
  private val assetFolder = "assets"

  @ParameterizedTest
  @EnumSource(Asset::class)
  fun `asset is present`(asset: Asset) {
    val assetLocation = Paths.get(assetFolder, asset.path).toFile()

    assertThat(assetLocation).exists().isFile.canRead()
  }
}
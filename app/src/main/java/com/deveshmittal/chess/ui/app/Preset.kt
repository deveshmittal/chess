package com.deveshmittal.chess.ui.app

import androidx.compose.runtime.Composable
import com.deveshmittal.chess.model.game.preset.Preset
import com.deveshmittal.chess.model.game.state.GamePlayState

@Composable
fun Preset(preset: Preset) {
    Game(
        state = GamePlayState(),
        preset = preset
    )
}

package com.deveshmittal.chess.model.game.preset

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.deveshmittal.chess.model.board.Position
import com.deveshmittal.chess.model.game.controller.GameController
import com.deveshmittal.chess.ui.base.ChessTheme
import com.deveshmittal.chess.ui.app.Preset

object EnPassantPreset : Preset {

    override fun apply(gameController: GameController) {
        gameController.apply {
            applyMove(Position.e2, Position.e4)
            applyMove(Position.b8, Position.c6)
            applyMove(Position.e4, Position.e5)
            applyMove(Position.d7, Position.d5)
            onClick(Position.e5)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EnPassantPresetPreview() {
    ChessTheme {
        Preset(EnPassantPreset)
    }
}


package com.deveshmittal.chess.model.game.preset

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.deveshmittal.chess.model.board.Board
import com.deveshmittal.chess.model.board.Position.*
import com.deveshmittal.chess.model.game.controller.GameController
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.piece.King
import com.deveshmittal.chess.model.piece.Queen
import com.deveshmittal.chess.model.piece.Rook
import com.deveshmittal.chess.model.piece.Set
import com.deveshmittal.chess.ui.base.ChessTheme
import com.deveshmittal.chess.ui.app.Preset

object ThreefoldRepetitionPreset : Preset {

    override fun apply(gameController: GameController) {
        gameController.apply {
            val board = Board(
                pieces = mapOf(
                    a7 to King(Set.BLACK),
                    e8 to Rook(Set.WHITE),
                    d5 to Queen(Set.WHITE),
                    g2 to King(Set.WHITE),
                )
            )
            reset(
                GameSnapshotState(
                    board = board,
                    toMove = Set.WHITE
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThreefoldRepetitionPresetPreview() {
    ChessTheme {
        Preset(ThreefoldRepetitionPreset)
    }
}


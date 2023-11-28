package com.deveshmittal.chess.model.game.preset

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.deveshmittal.chess.model.board.Board
import com.deveshmittal.chess.model.board.Position.*
import com.deveshmittal.chess.model.game.controller.GameController
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.piece.Bishop
import com.deveshmittal.chess.model.piece.King
import com.deveshmittal.chess.model.piece.Rook
import com.deveshmittal.chess.model.piece.Set.BLACK
import com.deveshmittal.chess.model.piece.Set.WHITE
import com.deveshmittal.chess.ui.base.ChessTheme
import com.deveshmittal.chess.ui.app.Preset

object InsufficientMaterialPreset2 : Preset {

    override fun apply(gameController: GameController) {
        gameController.apply {
            val board = Board(
                pieces = mapOf(
                    a7 to King(BLACK),
                    g8 to Rook(BLACK),
                    g2 to King(WHITE),
                    d5 to Bishop(WHITE),
                    c2 to Bishop(BLACK),
                )
            )
            reset(
                GameSnapshotState(
                    board = board,
                    toMove = WHITE
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InsufficientMaterialPreset2Preview() {
    ChessTheme {
        Preset(InsufficientMaterialPreset2)
    }
}


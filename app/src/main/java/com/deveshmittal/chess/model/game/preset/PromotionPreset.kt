package com.deveshmittal.chess.model.game.preset

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.deveshmittal.chess.model.board.Board
import com.deveshmittal.chess.model.board.Position.*
import com.deveshmittal.chess.model.game.controller.GameController
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.piece.King
import com.deveshmittal.chess.model.piece.Knight
import com.deveshmittal.chess.model.piece.Pawn
import com.deveshmittal.chess.model.piece.Set.BLACK
import com.deveshmittal.chess.model.piece.Set.WHITE
import com.deveshmittal.chess.ui.base.ChessTheme
import com.deveshmittal.chess.ui.app.Preset

object PromotionPreset : Preset {

    override fun apply(gameController: GameController) {
        gameController.apply {
            val board = Board(
                pieces = mapOf(
                    a7 to King(BLACK),
                    f8 to Knight(BLACK),
                    g2 to King(WHITE),
                    g7 to Pawn(WHITE),
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
fun PromotionPresetPreview() {
    ChessTheme {
        Preset(PromotionPreset)
    }
}


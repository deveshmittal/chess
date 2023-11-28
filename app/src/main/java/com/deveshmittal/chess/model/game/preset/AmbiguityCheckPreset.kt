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
import com.deveshmittal.chess.model.piece.Queen
import com.deveshmittal.chess.model.piece.Rook
import com.deveshmittal.chess.model.piece.Set.BLACK
import com.deveshmittal.chess.model.piece.Set.WHITE
import com.deveshmittal.chess.ui.base.ChessTheme
import com.deveshmittal.chess.ui.app.Preset

object AmbiguityCheckPreset : Preset {

    override fun apply(gameController: GameController) {
        gameController.apply {
            val board = Board(
                pieces = mapOf(
                    e2 to King(BLACK),
                    c3 to Pawn(BLACK),
                    h1 to King(WHITE),
                    e4 to Knight(WHITE),
                    a4 to Knight(WHITE),
                    a2 to Knight(WHITE),
                    b1 to Knight(WHITE),
                    d1 to Knight(WHITE),
                    b7 to Rook(WHITE),
                    c8 to Rook(WHITE),
                    d7 to Rook(WHITE),
                    g8 to Queen(WHITE),
                    h8 to Queen(WHITE),
                    h7 to Queen(WHITE),
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
fun AmbiguityCheckPresetPreview() {
    ChessTheme {
        Preset(AmbiguityCheckPreset)
    }
}


package com.deveshmittal.chess.model.piece

import com.deveshmittal.chess.app.R
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.move.BoardMove
import com.deveshmittal.chess.model.piece.Set.BLACK
import com.deveshmittal.chess.model.piece.Set.WHITE
import kotlinx.parcelize.Parcelize

@Parcelize
class Knight(override val set: Set) : Piece {

    override val value: Int = 3

    override val asset: Int =
        when (set) {
            WHITE -> R.drawable.knight_light
            BLACK -> R.drawable.knight_dark
        }

    override val symbol: String = when (set) {
        WHITE -> "♘"
        BLACK -> "♞"
    }

    override val textSymbol: String = "N"

    override fun pseudoLegalMoves(gameSnapshotState: GameSnapshotState, checkCheck: Boolean): List<BoardMove> =
        targets
            .map { singleCaptureMove(gameSnapshotState, it.first, it.second) }
            .filterNotNull()

    companion object {
        val targets = listOf(
            -2 to 1,
            -2 to -1,
            2 to 1,
            2 to -1,
            1 to 2,
            1 to -2,
            -1 to 2,
            -1 to -2
        )
    }
}

package com.deveshmittal.chess.model.piece

import android.os.Parcelable
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.move.BoardMove

interface Piece : Parcelable {

    val set: Set

    val asset: Int?

    val symbol: String

    val textSymbol: String

    val value: Int

    /**
     * List of moves that are legally possible for the piece without applying pin / check constraints
     */
    fun pseudoLegalMoves(gameSnapshotState: GameSnapshotState, checkCheck: Boolean): List<BoardMove> = emptyList()
}

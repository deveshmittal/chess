package com.deveshmittal.chess.model.game.state

import android.os.Parcelable
import com.deveshmittal.chess.model.board.Board
import com.deveshmittal.chess.model.piece.Set
import kotlinx.parcelize.Parcelize

@Parcelize
data class RepetitionRelevantState(
    val board: Board,
    val toMove: Set,
    val castlingInfo: CastlingInfo,
) : Parcelable

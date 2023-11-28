package com.deveshmittal.chess.model.game.state

import android.os.Parcelable
import com.deveshmittal.chess.model.board.Position
import com.deveshmittal.chess.model.piece.Piece
import kotlinx.parcelize.Parcelize

sealed class PromotionState : Parcelable {
    @Parcelize
    object None : PromotionState()

    @Parcelize
    data class Await(val position: Position) : PromotionState()

    @Parcelize
    data class ContinueWith(val piece: Piece) : PromotionState()
}

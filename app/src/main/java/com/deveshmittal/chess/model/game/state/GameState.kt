package com.deveshmittal.chess.model.game.state

import android.os.Parcelable
import com.deveshmittal.chess.model.game.Resolution
import com.deveshmittal.chess.model.move.AppliedMove
import com.deveshmittal.chess.model.piece.Set
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameState(
    val gameMetaInfo: GameMetaInfo,
    val states: List<GameSnapshotState> = listOf(GameSnapshotState()),
    val currentIndex: Int = 0,
    val lastActiveState: GameSnapshotState = states.first(),
) : Parcelable {
    val hasPrevIndex: Boolean
        get() = currentIndex > 0

    val hasNextIndex: Boolean
        get() = currentIndex < states.lastIndex

    val currentSnapshotState: GameSnapshotState
        get() = states[currentIndex]

    val toMove: Set
        get() = currentSnapshotState.toMove

    val resolution: Resolution
        get() = currentSnapshotState.resolution

    fun moves(): List<AppliedMove> =
        states
            .map { gameState -> gameState.move }
            .filterNotNull()
}


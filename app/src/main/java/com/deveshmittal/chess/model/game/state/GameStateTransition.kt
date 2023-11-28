package com.deveshmittal.chess.model.game.state

import com.deveshmittal.chess.model.move.AppliedMove

data class GameStateTransition(
    val fromSnapshotState: GameSnapshotState,
    val toSnapshotState: GameSnapshotState,
    val move: AppliedMove
)

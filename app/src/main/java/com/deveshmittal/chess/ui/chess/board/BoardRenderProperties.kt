package com.deveshmittal.chess.ui.chess.board

import androidx.compose.ui.unit.Dp
import com.deveshmittal.chess.model.board.Position
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import com.deveshmittal.chess.model.game.state.UiState

data class BoardRenderProperties(
    val fromState: GameSnapshotState,
    val toState: GameSnapshotState,
    val uiState: UiState,
    val isFlipped: Boolean,
    val squareSize: Dp,
    val onClick: (Position) -> Unit,
) {
    val cache: MutableMap<Any, Any> = mutableMapOf()
}

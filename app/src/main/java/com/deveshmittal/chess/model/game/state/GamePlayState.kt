package com.deveshmittal.chess.model.game.state

import android.os.Parcelable
import com.deveshmittal.chess.model.dataviz.DatasetVisualisation
import com.deveshmittal.chess.model.dataviz.impl.None
import kotlinx.parcelize.Parcelize

@Parcelize
data class GamePlayState(
    val gameState: GameState = GameState(GameMetaInfo.createWithDefaults()),
    val uiState: UiState = UiState(gameState.currentSnapshotState),
    val promotionState: PromotionState = PromotionState.None,
    val visualisation: DatasetVisualisation = None
) : Parcelable

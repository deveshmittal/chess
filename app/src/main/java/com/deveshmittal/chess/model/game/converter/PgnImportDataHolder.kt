package com.deveshmittal.chess.model.game.converter

import com.deveshmittal.chess.model.game.state.GameMetaInfo

data class PgnImportDataHolder(
    val metaInfo: GameMetaInfo,
    val moves: List<String>
)

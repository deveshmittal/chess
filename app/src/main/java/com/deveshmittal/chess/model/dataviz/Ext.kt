package com.deveshmittal.chess.model.dataviz

import androidx.compose.runtime.compositionLocalOf
import com.deveshmittal.chess.model.dataviz.impl.ActivePieces
import com.deveshmittal.chess.model.dataviz.impl.BlackKingsEscape
import com.deveshmittal.chess.model.dataviz.impl.CheckmateCount
import com.deveshmittal.chess.model.dataviz.impl.Influence
import com.deveshmittal.chess.model.dataviz.impl.KnightsMoveCount
import com.deveshmittal.chess.model.dataviz.impl.BlockedPieces
import com.deveshmittal.chess.model.dataviz.impl.None
import com.deveshmittal.chess.model.dataviz.impl.WhiteKingsEscape

val datasetVisualisations = listOf(
    None,
    ActivePieces,
    BlockedPieces,
    Influence,
    BlackKingsEscape,
    WhiteKingsEscape,
    KnightsMoveCount,
    CheckmateCount
)

val ActiveDatasetVisualisation = compositionLocalOf<DatasetVisualisation> { None }

package com.deveshmittal.chess.model.dataviz.impl

import androidx.compose.ui.graphics.Color
import com.deveshmittal.chess.app.R
import com.deveshmittal.chess.model.piece.Set
import kotlinx.parcelize.Parcelize

@Parcelize
object WhiteKingsEscape : KingsEscapeSquares(
    set = Set.WHITE,
    colorScale = Color.Unspecified to Color(0xBB6666EE)
) {
    override val name = R.string.viz_white_kings_escape_squares
}

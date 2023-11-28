package com.deveshmittal.chess.ui.chess.square.decoration

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.deveshmittal.chess.model.board.Coordinate
import com.deveshmittal.chess.ui.chess.square.SquareRenderProperties
import com.deveshmittal.chess.ui.chess.square.SquareDecoration

open class SquarePositionLabelSplit(
    private val displayFile: (Coordinate) -> Boolean,
    private val displayRank: (Coordinate) -> Boolean,
) : SquareDecoration {

    @Composable
    override fun render(properties: SquareRenderProperties) {
        if (displayFile(properties.coordinate)) {
            PositionLabel(
                text = properties.position.fileAsLetter.toString(),
                alignment = Alignment.BottomEnd,
                modifier = properties.sizeModifier
            )
        }
        if (displayRank(properties.coordinate)) {
            PositionLabel(
                text = properties.position.rank.toString(),
                alignment = Alignment.TopStart,
                modifier = properties.sizeModifier
            )
        }
    }
}


package com.deveshmittal.chess.ui.chess.square

import com.deveshmittal.chess.ui.chess.square.decoration.DatasetVisualiser
import com.deveshmittal.chess.ui.chess.square.decoration.DefaultHighlightSquare
import com.deveshmittal.chess.ui.chess.square.decoration.DefaultSquareBackground
import com.deveshmittal.chess.ui.chess.square.decoration.DefaultSquarePositionLabel
import com.deveshmittal.chess.ui.chess.square.decoration.TargetMarks

object DefaultSquareRenderer : SquareRenderer {

    override val decorations: List<SquareDecoration> =
        listOf(
            DefaultSquareBackground,
            DefaultHighlightSquare,
            DefaultSquarePositionLabel,
            DatasetVisualiser,
            TargetMarks
        )
}

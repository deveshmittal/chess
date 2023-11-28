package com.deveshmittal.chess.ui.chess.board

import com.deveshmittal.chess.ui.chess.board.decoration.DecoratedSquares
import com.deveshmittal.chess.ui.chess.pieces.Pieces
import com.deveshmittal.chess.ui.chess.square.DefaultSquareRenderer

object DefaultBoardRenderer : BoardRenderer {

    override val decorations: List<BoardDecoration> =
        listOf(
            DecoratedSquares(DefaultSquareRenderer.decorations),
            Pieces
        )
}

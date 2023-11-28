package com.deveshmittal.chess.ui.chess.square.decoration

import com.deveshmittal.chess.model.board.Coordinate

object DefaultSquarePositionLabel : SquarePositionLabelSplit(
    displayFile = { coordinate -> coordinate.y == Coordinate.max.y },
    displayRank = { coordinate -> coordinate.x == Coordinate.min.x }
)

package com.deveshmittal.chess.model.move

import com.deveshmittal.chess.model.board.Position

data class MoveIntention(
    val from: Position,
    val to: Position
)

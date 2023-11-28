package com.deveshmittal.chess.model.move

import com.deveshmittal.chess.model.board.Position

fun List<BoardMove>.targetPositions(): List<Position> =
    map { it.to }

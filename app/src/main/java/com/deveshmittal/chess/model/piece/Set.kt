package com.deveshmittal.chess.model.piece

enum class Set {
    WHITE, BLACK;

    fun opposite() =
        when (this) {
            WHITE -> BLACK
            BLACK -> WHITE
        }
}

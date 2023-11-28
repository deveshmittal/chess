package com.deveshmittal.chess.ui.chess.square.decoration

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.deveshmittal.chess.model.board.isDarkSquare
import com.deveshmittal.chess.ui.chess.square.SquareRenderProperties
import com.deveshmittal.chess.ui.chess.square.SquareDecoration

open class SquareBackground(
    private val lightSquareColor: Color,
    private val darkSquareColor: Color,
) : SquareDecoration {

    @Composable
    override fun render(properties: SquareRenderProperties) {
        Canvas(properties.sizeModifier) {
            drawRect(color = if (properties.position.isDarkSquare()) darkSquareColor else lightSquareColor)
        }
    }
}


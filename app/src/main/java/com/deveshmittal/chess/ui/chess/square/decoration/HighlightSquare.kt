package com.deveshmittal.chess.ui.chess.square.decoration

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.deveshmittal.chess.ui.chess.square.SquareRenderProperties
import com.deveshmittal.chess.ui.chess.square.SquareDecoration

open class HighlightSquare(
    private val color: Color,
    private val alpha: Float,
) : SquareDecoration {

    @Composable
    override fun render(properties: SquareRenderProperties) {
        if (properties.isHighlighted) {
            Canvas(properties.sizeModifier) {
                drawRect(
                    color = color,
                    size = size,
                    alpha = alpha
                )
            }
        }
    }
}


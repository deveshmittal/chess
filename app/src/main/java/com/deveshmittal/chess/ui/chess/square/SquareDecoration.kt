package com.deveshmittal.chess.ui.chess.square

import androidx.compose.runtime.Composable

interface SquareDecoration {

    @Composable
    fun render(properties: SquareRenderProperties)
}


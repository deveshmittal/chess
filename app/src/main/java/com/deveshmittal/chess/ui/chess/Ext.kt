package com.deveshmittal.chess.ui.chess

import androidx.compose.foundation.layout.offset
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.Dp
import com.deveshmittal.chess.app.R
import com.deveshmittal.chess.model.board.Coordinate
import com.deveshmittal.chess.model.game.Resolution
import com.deveshmittal.chess.model.game.state.GameState

fun Coordinate.toOffset(squareSize: Dp): Offset =
    Offset(
        x = (x - 1) * squareSize.value,
        y = (y - 1) * squareSize.value
    )


fun Coordinate.toOffsetModifier(squareSize: Dp): Modifier =
    Modifier
        .offset(
            Dp((x - 1) * squareSize.value),
            Dp((y - 1) * squareSize.value)
        )

fun Offset.toModifier(): Modifier =
    Modifier.offset(Dp(x), Dp(y))

fun GameState.resolutionText(): Int =
    when (resolution) {
        Resolution.IN_PROGRESS -> when (toMove) {
            com.deveshmittal.chess.model.piece.Set.WHITE -> R.string.resolution_white_to_move
            com.deveshmittal.chess.model.piece.Set.BLACK -> R.string.resolution_black_to_move
        }
        Resolution.CHECKMATE -> when (toMove) {
            com.deveshmittal.chess.model.piece.Set.WHITE -> R.string.resolution_black_wins
            com.deveshmittal.chess.model.piece.Set.BLACK -> R.string.resolution_white_wins
        }
        Resolution.STALEMATE -> R.string.resolution_stalemate
        Resolution.DRAW_BY_REPETITION -> R.string.resolution_draw_by_repetition
        Resolution.INSUFFICIENT_MATERIAL -> R.string.resolution_insufficient_material
    }

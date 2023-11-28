package com.deveshmittal.chess.model.game.controller

import com.deveshmittal.chess.model.game.Resolution
import com.deveshmittal.chess.model.game.state.GameMetaInfo
import com.deveshmittal.chess.model.piece.Set

fun GameMetaInfo.withResolution(resolution: Resolution, lastMoveBy: Set): GameMetaInfo =
    when (resolution) {
        com.deveshmittal.chess.model.game.Resolution.IN_PROGRESS -> this
        com.deveshmittal.chess.model.game.Resolution.CHECKMATE -> {
            val result = if (lastMoveBy == com.deveshmittal.chess.model.piece.Set.WHITE) "1-0" else "0-1"
            val winner = if (lastMoveBy == com.deveshmittal.chess.model.piece.Set.WHITE) white else black
            copy(
                tags = tags
                    .plus(GameMetaInfo.KEY_RESULT to result)
                    .plus(GameMetaInfo.KEY_TERMINATION to "$winner won by checkmate")
            )
        }
        com.deveshmittal.chess.model.game.Resolution.STALEMATE -> {
            copy(
                tags = tags
                    .plus(GameMetaInfo.KEY_RESULT to "½ - ½")
                    .plus(GameMetaInfo.KEY_TERMINATION to "Stalemate")
            )
        }
        com.deveshmittal.chess.model.game.Resolution.DRAW_BY_REPETITION -> {
            copy(
                tags = tags
                    .plus(GameMetaInfo.KEY_RESULT to "½ - ½")
                    .plus(GameMetaInfo.KEY_TERMINATION to "Draw by repetition")
            )
        }
        com.deveshmittal.chess.model.game.Resolution.INSUFFICIENT_MATERIAL -> {
            copy(
                tags = tags
                    .plus(GameMetaInfo.KEY_RESULT to "½ - ½")
                    .plus(GameMetaInfo.KEY_TERMINATION to "Draw by insufficient material")
            )
        }
    }

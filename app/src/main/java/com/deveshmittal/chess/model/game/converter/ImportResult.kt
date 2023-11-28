package com.deveshmittal.chess.model.game.converter

import com.deveshmittal.chess.model.game.state.GameState

sealed class ImportResult {
    class ValidationError(val msg: String) : ImportResult()
    class ImportedGame(val gameState: GameState) : ImportResult()
}

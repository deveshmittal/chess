package com.deveshmittal.chess.model.game.converter

import com.deveshmittal.chess.model.game.state.GameState

interface Converter {

    fun preValidate(text: String): Boolean

    fun import(text: String): ImportResult

    fun export(gameState: GameState): String
}


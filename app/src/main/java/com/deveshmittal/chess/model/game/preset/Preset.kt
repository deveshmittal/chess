package com.deveshmittal.chess.model.game.preset

import com.deveshmittal.chess.model.game.controller.GameController

interface Preset {

    fun apply(gameController: GameController)
}

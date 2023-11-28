package com.deveshmittal.chess.model.dataviz.impl

import com.deveshmittal.chess.app.R
import com.deveshmittal.chess.model.board.Position
import com.deveshmittal.chess.model.dataviz.Datapoint
import com.deveshmittal.chess.model.dataviz.DatasetVisualisation
import com.deveshmittal.chess.model.game.state.GameSnapshotState
import kotlinx.parcelize.Parcelize

@Parcelize
object None : DatasetVisualisation {

    override val name = R.string.viz_none

    override val minValue: Int = Int.MIN_VALUE

    override val maxValue: Int = Int.MAX_VALUE

    override fun dataPointAt(
        position: Position,
        state: GameSnapshotState,
        cache: MutableMap<Any, Any>
    ): Datapoint? =
        null
}

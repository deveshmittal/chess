package com.deveshmittal.chess.model.dataviz

import android.os.Parcelable
import com.deveshmittal.chess.model.board.Position
import com.deveshmittal.chess.model.game.state.GameSnapshotState

interface DatasetVisualisation : Parcelable {

    val name: Int

    val minValue: Int

    val maxValue: Int

    fun dataPointAt(position: Position, state: GameSnapshotState, cache: MutableMap<Any, Any>): Datapoint?
}


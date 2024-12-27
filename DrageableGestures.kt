package com.example.firstproject.practice

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable


fun CustomDraggableGesture() {

    /*for dragging we need  an offset
    we need x offset and y offset
    for this
     */

    var xOffset by remember { mutableFloatStateOf(1f) }
    var yOffset by remember { mutableFloatStateOf(1f) }
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier =
            Modifier
                .offset {
                    IntOffset(xOffset.roundToInt(), yOffset.roundToInt())
                }
                .size(100.dp)
                .background(Color.Blue)
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consume()
                        xOffset += dragAmount.x
                        yOffset += dragAmount.y
                    }

                }
        )
    }
}
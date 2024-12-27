package com.example.firstproject.practice

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@Composable

fun CustomGestures() {

    /*
        on tap
        double tap
        on press
        on long press
     */

    val counter = remember { mutableIntStateOf(0) }

    val currentGesture = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(

            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Box(
            modifier = Modifier
                .clickable {
                    counter.value += 1
                }
                .height(100.dp),
        ) {
            Text("counter value: ${counter.intValue}")

        }

        Box(
            modifier = Modifier
                .height(100.dp)
                .pointerInput(
                    Unit
                ) {
                    detectTapGestures(
                        //  onPress = { currentGesture.value = "on press" },
                        onTap = { currentGesture.value = "onTap" },
                        onDoubleTap = { currentGesture.value = "onDoubleTap" },
                        onLongPress = { currentGesture.value = "onLongPress" },
                    )
                },
        ) {
            Text("Gesture changing")
        }
        Text("Current Gesture: ${currentGesture.value}")
    }
}
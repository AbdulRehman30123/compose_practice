package com.example.firstproject.practice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestSizing(){
    Row (modifier = Modifier.fillMaxWidth(0.5f).background(color = Color.Red).height(100.dp)){

    }
}

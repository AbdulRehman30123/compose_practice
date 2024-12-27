package com.example.firstproject.practice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.firstproject.ui.theme.CustomTextStyles
import com.example.firstproject.ui.theme.Shape

@Composable
fun CustomThemePractice() {

    Column(



    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .width(100.dp) .clip(Shape.extraLarge)
                .background(color = Color.Blue)

        ) {}


        Text("Custom typo graph", style = CustomTextStyles().firstTextStyle)
    }


}

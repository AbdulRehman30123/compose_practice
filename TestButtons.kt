package com.example.firstproject.practice

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable

fun TestButtons() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "button pressed", Toast.LENGTH_SHORT).show()
        },

        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.White
        )
    ) {
        Text("press me")
    }
}

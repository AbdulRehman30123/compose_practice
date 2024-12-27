package com.example.firstproject.practice

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import coil3.compose.AsyncImage
import com.example.firstproject.R


@Composable
fun ImageDisplayPractice() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val minionImage = painterResource(id = R.drawable.minion_image)
        Image(painter = minionImage, contentDescription = null)
        val exitToAppIcon = painterResource(id = R.drawable.baseline_exit_to_app_24)
        Image(
            painter = exitToAppIcon,
            contentDescription = "Tap to Exit from application",
            colorFilter = ColorFilter.tint(color = Color.Blue, blendMode = BlendMode.SrcIn)
        )
        val imageUrl =
            "https://images.unsplash.com/photo-1720048171731-15b3d9d5473f?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        NetworkImage(imageUrl)

    }
}

@Composable
fun NetworkImage(imageUrl: String) {
    Log.d("NetworkImage", imageUrl)
    AsyncImage(
        model = imageUrl,
        placeholder = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,


    )
}
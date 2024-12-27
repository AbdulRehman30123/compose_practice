package com.example.firstproject.practice.scaffold

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun CustomScaffold() {
    Scaffold(
        topBar = { AppBar() },
        bottomBar = { BottomBar() }
    ) { }
}


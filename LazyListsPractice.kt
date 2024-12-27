package com.example.firstproject.practice

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// we have 4 types of lazy lists

/*
lazy column
lazy row
lazy vertical grid
lazy horizontal grid
 */

@Composable
fun LazyLoadingPractice() {
    val cityNames = listOf("Isb", "Karachi", "Jhang", "Rawalpindi")
    LazyColumn {
        item {
            Text("Lazy Column of city names")
        }
        items(cityNames) {
            Text("city name: $it")
        }
    }
}

@Preview
@Composable
fun LazyLoadingPracticePreview() {
    LazyLoadingPractice()
}
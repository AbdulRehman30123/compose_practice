package com.example.firstproject.practice

import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.example.firstproject.R

@Composable

fun TextAndTextFields(activity: Activity) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = stringResource(id = R.string.hard_coded_text))

        val userName = remember { mutableStateOf("") }
        TextField(
            value = userName.value,
            onValueChange = {
                userName.value = it
                Toast.makeText(activity, userName.value, Toast.LENGTH_SHORT).show()
            },
        )

        val secondUserName = remember { mutableStateOf("") }
        OutlinedTextField(
            value = secondUserName.value,
            onValueChange = { secondUserName.value = it },
            placeholder = { Text("outline text field") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )

    }
}
package com.example.firstproject.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.firstproject.R

@Composable

fun ScrollableColumn() {


    Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {

        Text(stringResource(R.string.hard_coded_text2))

        TextField(
            value = "",
            onValueChange = {}
        )
        Text(stringResource(R.string.hard_coded_text2))
        Text(stringResource(R.string.hard_coded_text2))
        Text(stringResource(R.string.hard_coded_text2))
    }


}



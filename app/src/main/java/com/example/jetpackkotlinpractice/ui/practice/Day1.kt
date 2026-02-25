package com.example.jetpackkotlinpractice.ui.practice


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Day1Screen(modifier: Modifier) {
    var count by remember { mutableStateOf(0) }


    Column(
        modifier = modifier
            .padding(top = 40.dp)
    ) {

        Button(onClick = { count++}) {
            Text("Count : $count")
        }
        Button(onClick = { count++}) {
            Text("Count : $count")
        }


    }

}

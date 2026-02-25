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
fun Day2Screen(modifier: Modifier) {
    var count by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(10.dp)) {

        Button(onClick = { count++ }) {
            Text(text = "Count: $count")
        }

        if (count >= 10){
            println("Done")
        }else{
            println("Keep Going")
        }
    }



}
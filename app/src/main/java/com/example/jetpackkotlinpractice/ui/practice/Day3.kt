package com.example.jetpackkotlinpractice.ui.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Day3Screen(modifier: Modifier){
    val fruits = listOf("Apple", "Banana", "Orange", "Mango", "Grapes")

    Column(modifier = modifier
        .padding(20.dp)
    ) {
        fruits.forEach {
            Text(it)
        }
    }
}
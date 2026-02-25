package com.example.jetpackkotlinpractice.ui.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Day5Screen(modifier: Modifier){

    var text by remember { mutableStateOf("") }


    Column {

        Text(
            text= "Farhan"
        )
        Text(
            text= "Farhan"
        )
        Text(
            text= "Farhan"
        )
    }

}
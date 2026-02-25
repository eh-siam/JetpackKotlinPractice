package com.example.jetpackkotlinpractice.ui.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Day4Screen(modifier: Modifier) {
    var text by remember { mutableStateOf("") }


    Column(modifier = modifier
        .padding(top = 20.dp)
    ) {

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter Name") },
        )
        Text(text)

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter Phone Number") },
        )
        Text(text)

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter Email Address") },
        )
        Text(text)

    }



}
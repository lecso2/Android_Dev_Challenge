package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.data
import com.example.androiddevchallenge.view.DescriptionText
import com.example.androiddevchallenge.view.Image
import com.example.androiddevchallenge.view.SubtitleText
import com.example.androiddevchallenge.view.TitleText

@Composable
fun DetailScreen(id: Int?) {
    val id = id ?: 0
    val dog = data[id]
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(dog.imageUrl)
        TitleText(text = dog.name, 22)
        SubtitleText(text = if (dog.isMale) "male" else "female", 16)
        SubtitleText(text = "age: " + dog.age.toString(), 16)
        DescriptionText(text = dog.name + dog.description, 18)
    }
}


@Preview
@Composable
fun prevDetail() {
    DetailScreen(id = 3)
}
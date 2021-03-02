package com.example.androiddevchallenge.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.typography


@Composable
fun Image(imgRes: Int) {
    val paintGender: Painter = painterResource(id = imgRes)
    androidx.compose.foundation.Image(painter = paintGender, contentDescription = "dog picture")
}

@Composable
fun Content(
    name: String,
    gender: String,
    age: String
) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText(text = name, 16)
        SubtitleText(text = gender, 12)
        SubtitleText(text = age, 12)
    }
}

@Composable
fun TitleText(text: String, size: Int) {
    Text(
        text = text,
        style = typography.h1,
        fontSize = size.sp
    )
}

@Composable
fun SubtitleText(text: String, size: Int) {
    Text(
        text = text,
        style = typography.h2,
        fontSize = size.sp
    )
}

@Composable
fun DescriptionText(text: String, size: Int) {
    Text(
        text = text,
        Modifier.padding(start = 5.dp, end = 5.dp),
        style = typography.body2,
        fontSize = size.sp,
    )
}
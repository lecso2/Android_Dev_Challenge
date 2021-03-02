package com.example.androiddevchallenge.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.data

@Composable
fun GridCardItem(dog: Dog, navigate: () -> Unit) {
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .height(200.dp)
            .padding(bottom = 8.dp, top = 8.dp, start = 8.dp, end = 8.dp)
            .clickable(onClick = navigate),
        elevation = 8.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(5)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier.weight(1.5f)) {
                Image(dog.imageUrl)
            }
            Column(modifier = Modifier.weight(1f)) {
                Content(
                    dog.name,
                    if (dog.isMale) "male" else "female",
                    "age: ${dog.age}"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GridCardItem(data[0]) {}
}
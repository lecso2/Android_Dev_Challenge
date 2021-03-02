/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

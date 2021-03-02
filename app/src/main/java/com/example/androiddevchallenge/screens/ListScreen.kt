package com.example.androiddevchallenge.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.data
import com.example.androiddevchallenge.view.GridCardItem

@ExperimentalFoundationApi
@Composable
fun ListScreen(navController: NavHostController) {
    Surface() {
        LazyVerticalGrid(cells = GridCells.Fixed(2), Modifier.padding(5.dp)) {
            itemsIndexed(data) { index, dog ->
                GridCardItem(dog) {
                    navController.navigate("detail/$index")
                }
            }
        }
    }
}


@Preview
@Composable
fun prev() {
    //TODO: how to mock navController?
}
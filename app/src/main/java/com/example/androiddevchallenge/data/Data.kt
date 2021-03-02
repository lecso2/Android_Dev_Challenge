package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R


val data = listOf(
    Dog(
        "Alvan",
        5,
        true,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.alvan
    ),
    Dog(
        "Anastasia",
        2,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.anastasia
    ),
    Dog(
        "Chewy",
        1,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.chewy
    ),
    Dog(
        "Chuckie",
        8,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.chuckie
    ),
    Dog(
        "James",
        4,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.james
    ),
    Dog(
        "Jamie",
        3,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.jamie
    ),
    Dog(
        "Michael",
        7,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.michael
    ),
    Dog(
        "Priscilla",
        6,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.priscilla
    ),
    Dog(
        "Robert",
        3,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.robert
    ),
    Dog(
        "Sharon",
        2,
        false,
        " is a very cute dog, but all dogs are very cute",
        R.drawable.sharon
    )
)

data class Dog(
    val name: String,
    val age: Int,
    val isMale: Boolean,
    val description: String,
    val imageUrl: Int
)
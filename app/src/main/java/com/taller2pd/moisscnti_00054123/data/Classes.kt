package com.taller2pd.moisscnti_00054123.data

data class Dish(
    val name: String,
    val price: Double,
    val description: String,
    val image: String

);

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val categories: List<String>,
    val menu: List<Dish>

)
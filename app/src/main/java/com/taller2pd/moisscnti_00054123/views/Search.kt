package com.taller2pd.moisscnti_00054123.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taller2pd.moisscnti_00054123.data.Restaurant
import com.taller2pd.moisscnti_00054123.data.Restaurantes
import com.taller2pd.moisscnti_00054123.ui.cards.RestaurantCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(
    onRestaurantClick: (Int) -> Unit
) {
    var buscar by remember { mutableStateOf("") }
    val allRestaurants = Restaurantes
    val coincidencias = remember(buscar) {
        filterRestaurants(buscar, allRestaurants)
    }

    TopAppBar(
        title = { Text("FoodSpot", color = Color(0,0,0), fontSize = 15.sp) },

        colors = TopAppBarColors(
            containerColor = Color(255, 255, 255),
            scrolledContainerColor = Color(255, 255, 255),
            navigationIconContentColor = Color(255, 255, 255),
            titleContentColor = Color(0, 0, 0),
            actionIconContentColor = Color(0, 0, 0)
        ),


        )

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = buscar,
            onValueChange = { buscar = it },
            label = { Text("Buscar restaurantes, platos o categorías") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(56.dp),
            shape = RoundedCornerShape(25.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(35.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
            , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(coincidencias) { restaurant ->
                RestaurantCard(
                    restaurant = restaurant,
                    onRestaurantClick = { onRestaurantClick(restaurant.id) }
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

//Esta si me la arregló deepseek lmao

fun filterRestaurants(busqueda: String, restaurantes: List<Restaurant>): List<Restaurant> {
    if (busqueda.isBlank()) {
        return emptyList()
    }

    val query = busqueda.lowercase().trim()

    return restaurantes.filter { restaurant ->
        restaurant.name.lowercase().contains(query) ||

                restaurant.categories.any { category ->
                    category.lowercase().contains(query)
                } ||

                restaurant.menu.any { dish ->
                    dish.name.lowercase().contains(query) ||
                            dish.description.lowercase().contains(query)
                }
    }.distinct()
}
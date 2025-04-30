package com.taller2pd.moisscnti_00054123.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taller2pd.moisscnti_00054123.data.Restaurant
import com.taller2pd.moisscnti_00054123.data.Restaurantes
import com.taller2pd.moisscnti_00054123.ui.cards.RestaurantCard
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantsLists(onRestaurantClick: (Int) -> Unit) {


    val restaurants = Restaurantes
    val categories = restaurants
        .flatMap { it.categories }
        .distinct()
        .sorted()


    TopAppBar(
        title = { Text("FoodSpot", color = Color(0, 0, 0), fontSize = 15.sp) },

        colors = TopAppBarColors(
            containerColor = Color(255, 255, 255),
            scrolledContainerColor = Color(255, 255, 255),
            navigationIconContentColor = Color(255, 255, 255),
            titleContentColor = Color(0, 0, 0),
            actionIconContentColor = Color(0, 0, 0)
        ),


        )

    Column(modifier = Modifier.padding(top = 90.dp)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            items(categories) { category ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = category,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp),
                        color = Color(0, 0, 0)
                    )

                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(bycategories(restaurants, category)) { restaurant ->
                            RestaurantCard(restaurant, onRestaurantClick)
                        }
                    }
                }
            }
        }
    }
}


fun bycategories(restauran: List<Restaurant>, category: String): MutableList<Restaurant> {

    val retornables = mutableListOf<Restaurant>();

    restauran.forEach { restaurante ->
        if (restaurante.categories.contains(category)) {
            retornables.add(restaurante)
        }
    }

    return retornables

}

@Preview(showBackground = true)
@Composable
fun previewRestauranteslista() {
    RestaurantsLists({})


}
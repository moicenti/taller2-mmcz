package com.taller2pd.moisscnti_00054123.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Carrito() {

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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(100.dp)

    ) {
        Text("Esta es el carrito de compras", color = Color(0, 0, 0))
    }


}
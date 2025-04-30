package com.taller2pd.moisscnti_00054123.views

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.taller2pd.moisscnti_00054123.data.Dish
import com.taller2pd.moisscnti_00054123.data.Restaurantes
import com.taller2pd.moisscnti_00054123.ui.cards.DishCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantDetail(id: Int, onBack: () -> Unit) {

    val restaurant = Restaurantes[id - 1]
    var buscador by remember { mutableStateOf("") }
    val mostrador = remember(buscador, restaurant.menu) {
        if (buscador.isBlank()) {
            restaurant.menu
        } else {
            restaurant.menu.filter { dish ->
                dish.name.contains(buscador, ignoreCase = true) ||
                        dish.description.contains(buscador, ignoreCase = true)
            }
        }
    }
    val context = LocalContext.current

    val mostrarToast = { name: String ->
        Toast.makeText(
            context,
            "El plato $name fue agregado al carro de compra!",
            Toast.LENGTH_SHORT
        ).show()
    }

    TopAppBar(
        title = { Text("") },
        navigationIcon = {
            IconButton(
                onClick = onBack,
            ) {
                Icon(
                    Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0, 0, 0)
                )
            }
        },
        colors = TopAppBarColors(
            containerColor = Color(255, 255, 255),
            scrolledContainerColor = Color(255, 255, 255),
            navigationIconContentColor = Color(255, 255, 255),
            titleContentColor = Color(0, 0, 0),
            actionIconContentColor = Color(0, 0, 0)
        ),


    )


    Column(
        modifier = Modifier
            .fillMaxSize().padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = restaurant.name,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0, 0, 0),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        AsyncImage(
            model = restaurant.menu,
            contentDescription = "Imagen del restaurante"
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = restaurant.description,
            textAlign = TextAlign.Center,
            color = Color(0, 0, 0)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = buscador,
            onValueChange = { buscador = it },
            label = { Text("Ingrese un plato que quiera buscar") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(56.dp)
                .background(Color(255, 255, 255)),
            shape = RoundedCornerShape(25.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color(0,0,0),
                focusedTextColor = Color(0,0,0),
                focusedContainerColor = Color(255,255,255),
                unfocusedContainerColor = Color(255,255,255)
            )


        )
        LazyColumn(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {

            items(mostrador) { dishes ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    DishCard(dishes, onDishClick = { name -> mostrarToast(name) })
                    Spacer(modifier = Modifier.height(10.dp))

                }

            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun previewRestaurantDetails() {
    RestaurantDetail(1, {})


}

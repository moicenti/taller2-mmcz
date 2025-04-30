package com.taller2pd.moisscnti_00054123.ui.cards

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.taller2pd.moisscnti_00054123.data.Dish

@Composable
fun DishCard(dish: Dish, onDishClick: (String) -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = androidx.compose.ui.graphics.Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, androidx.compose.ui.graphics.Color.Black, shape = RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = dish.image,
                contentDescription = dish.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(12.dp)),
                onError = { println("No se pudo cargar la imagen de ${dish.name}") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = dish.name,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleMedium,
                color = Color(0,0,0)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "$${dish.price}",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0,0,0)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = dish.description,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall,
                color = Color(0,0,0)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { onDishClick(dish.name) }) {
                Text("Agregar al carrito")
            }
        }
    }
}

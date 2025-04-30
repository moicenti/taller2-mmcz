package com.taller2pd.moisscnti_00054123

import android.util.Log

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.taller2pd.moisscnti_00054123.navigation.ALLRESTAURANTS
import com.taller2pd.moisscnti_00054123.navigation.SEARCH
import com.taller2pd.moisscnti_00054123.navigation.SHOP
import com.taller2pd.moisscnti_00054123.navigation.navegator
import com.taller2pd.moisscnti_00054123.ui.theme.MoisésCnti_00054123Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoisésCnti_00054123Theme {
                Main()

            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main() {
    val navController = rememberNavController()

    Log.d("MiApp", "Este es un mensaje de depuración")

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

    Scaffold(
        Modifier.background(color = Color(255, 255, 255)),
        bottomBar = {
            NavigationBar(
                containerColor = Color(255, 255, 255),
                contentColor = Color(0, 0, 0)
            ) {
                NavigationBarItem(
                    label = { Text(text = "Lista", color = Color(0, 0, 0)) },
                    icon = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.List,
                            contentDescription = "Ir a la lista"
                        )
                    },
                    selected = true,
                    onClick = { navController.navigate(ALLRESTAURANTS) }
                )
                NavigationBarItem(
                    label = { Text(text = "Buscar", color = Color(0, 0, 0)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Buscar"
                        )
                    },
                    selected = true,
                    onClick = { navController.navigate(SEARCH) }
                )
                NavigationBarItem(
                    label = { Text(text = "Carrito", color = Color(0, 0, 0)) },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Carrito"
                        )
                    },
                    selected = true,
                    onClick = { navController.navigate(SHOP) }
                )

            }
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color(255, 255, 255))
        ) {
            navegator(navController)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MoisésCnti_00054123Theme {
        Main();
    }
}
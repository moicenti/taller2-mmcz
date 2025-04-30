package com.taller2pd.moisscnti_00054123.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.taller2pd.moisscnti_00054123.views.Carrito
import com.taller2pd.moisscnti_00054123.views.RestaurantsLists
import com.taller2pd.moisscnti_00054123.views.Search
import com.taller2pd.moisscnti_00054123.views.RestaurantDetail

@Composable

fun navegator(controlador: NavHostController) {

    val onRestaurantClick = { restauranteId: Int ->
        controlador.navigate(MENURESTAURANT(restauranteId))
    }
    val onBack: () -> Unit = { controlador.popBackStack() }

    NavHost(
        navController = controlador,
        startDestination = ALLRESTAURANTS
    ) {
        composable<ALLRESTAURANTS> {
            RestaurantsLists(onRestaurantClick)
        }
        composable<SEARCH> {
            Search(onRestaurantClick)
        }
        composable<SHOP> {
            Carrito()
        }
        composable<MENURESTAURANT> { backStackEntry ->
            val rastaurantID = backStackEntry.arguments?.getInt("id") ?: 0
            RestaurantDetail(rastaurantID,onBack)
        }
    }
}
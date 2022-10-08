package com.example.usersapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.usersapp.screens.BuyScreen
import com.example.usersapp.screens.MainScreen
import com.example.usersapp.screens.ShoppingCartScreen

@Composable
fun AppNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route){
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(route = AppScreens.BuyScreen.route){
            BuyScreen(navController)
        }
        composable(route = AppScreens.ShoppingCartScreen.route){
            ShoppingCartScreen(navController)
        }

    }
}
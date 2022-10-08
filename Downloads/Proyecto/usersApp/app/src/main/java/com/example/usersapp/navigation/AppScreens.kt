package com.example.usersapp.navigation

sealed class AppScreens(val route: String){
    object MainScreen: AppScreens("main_screen")
    object BuyScreen: AppScreens("buy_screen")
    object ShoppingCartScreen: AppScreens("shop_screen")
}

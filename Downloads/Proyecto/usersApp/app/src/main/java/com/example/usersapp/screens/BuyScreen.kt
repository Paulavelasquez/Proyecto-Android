package com.example.usersapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.usersapp.R
import com.example.usersapp.User
import com.example.usersapp.font.Fonts
import com.example.usersapp.navigation.AppScreens
import com.example.usersapp.userViewModel

@Composable
fun BuyScreen(navController: NavController){
    Scaffold() {
    BuyBodyContent(navController)
    }
}

@Composable
fun BuyBodyContent(navController: NavController){

    val  font:Fonts = Fonts()
    Column(
        modifier= Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Text("ANCESTRAL COSMETICS", fontSize = 45.sp, fontFamily = font.FiraSansFamily)
        }
        Row() {
            Image(
                painter = painterResource(id = R.drawable.carritotarjeta),
                contentDescription =  ""
            )
        }
        Row() {
            Button(onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }) {
                Text(text = "PAY NOW")
            }
        }
    }

}
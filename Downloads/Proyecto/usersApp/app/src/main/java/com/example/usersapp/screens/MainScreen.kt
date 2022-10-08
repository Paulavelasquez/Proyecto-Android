package com.example.usersapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.usersapp.R
import com.example.usersapp.User
import com.example.usersapp.font.Fonts
import com.example.usersapp.navigation.AppScreens
import com.example.usersapp.userViewModel

@Composable
fun MainScreen(navController: NavController) {
    Scaffold() {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {

    val font: Fonts = Fonts()
    Column(
        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "", Modifier.size(500.dp, 200.dp)
            )
        }
        Row() {
            Image(
                painter = painterResource(id = R.drawable.balsamo),
                contentDescription = "", Modifier.size(200.dp, 200.dp).clip(CircleShape)
            )
            Image(
                painter = painterResource(id = R.drawable.jabon),
                contentDescription = "", Modifier.size(200.dp, 200.dp).clip(CircleShape)
            )
        }
        Row() {
            Button(onClick = {
                navController.navigate(route = AppScreens.ShoppingCartScreen.route)
            }) {
                Text(text = "GO TO SHOP NOW")
            }
        }

    }

}

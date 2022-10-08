package com.example.usersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.usersapp.navigation.AppNavigation
import com.example.usersapp.screens.MainScreen
import com.example.usersapp.ui.theme.UsersAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UsersAppTheme {
              //  Scaffold(content = {usersList()})
                AppNavigation()
        }
    }
}
    @Composable
    private fun usersList(userViewModel: userViewModel = viewModel()) {
       userViewModel.fetchUsers()
        val users by userViewModel.users.collectAsState()
        LazyColumn{
            items(users.size){
                userMenuContent(user=users[it])
            }
        }
    }


    @Composable
    private fun userMenuContent(user: User) {
    //crear fila con row de composable
        Row{
            Image(painter = painterResource(id = R.drawable.balsamo),
                contentDescription =  user.descripcion,
            )
        }
        Row{

            Column() {
                Text(text = user.name, style = MaterialTheme.typography.h4)
                Text(text = user.precio, style = MaterialTheme.typography.h6)
                Text(text = user.descripcion, style = MaterialTheme.typography.h6)
            }
            

        }

    }
    @Preview(showBackground = true)
    @Composable
    fun userMenuContentPreview() {
        UsersAppTheme {
            userMenuContent(User( "Rafinha", "1.00", ".com", "bb1"))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    AppNavigation()
}



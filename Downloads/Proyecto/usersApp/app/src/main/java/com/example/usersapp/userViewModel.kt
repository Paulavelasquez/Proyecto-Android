package com.example.usersapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class userViewModel: ViewModel() {

 var users: StateFlow<List<User>> = MutableStateFlow(emptyList())
    private set

    fun fetchUsers(){
        val userFromSource= listOf(
            User("Balsamo labial", "5.000", "Ta caro sta monda BBB", "BBB1")

        )
        users= MutableStateFlow( userFromSource)
    }

}

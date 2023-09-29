package com.example.myfinalapp

sealed class ButtonNavigation(val route:String){
    object SignUp:NavigationItem(route = "SignUp")
    object SignIn:NavigationItem(route = "SignUp")
}

package com.rharris.simpleapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "greeting") {
        composable("greeting") { Greeting(navController) }
        composable("dolphin_screen") {DolphinScreen(navController)}
        composable("marlin_screen") { MarlinScreen(navController) }
        composable("tarheel_screen") { TarheelScreen(navController) }
    }
}
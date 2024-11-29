package aceituno.rojo.mynavigation.core.navigation

import aceituno.rojo.mynavigation.HomeScreen
import aceituno.rojo.mynavigation.LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login> {
            LoginScreen { navController.navigate(Home) }
        }
        composable<Home> {
            HomeScreen { navController.navigate(Login)}
        }
    }
}
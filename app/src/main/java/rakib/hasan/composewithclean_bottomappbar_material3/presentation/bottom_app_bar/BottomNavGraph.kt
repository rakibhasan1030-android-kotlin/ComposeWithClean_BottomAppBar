package rakib.hasan.composewithclean_bottomappbar_material3.presentation.bottom_app_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.Screen
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.game.GameScreen
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.home.HomeScreen
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.profile.ProfileScreen
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.sketch.SketchScreen

@Composable
fun BottomNavGraph(
    navController : NavHostController
){
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(route = Screen.HomeScreen.route){
            HomeScreen()
        }
        composable(route = Screen.SketchScreen.route){
            SketchScreen()
        }
        composable(route = Screen.GameScreen.route){
            GameScreen()
        }
        composable(route = Screen.ProfileScreen.route){
            ProfileScreen()
        }
    }
}
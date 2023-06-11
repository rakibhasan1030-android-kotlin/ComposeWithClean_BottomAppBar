package rakib.hasan.composewithclean_bottomappbar_material3.presentation

sealed class Screen(val route: String){
    object HomeScreen: Screen("home_screen")
    object SketchScreen: Screen("sketch_screen")
    object GameScreen: Screen("game_screen")
    object ProfileScreen: Screen("profile_screen")
}

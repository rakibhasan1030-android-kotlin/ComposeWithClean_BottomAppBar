package rakib.hasan.composewithclean_bottomappbar_material3.presentation.bottom_app_bar

import rakib.hasan.composewithclean_bottomappbar_material3.R
import rakib.hasan.composewithclean_bottomappbar_material3.presentation.Screen

sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    object Home: BottomBarItem(
        route = Screen.HomeScreen.route,
        title = "Home",
        icon = R.drawable.ic_home_outline,
        icon_focused = R.drawable.ic_home_filled
    )

    object Sketch: BottomBarItem(
        route = Screen.SketchScreen.route,
        title = "Sketch",
        icon = R.drawable.ic_sketch_outline,
        icon_focused = R.drawable.ic_sketch_filled
    )

    object Game: BottomBarItem(
        route = Screen.GameScreen.route,
        title = "Game",
        icon = R.drawable.ic_game_outline,
        icon_focused = R.drawable.ic_game_filled
    )//01717757987

    object Profile: BottomBarItem(
        route = Screen.ProfileScreen.route,
        title = "Profile",
        icon = R.drawable.ic_profile_outline,
        icon_focused = R.drawable.ic_profile_filled
    )

}
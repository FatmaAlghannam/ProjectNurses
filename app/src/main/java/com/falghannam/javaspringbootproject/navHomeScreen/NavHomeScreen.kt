package com.falghannam.javaspringbootproject.navHomeScreen
//
//import androidx.compose.runtime.Composable
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.falghannam.WelcomeScreen
//import com.falghannam.javaspringbootproject.composables.SignUpScreen
//import com.falghannam.javaspringbootproject.utils.Routes.Companion.loginRoute
//import com.falghannam.javaspringbootproject.utils.Routes.Companion.signupRoute
//import com.falghannam.javaspringbootproject.utils.Routes.Companion.welcomeScreenRoute
//
//
//@Composable
//fun NavScreen() {
//    val navController = rememberNavController()
//    val viewModel: ViewModel = viewModel()
//
////
////    var startDestination = welcomeScreenRoute
////    if (viewModel.token?.token != null) {
////        startDestination = loginRoute
////        navController.navigate(loginRoute)
////    }
//
//
// NavHost(navController = navController, startDestination = startDestination) {
//        composable(welcomeScreenRoute) {
//            WelcomeScreen(navController = navController, viewModel)
//        }
//
//        composable(signupRoute) {
//            SignUpScreen(viewModel)
//        }
//
//        composable(loginRoute) {
//            WelcomeScreen(navController = navController, viewModel)
//        }
//
//
//    }
//}
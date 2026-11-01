package com.maqraah.imamaljazari.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maqraah.imamaljazari.ui.AppScaffold
import com.maqraah.imamaljazari.ui.screens.AdminDashboardScreen
import com.maqraah.imamaljazari.ui.screens.ChatScreen
import com.maqraah.imamaljazari.ui.screens.GroupScreen
import com.maqraah.imamaljazari.ui.screens.LoginScreen
import com.maqraah.imamaljazari.ui.screens.PaymentScreen
import com.maqraah.imamaljazari.ui.screens.ProgramDetailScreen
import com.maqraah.imamaljazari.ui.screens.RegistrationScreen
import com.maqraah.imamaljazari.ui.screens.SupportScreen
import com.maqraah.imamaljazari.ui.screens.WalletScreen

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = AppRoute.Auth.route) {
        composable(AppRoute.Auth.route) {
            LoginScreen(navController)
        }
        composable(AppRoute.Home.route) {
            AppScaffold(navController)
        }
        composable(AppRoute.Programs.route) {
            AppScaffold(navController)
        }
        composable(AppRoute.ProgramDetail.route) {
            ProgramDetailScreen(navController)
        }
        composable(AppRoute.Registration.route) {
            RegistrationScreen(navController)
        }
        composable(AppRoute.Payment.route) {
            PaymentScreen(navController)
        }
        composable(AppRoute.Wallet.route) {
            WalletScreen(navController)
        }
        composable(AppRoute.Admin.route) {
            AdminDashboardScreen(navController)
        }
        composable(AppRoute.Groups.route) {
            GroupScreen(navController)
        }
        composable(AppRoute.Chat.route) {
            ChatScreen(navController)
        }
        composable(AppRoute.Support.route) {
            SupportScreen(navController)
        }
    }
}

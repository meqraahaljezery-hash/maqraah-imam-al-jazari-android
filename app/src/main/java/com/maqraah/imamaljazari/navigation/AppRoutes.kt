package com.maqraah.imamaljazari.navigation

sealed class AppRoute(val route: String) {
    data object Auth : AppRoute("auth")
    data object Home : AppRoute("home")
    data object Programs : AppRoute("programs")
    data object ProgramDetail : AppRoute("program_detail")
    data object Registration : AppRoute("registration")
    data object Payment : AppRoute("payment")
    data object Wallet : AppRoute("wallet")
    data object Admin : AppRoute("admin")
    data object Groups : AppRoute("groups")
    data object Chat : AppRoute("chat")
    data object Support : AppRoute("support")
}

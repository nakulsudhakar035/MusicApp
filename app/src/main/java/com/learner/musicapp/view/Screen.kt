package com.learner.musicapp.view

import androidx.annotation.DrawableRes
import com.learner.musicapp.R

sealed class Screen (val title: String, val route: String){
    sealed class  DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int)
        : Screen(dTitle, dRoute){
            object Account: DrawerScreen(
                "Account",
                "account",
                R.drawable.ic_account
            )
            object Subscription: DrawerScreen(
                "Subscription",
                "subscribe",
                R.drawable.ic_subscribe
            )

            object AddAccount: DrawerScreen(
                "Add Account",
                "add_account",
                R.drawable.ic_add_account
            )
    }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)
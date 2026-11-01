package com.maqraah.imamaljazari.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MonetizationOn
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData
import com.maqraah.imamaljazari.ui.screens.AdminDashboardScreen
import com.maqraah.imamaljazari.ui.screens.ChatScreen
import com.maqraah.imamaljazari.ui.screens.GroupScreen
import com.maqraah.imamaljazari.ui.screens.HomeScreen
import com.maqraah.imamaljazari.ui.screens.PaymentScreen
import com.maqraah.imamaljazari.ui.screens.ProgramsScreen
import com.maqraah.imamaljazari.ui.screens.RegistrationScreen
import com.maqraah.imamaljazari.ui.screens.SupportScreen
import com.maqraah.imamaljazari.ui.screens.WalletScreen

sealed class AppTab(val title: String, val icon: ImageVector) {
    data object Home : AppTab("الرئيسية", Icons.Default.Home)
    data object Programs : AppTab("البرامج", Icons.Default.School)
    data object Registration : AppTab("التسجيل", Icons.Default.AccountCircle)
    data object Payment : AppTab("الباقات", Icons.Default.MonetizationOn)
    data object Wallet : AppTab("الرصيد", Icons.Default.Wallet)
    data object Admin : AppTab("الإدارة", Icons.Default.AdminPanelSettings)
    data object Groups : AppTab("المجموعات", Icons.Default.ChatBubbleOutline)
    data object Support : AppTab("الدعم", Icons.Default.Info)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(navController: NavHostController) {
    val tabs = listOf(
        AppTab.Home,
        AppTab.Programs,
        AppTab.Registration,
        AppTab.Payment,
        AppTab.Wallet,
        AppTab.Admin,
        AppTab.Groups,
        AppTab.Support
    )

    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(horizontal = 20.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "مَقْرَأَةُ الإمام الجزري",
                    color = Color.White,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Imam Al-Jazari Center",
                    color = Color(0xFFDDF2E3),
                    style = MaterialTheme.typography.labelLarge
                )
            }
        },
        bottomBar = {
            NavigationBar {
                tabs.forEachIndexed { index, tab ->
                    NavigationBarItem(
                        selected = index == selectedTab,
                        onClick = { selectedTab = index },
                        icon = { Icon(tab.icon, contentDescription = tab.title) },
                        label = { Text(tab.title) }
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (tabs[selectedTab]) {
                AppTab.Home -> HomeScreen(navController)
                AppTab.Programs -> ProgramsScreen(navController, SampleData.programs)
                AppTab.Registration -> RegistrationScreen(navController)
                AppTab.Payment -> PaymentScreen(navController)
                AppTab.Wallet -> WalletScreen(navController)
                AppTab.Admin -> AdminDashboardScreen(navController)
                AppTab.Groups -> GroupScreen(navController)
                AppTab.Support -> SupportScreen(navController)
            }
        }
    }
}

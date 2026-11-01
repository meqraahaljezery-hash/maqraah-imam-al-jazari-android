package com.maqraah.imamaljazari.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData
import com.maqraah.imamaljazari.navigation.AppRoute

@Composable
fun GroupScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text("المجموعات", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        }

        items(SampleData.groups) { group ->
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(group.name, fontWeight = FontWeight.Bold)
                    Text("البرنامج: ${group.programId}")
                    Text("الفترة: ${group.period}")
                    Text("الجنس: ${group.gender}")
                    Button(onClick = { navController.navigate(AppRoute.Chat.route) }) {
                        Text("الدخول إلى المجموعة")
                    }
                }
            }
        }
    }
}

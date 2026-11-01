package com.maqraah.imamaljazari.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData

@Composable
fun SupportScreen(navController: NavHostController) {
    val contact = SampleData.supportContact

    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Card(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("الدعم والتواصل")
                Text("رقم الهاتف: ${contact.phone}")
                Text("البريد الإلكتروني: ${contact.email}")
                Text("Telegram: ${contact.telegram ?: "غير متوفر"}")
            }
        }

        Button(onClick = { }) { Text("الاتصال") }
        Button(onClick = { }) { Text("مراسلة البريد") }
    }
}

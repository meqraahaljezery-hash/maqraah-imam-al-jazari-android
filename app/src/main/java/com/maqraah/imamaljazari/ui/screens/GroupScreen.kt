package com.maqraah.imamaljazari.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData

@Composable
fun AdminDashboardScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text("لوحة الإدارة", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        }

        item {
            Card(shape = RoundedCornerShape(18.dp), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Text("إحصاءات", color = MaterialTheme.colorScheme.onPrimary, fontWeight = FontWeight.Bold)
                    Text("الطلاب: 245", color = MaterialTheme.colorScheme.onPrimary)
                    Text("طلبات التسجيل: 14", color = MaterialTheme.colorScheme.onPrimary)
                    Text("طلبات الدفع: 7", color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }

        items(SampleData.adminPermissions) { permission ->
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(permission.title, fontWeight = FontWeight.Bold)
                    Text(if (permission.enabled) "مفعلة" else "معطلة")
                    Button(onClick = { }) { Text("تعديل الصلاحية") }
                }
            }
        }
    }
}

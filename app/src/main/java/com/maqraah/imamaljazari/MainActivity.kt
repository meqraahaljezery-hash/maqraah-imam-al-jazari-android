package com.maqraah.imamaljazari.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.maqraah.imamaljazari.navigation.AppRoute

@Composable
fun ProgramDetailScreen(navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text("التلقين وتصحيح الأداء", fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(8.dp))
            Text("برنامج تعليمي يركز على تحسين الأداء القرآني، التلقين، الجوانب الصوتية، والمراجعة المستمرة.")
            Spacer(Modifier.height(12.dp))
            Text("الفترة: 8 أسابيع")
            Text("الجنس: مشترك")
            Text("الشروط: وجود وقت مناسب، الالتزام، متابعة المعلم.")
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navController.navigate(AppRoute.Registration.route) }) {
                Text("التسجيل في هذا البرنامج")
            }
        }
    }
}

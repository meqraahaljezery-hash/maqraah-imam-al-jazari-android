package com.maqraah.imamaljazari.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData
import com.maqraah.imamaljazari.navigation.AppRoute

@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier.padding(22.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "مقرأة الإمام الجزري",
                        color = Color.White,
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "للتعليم القرآني، الإجازة بالسند، وتوثيق الأداء القارئ في بيئة تعليمية متكاملة.",
                        color = Color(0xFFDDF2E3),
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Button(
                        onClick = { navController.navigate(AppRoute.Programs.route) },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text("البرامج المتاحة")
                    }
                }
            }
        }

        item {
            Text(
                text = "البرامج الأولية",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }

        items(SampleData.programs) { program ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF6FBF7)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(
                        text = program.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(text = program.description)
                    Spacer(Modifier.height(8.dp))
                    Text(text = "المدة: ${program.duration}")
                    Text(text = "الفئة: ${program.targetAudience}")
                    Text(text = "الشروط: ${program.conditions}")
                    Spacer(Modifier.height(12.dp))
                    Button(
                        onClick = { navController.navigate(AppRoute.ProgramDetail.route) }
                    ) {
                        Text("عرض التفاصيل")
                    }
                }
            }
        }
    }
}

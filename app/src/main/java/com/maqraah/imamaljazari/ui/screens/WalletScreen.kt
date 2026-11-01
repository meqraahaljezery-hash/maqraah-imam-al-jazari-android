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
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.maqraah.imamaljazari.data.PaymentMethod
import com.maqraah.imamaljazari.data.PaymentPackage

@Composable
fun PackagesScreen(packages: List<PaymentPackage>, methods: List<PaymentMethod>) {
    LazyColumn(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text("الباقات المتاحة", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        }

        items(packages) { pkg ->
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("${pkg.minutes} دقيقة | ${pkg.priceEtb} ETB")
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { }) {
                        Text("اشترِ هذه الباقة")
                    }
                }
            }
        }

        item {
            Spacer(Modifier.height(12.dp))
            Text("وسائل الدفع", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        }

        items(methods) { method ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(method.name, fontWeight = FontWeight.Bold)
                    Text("اسم الحساب: ${method.accountName}")
                    Text("رقم الحساب: ${method.accountNumber}")
                    Text(method.instructions)
                }
            }
        }
    }
}

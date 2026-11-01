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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.maqraah.imamaljazari.data.SampleData

@Composable
fun PaymentScreen(navController: NavHostController) {
    var senderName by remember { mutableStateOf("") }
    var senderPhone by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text("باقات الدفع", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        }

        items(SampleData.paymentPackages) { pkg ->
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("${pkg.minutes} دقيقة | ${pkg.priceEtb} ETB")
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { }) { Text("اشترِ هذه الباقة") }
                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("إثبات الدفع", fontWeight = FontWeight.Bold)
                    OutlinedTextField(value = senderName, onValueChange = { senderName = it }, label = { Text("اسم المرسل") }, modifier = Modifier.fillMaxWidth())
                    OutlinedTextField(value = senderPhone, onValueChange = { senderPhone = it }, label = { Text("رقم هاتف المرسل") }, modifier = Modifier.fillMaxWidth())
                    OutlinedTextField(value = amount, onValueChange = { amount = it }, label = { Text("المبلغ المحول") }, modifier = Modifier.fillMaxWidth())
                    Button(onClick = { }) { Text("إرسال طلب الدفع") }
                }
            }
        }
    }
}

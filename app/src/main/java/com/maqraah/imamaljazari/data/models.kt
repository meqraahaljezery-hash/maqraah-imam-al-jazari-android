package com.maqraah.imamaljazari.data

import kotlinx.serialization.Serializable

@Serializable
data class Program(
    val id: String,
    val title: String,
    val description: String,
    val features: List<String>,
    val conditions: String,
    val duration: String,
    val targetAudience: String,
    val gender: String,
    val isActive: Boolean = true,
    val imageUrl: String? = null
)

@Serializable
data class RegistrationRequest(
    val id: String,
    val fullName: String,
    val birthDate: String,
    val gender: String,
    val country: String,
    val city: String,
    val phone: String,
    val email: String? = null,
    val programId: String,
    val programTitle: String,
    val preferredTime: String,
    val readingLevel: String,
    val previousMemorization: String,
    val recitationType: String,
    val availability: String,
    val parentData: String = "",
    val notes: String = "",
    val status: String = "Pending"
)

@Serializable
data class PaymentPackage(
    val id: String,
    val minutes: Int,
    val priceEtb: Int,
    val isActive: Boolean = true
)

@Serializable
data class PaymentMethod(
    val id: String,
    val name: String,
    val accountName: String,
    val accountNumber: String,
    val instructions: String
)

@Serializable
data class WalletTransaction(
    val id: String,
    val type: String,
    val amountMinutes: Int,
    val previousBalance: Int,
    val newBalance: Int,
    val reason: String,
    val createdAt: String,
    val byUser: String = "System"
)

@Serializable
data class AdminPermission(
    val id: String,
    val title: String,
    val enabled: Boolean = false
)

@Serializable
data class SupportContact(
    val phone: String,
    val email: String
)

@Serializable
data class UserRole(
    val id: String,
    val name: String,
    val description: String
)

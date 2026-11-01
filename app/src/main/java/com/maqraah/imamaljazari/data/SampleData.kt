package com.maqraah.imamaljazari.data

import kotlinx.serialization.Serializable

@Serializable
data class UserProfile(
    val id: String = "",
    val userId: String = "",
    val fullName: String = "",
    val phone: String = "",
    val email: String? = null,
    val country: String = "",
    val city: String = "",
    val gender: String = "",
    val birthDate: String = "",
    val status: String = "active",
    val currentBalanceMinutes: Int = 0,
    val role: String = "student",
    val createdAt: String = ""
)

@Serializable
data class Program(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val features: List<String> = emptyList(),
    val conditions: String = "",
    val duration: String = "",
    val targetAudience: String = "",
    val gender: String = "all",
    val isActive: Boolean = true,
    val imageUrl: String? = null,
    val telegramLink: String? = null
)

@Serializable
data class RegistrationRequest(
    val id: String = "",
    val userId: String = "",
    val fullName: String = "",
    val birthDate: String = "",
    val gender: String = "",
    val country: String = "",
    val city: String = "",
    val phone: String = "",
    val email: String? = null,
    val programId: String = "",
    val programTitle: String = "",
    val preferredTime: String = "",
    val readingLevel: String = "",
    val previousMemorization: String = "",
    val recitationType: String = "",
    val availability: String = "",
    val parentData: String = "",
    val notes: String = "",
    val status: String = "Pending",
    val rejectionReason: String? = null,
    val createdAt: String = ""
)

@Serializable
data class PaymentPackage(
    val id: String = "",
    val minutes: Int = 0,
    val priceEtb: Int = 0,
    val isActive: Boolean = true
)

@Serializable
data class PaymentMethod(
    val id: String = "",
    val name: String = "",
    val accountName: String = "",
    val accountNumber: String = "",
    val instructions: String = ""
)

@Serializable
data class PaymentRequest(
    val id: String = "",
    val userId: String = "",
    val packageId: String = "",
    val senderName: String = "",
    val senderPhone: String = "",
    val paymentMethod: String = "",
    val transactionNumber: String = "",
    val amount: Int = 0,
    val transferDate: String = "",
    val receiptUrl: String? = null,
    val status: String = "Pending",
    val rejectionReason: String? = null,
    val createdAt: String = ""
)

@Serializable
data class WalletTransaction(
    val id: String = "",
    val userId: String = "",
    val type: String = "",
    val amountMinutes: Int = 0,
    val previousBalance: Int = 0,
    val newBalance: Int = 0,
    val reason: String = "",
    val createdAt: String = "",
    val byUser: String = "System"
)

@Serializable
data class AdminPermission(
    val id: String = "",
    val title: String = "",
    val enabled: Boolean = false
)

@Serializable
data class SupportContact(
    val phone: String = "",
    val email: String = "",
    val telegram: String? = null
)

@Serializable
data class UserRole(
    val id: String = "",
    val name: String = "",
    val description: String = ""
)

@Serializable
data class GroupChat(
    val id: String = "",
    val name: String = "",
    val programId: String = "",
    val gender: String = "",
    val period: String = "",
    val countryCode: String = "",
    val telegramLink: String = "",
    val isActive: Boolean = true
)

@Serializable
data class ChatMessage(
    val id: String = "",
    val groupId: String = "",
    val userId: String = "",
    val senderName: String = "",
    val content: String = "",
    val createdAt: String = "",
    val mediaUrl: String? = null
)

@Serializable
data class AuditLog(
    val id: String = "",
    val action: String = "",
    val actor: String = "",
    val target: String = "",
    val details: String = "",
    val createdAt: String = ""
)

@Serializable
data class NotificationItem(
    val id: String = "",
    val title: String = "",
    val body: String = "",
    val timestamp: String = "",
    val read: Boolean = false
)

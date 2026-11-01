package com.maqraah.imamaljazari.repository

import com.maqraah.imamaljazari.data.AdminPermission
import com.maqraah.imamaljazari.data.AuditLog
import com.maqraah.imamaljazari.data.ChatMessage
import com.maqraah.imamaljazari.data.GroupChat
import com.maqraah.imamaljazari.data.NotificationItem
import com.maqraah.imamaljazari.data.PaymentPackage
import com.maqraah.imamaljazari.data.PaymentRequest
import com.maqraah.imamaljazari.data.Program
import com.maqraah.imamaljazari.data.RegistrationRequest
import com.maqraah.imamaljazari.data.SampleData
import com.maqraah.imamaljazari.data.SupportContact
import com.maqraah.imamaljazari.data.UserProfile
import com.maqraah.imamaljazari.data.UserRole
import com.maqraah.imamaljazari.data.WalletTransaction

class AppRepository {
    fun getPrograms(): List<Program> = SampleData.programs

    fun getPaymentPackages(): List<PaymentPackage> = SampleData.paymentPackages

    fun getSupportContact(): SupportContact = SampleData.supportContact

    fun getRoles(): List<UserRole> = SampleData.roles

    fun getPermissions(): List<AdminPermission> = SampleData.adminPermissions

    fun getWalletTransactions(): List<WalletTransaction> = SampleData.walletTransactions

    fun getGroups(): List<GroupChat> = SampleData.groups

    fun getMessages(groupId: String): List<ChatMessage> = SampleData.messages.filter { it.groupId == groupId }

    fun getNotifications(): List<NotificationItem> = SampleData.notifications

    fun getAuditLogs(): List<AuditLog> = SampleData.auditLogs

    fun getProfile(): UserProfile = UserProfile(
        id = "student_1",
        userId = "student_1",
        fullName = "عبدالله محمد",
        phone = "0990161372",
        email = "student@maqraah.example",
        country = "إثيوبيا",
        city = "أديس أبابا",
        gender = "ذكر",
        birthDate = "2005-05-15",
        status = "active",
        currentBalanceMinutes = 260,
        role = "student"
    )

    fun submitRegistration(request: RegistrationRequest): Result<String> {
        return if (request.fullName.isBlank() || request.phone.isBlank()) {
            Result.failure(IllegalArgumentException("يجب إدخال الاسم الشخصي ورقم الهاتف."))
        } else {
            Result.success("تم تقديم طلب التسجيل بنجاح، وسيتم مراجعته من الإدارة.")
        }
    }

    fun submitPaymentRequest(request: PaymentRequest): Result<String> {
        return if (request.senderName.isBlank() || request.transactionNumber.isBlank()) {
            Result.failure(IllegalArgumentException("يجب إدخال اسم المرسل ورقم العملية."))
        } else {
            Result.success("تم إرسال طلب الدفع بنجاح، وسيتم مراجعته من الإدارة.")
        }
    }
}
